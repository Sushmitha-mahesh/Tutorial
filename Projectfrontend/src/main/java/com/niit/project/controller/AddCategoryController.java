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

import com.niit.pendent.dao.CategoryDao;
import com.niit.pendent.model.Category;

@Controller
public class AddCategoryController {
	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	Category category;

	@RequestMapping(value="/addcategory")
	public ModelAndView addcategory(Model model)
	{
		System.out.println(1);
		List<Category> lcategory=(List<Category>)categoryDao.list();
		if(lcategory==null || lcategory.isEmpty())
		{
	      System.out.println("sorry");
		}
		for(Category p :lcategory)
		{
			System.out.println(p.getC_DESCRIPTION());
			System.out.println(p.getC_Id());
			System.out.println(p.getC_NAME());
			
		}
		ModelAndView obj=new ModelAndView("addcategory");
		obj.addObject("chose","jfdjfjfjfj");
		obj.addObject("user",category);
		obj.addObject("list", lcategory);
		//model.addAttribute("hi", "Hi welcome to my website");
		System.out.println("addcategory is working");
		return obj; 
	}

	@RequestMapping(value="/categoryValue",method =RequestMethod.POST)
	public ModelAndView addcategory(@ModelAttribute("Category")Category category,HttpSession session)
	{
		    System.out.println("i am coming");
			ModelAndView obj=new ModelAndView("index");
			System.out.println("*****************************");
			System.out.println(category.getC_NAME());
			System.out.println(category.getC_DESCRIPTION());
			System.out.println("****************************");
			if(session.getAttribute("cat")==null){
		System.out.println("sorry");
    	
			if(categoryDao.saveorupdate(category)==true)
				{ 
				System.out.println("*****************************");
				System.out.println(category.getC_NAME());
				System.out.println(category.getC_DESCRIPTION());
				System.out.println("****************************");
					System.out.println("save and update is working");
					 
				  
				}
			else
			{
				System.out.println("sorry");
				return new ModelAndView("addcategory"); 
			}
			return obj;
		}
    	else
			{
    		Category c=(Category)session.getAttribute("cat");
    		category.setC_Id(c.getC_Id());
           
			if(categoryDao.saveorupdate(category)==true)
			{
				System.out.println("Edit is working");
			    				
			}
			return obj;
			}
	}
	@RequestMapping("cdelete/{C_Id}")
	public String delete(@PathVariable(value="C_Id") String id) throws Exception {
		System.out.println("Iam going to delete");
		categoryDao.delete(id);
		System.out.println("deleted and redirecting");
		return "redirect:/addcategory";
	}
		
	
	
	@RequestMapping("/cedit/{C_Id}")
	public String categoryEdit(@PathVariable("C_Id") String id, ModelMap model, HttpSession session) throws Exception {
		category = categoryDao.get(id);
		System.out.println(category.getC_NAME());
		session.setAttribute("cat", category);
		model.addAttribute("editCategory", category);
		model.addAttribute("lcategory", this.categoryDao.list());
		return "redirect:/addcategory";
	}
			
	


}


