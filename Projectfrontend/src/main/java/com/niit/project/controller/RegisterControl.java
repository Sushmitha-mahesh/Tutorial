package com.niit.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.pendent.dao.RoleDao;
import com.niit.pendent.dao.UserDao;
import com.niit.pendent.model.Role;
import com.niit.pendent.model.User;

@Controller
public class RegisterControl {
	@Autowired
	 UserDao userDao;
	
	@Autowired
	 User user;
	
	@Autowired
	Role role;
	
	@Autowired
    RoleDao roleDao;
	
	@RequestMapping(value="/register" )
	public ModelAndView register(Model model)
	{
		System.out.println("register");
		ModelAndView obj=new ModelAndView("register");
		obj.addObject("chose","jfdjfjfjfj");
		obj.addObject("user",user);
		//model.addAttribute("hi", "Hi welcome to my website");
		System.out.println("register is working");
		return obj; 
	}
	
	
	@RequestMapping(value="/Submit",method =RequestMethod.POST)
	public ModelAndView user(@ModelAttribute("user")User user,@RequestParam("pwd2")String a)
	{
		System.out.println(100);
		if(user.getPassword().equals(a))
		{
			ModelAndView obj=new ModelAndView("index");
			System.out.println("*****************************");
			System.out.println(user.getUser_fname());
			System.out.println(user.getUser_lname());
			//System.out.println(user.getUser_id());
			System.out.println(user.getEmail());
			System.out.println(user.getMobile_number());
			System.out.println(user.getPassword());	
			System.out.println("****************************");
			if(userDao.saveorupdate(user)==true)
				{ 
				   role.setUSERNAME(user.getEmail());
				   if(roleDao.save(role)== true)
				   {
					   System.out.println(3);
					   System.out.println("saved");
				   }
					System.out.println("save and update is working");
				    return obj;
				}
			else
			{
				System.out.println("sorry");
				return new ModelAndView("register"); 
			}
		 }
			else
			{
				ModelAndView obj=new ModelAndView("register");
				System.out.println(200);
				obj.addObject("password", "password is wrong");
				return obj;		
				
			}
	}


}
