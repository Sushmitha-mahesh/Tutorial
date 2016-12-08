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
import org.springframework.web.servlet.ModelAndView;

import com.niit.pendent.dao.SupplierDao;
import com.niit.pendent.model.Category;
import com.niit.pendent.model.Supplier;

@Controller
public class AddSupplierController {
	@Autowired
	SupplierDao supplierDao;
	
	@Autowired
	Supplier supplier;
	
	
	
	@RequestMapping(value="/addsupplier")
	public ModelAndView addsupplier(Model model)
	{
		ModelAndView obj=new ModelAndView("addsupplier");
		System.out.println(1);
		List<Supplier> lsupplier=(List<Supplier>)supplierDao.list();
		if(lsupplier==null || lsupplier.isEmpty())
		{
	      System.out.println("sorry");
		}
		for(Supplier p :lsupplier)
		{
			System.out.println(p.getS_id());
			System.out.println(p.getS_name());
			System.out.println(p.getS_address());
			System.out.println(p.getS_description());
		}
	
		//obj.addObject("chose","jfdjfjfjfj");
		obj.addObject("supplier",supplier);
		obj.addObject("list",lsupplier);
		//model.addAttribute("hi", "Hi welcome to my website");
		System.out.println("addsupplier is working");
		return obj; 
	}
	
	
	@RequestMapping(value="/addsupplierValue",method = RequestMethod.POST)
	public ModelAndView supplier(@ModelAttribute("supplier")Supplier supplier, HttpSession session)
	{
		    System.out.println("i am coming");
			ModelAndView obj=new ModelAndView("index");
			System.out.println("*****************************");
			System.out.println(supplier.getS_name());
			System.out.println(supplier.getS_address());
			System.out.println(supplier.getS_description());
			System.out.println("****************************");
			if(session.getAttribute("sup")==null){
				System.out.println("sorry");
			if(supplierDao.saveorupdate(supplier)==true)
				{ 
				System.out.println("*****************************");
				System.out.println(supplier.getS_name());
				System.out.println(supplier.getS_address());
				System.out.println(supplier.getS_description());
				System.out.println("****************************");
					System.out.println("save and update is working");

				}
			   else
			{
				System.out.println("sorry");
				return new ModelAndView("addsupplier"); 
			}
		    return obj;
		 }
	    else
	    {   

			Supplier s1=(Supplier)session.getAttribute("sup");
	    	supplier.setS_id(s1.getS_id());
		if(supplierDao.saveorupdate(supplier)==true)
		{
			System.out.println("Edit is working");
		    				
		}
		return obj; 
		}
			
}
	@RequestMapping("sdelete/{s_id}")
	public String delete(@PathVariable(value="s_id") String id) throws Exception {
		System.out.println("Iam going to delete");
		supplierDao.delete(id);
		System.out.println("deleted and redirecting");
		return "redirect:/addsupplier";
	}
		
	
	
	@RequestMapping("/sedit/{s_id}")
	public String categoryEdit(@PathVariable("s_id") String id, ModelMap model, HttpSession session) throws Exception {
		supplier = supplierDao.get(id);
		System.out.println(supplier.getS_name());
		session.setAttribute("sup", supplier);
		model.addAttribute("editsupplier", supplier);
		model.addAttribute("lsupplier", this.supplierDao.list());
		return "redirect:/addsupplier";
	}
			
	

}