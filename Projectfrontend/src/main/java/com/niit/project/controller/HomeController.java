package com.niit.project.controller;

import java.awt.Desktop;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.pendent.dao.ProductDao;
import com.niit.pendent.model.Product;






@Controller
public class HomeController {
	
	@Autowired
	Product product;
 
	@Autowired
	ProductDao productDao;

	@RequestMapping("/") 
	public ModelAndView index() 
	{
		System.out.println(1);
        ModelAndView mv = new ModelAndView("index");
					return mv;
	
	}
	@RequestMapping("/index") 
	public ModelAndView home() 
	{
		System.out.println(1);
        ModelAndView mv = new ModelAndView("index");
					return mv;
	
	}
	
	@RequestMapping("/contact") 
	public ModelAndView contact() 
	{
		System.out.println(1);
        ModelAndView mv = new ModelAndView("contact");
					return mv;
	
	}	
	/*@RequestMapping("/login") 
	public ModelAndView login() 
	{
		System.out.println("working");
        ModelAndView mv = new ModelAndView("login");
					return mv;
	}
	
	@RequestMapping("/register") 
	public ModelAndView register() 
	{
		System.out.println(1);
        ModelAndView mv = new ModelAndView("register");
					return mv;
	
	}*/
	@RequestMapping("/open")
	public ModelAndView brow(){
		char c;
		int i1=0,l1=0;
		String a="pendentjwellery@yahoo.com";
		for(int i=0;i<a.length();i++)
		{
			c=a.charAt(i);
			if(c=='@')
				i1=i+1;
			if(c=='.')
			 l1=i;	
		}
		String id=a.substring(i1,l1);
		 System.out.println(id);
		try {
			
			Desktop d=Desktop.getDesktop();
			d.browse(new URI ("http://"+id+".com"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return  new ModelAndView("index");
	}

	@RequestMapping("/single/{p_id}") 
	public String Single(@PathVariable(value="p_id")String id,Model m) 
	{
		product=productDao.get(id);
		m.addAttribute("pro", product);
		System.out.println(1);
					return "single";
	
	}
	
  
		@RequestMapping("/products") 
	public ModelAndView products(Model model) 
	{
		List<Product>pro = (List<Product>)productDao.list();
		System.out.println(1);
        ModelAndView mv = new ModelAndView("products");
        Product prod = new Product();
        mv.addObject("pro",pro);
					return mv;
	
	}
	
        
     
	@RequestMapping("/singlepage") 
	public ModelAndView singlepage() 
	{
		System.out.println(1);
        ModelAndView mv = new ModelAndView("singlepage");
					return mv;
	
	}
	/*@RequestMapping("/products") 
	public ModelAndView products() 
	{
		System.out.println(1);
        ModelAndView mv = new ModelAndView("products");
					return mv;
	
	}*/
	@RequestMapping("/Checkout") 
	public ModelAndView Checkout() 
	{
		System.out.println(1);
        ModelAndView mv = new ModelAndView("Checkout");
					return mv;
	
	}

}
