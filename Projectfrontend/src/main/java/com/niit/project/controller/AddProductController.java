package com.niit.project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.pendent.dao.CategoryDao;
import com.niit.pendent.dao.ProductDao;
import com.niit.pendent.dao.SupplierDao;
import com.niit.pendent.model.Category;
import com.niit.pendent.model.Product;
import com.niit.pendent.model.Supplier;
import com.niit.project.fileupload.FileUpload;

@Controller
public class AddProductController {
	@Autowired
	ProductDao productDao;
	
	@Autowired
	Product product;
	
	@Autowired
	Category category;
	
	@Autowired
	Supplier supplier;
	
	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	SupplierDao supplierDao;
	
	
   String path="C:\\Users\\Dell Pc\\workspace\\Projectfrontend\\src\\main\\webapp\\resources\\images\\";
	
	@RequestMapping(value="/addproduct" )
	public ModelAndView addproduct(Model model)
	{
		ModelAndView obj=new ModelAndView("addproduct");
		System.out.println(1);
		List<Product> lproduct=(List<Product>)productDao.list();
		List<Supplier> lsupplier=(List<Supplier>)supplierDao.list();
		List<Category> lcategory=(List<Category>)categoryDao.list();


		if(lproduct==null || lproduct.isEmpty())
		{
		   System.out.println("sorry");
	     
		}
		for(Product product :lproduct)
		{
			System.out.println(product.getP_id());
			System.out.println(product.getP_name());
			System.out.println(product.getP_price());
			System.out.println(product.getP_quantity());
			System.out.println(product.getP_description());
		}

		
		//obj.addObject("chose","jfdjfjfjfj");
		Category cat=new Category();
		product.setCategory(cat);
		Supplier sup=new Supplier();
		product.setSupplier(sup);
		obj.addObject("product",product);
		obj.addObject("lproduct",lproduct);
		obj.addObject("lcategory",lcategory);
		obj.addObject("lsupplier",lsupplier);
		//model.addAttribute("hi", "Hi welcome to my website");
		System.out.println("addproduct is working");
		return obj; 
	}
	
	
	@RequestMapping(value="/addproductValue",method= RequestMethod.POST)
	public ModelAndView product(@ModelAttribute("product")Product product,@RequestParam("cat")String id1,@RequestParam("sup")String id2, HttpSession session)
	{
		    System.out.println("i am coming");
			ModelAndView obj=new ModelAndView("redirect:"+"/addproduct");
			System.out.println(id1+" "+id2+" ");
			Category category=(Category)categoryDao.get(id1);
			product.setCategory(category);
			Supplier supplier=(Supplier)supplierDao.get(id2);
			product.setSupplier(supplier);
			System.out.println("*****************************");
			System.out.println(product.getP_name());
			System.out.println(product.getP_price());
			System.out.println(product.getP_quantity());
			System.out.println(product.getP_description());
			System.out.println("****************************");
			/*
			Category obj1= new Category();
			obj1.setC_Id("category77BDFC");
			
			Supplier obj2= new Supplier();
			obj2.setS_id("supplierE9");
			product.setCategory(obj1);
			product.setSupplier(obj2);
			*/
			if(session.getAttribute("pro")==null)
			{
			if(productDao.saveorupdate(product)==true)
				{ 
				
				   System.out.println(product.getP_name());
				   System.out.println(product.getP_description());
				   FileUpload.upload(path,product.getImg(),product.getP_id()+".jpg");
				   product.setImage(product.getP_id()+".jpg");
				    productDao.saveorupdate(product);
					System.out.println("save and update is working");
					
				}
			
			else
			{
				System.out.println("sorry");
			return new ModelAndView("addproduct"); 
			}
			
		    return obj;
		 }
			else
		    {
				Product d=(Product)	session.getAttribute("pro");
		    	product.setP_id(d.getP_id());
			//ModelAndView d1 = new ModelAndView("redirect:"+"/addproduct");
			if(productDao.saveorupdate(product)==true)
			{
				System.out.println("Edit is working");
			    				
			}
			return obj; 
			}
	}
	@RequestMapping("pdelete/{p_id}")
	public String delete(@PathVariable(value="p_id") String id) throws Exception {
		System.out.println("I am going to delete");
		productDao.delete(id);
		System.out.println("deleted and redirecting");
		return "redirect:/addproduct";
	}
		
	
	
	@RequestMapping("/pedit/{p_id}")
	public String categoryEdit(@PathVariable("p_id") String id, ModelMap model, HttpSession session) throws Exception {
		product = productDao.get(id);
		System.out.println(product.getP_name());
		session.setAttribute("pro", product);
		model.addAttribute("editproduct", product);
		model.addAttribute("lproduct", this.productDao.list());
		return "redirect:/addproduct";
	}
}