package com.niit.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.pendent.dao.CartDao;
import com.niit.pendent.model.Cart;
import com.niit.pendent.model.User;

@Controller
public class CartController {
  @Autowired
  CartDao cartDao;
  
  @Autowired
  Cart  cart;
  
  @Autowired
  User user;
  
  @RequestMapping("/addtocart")
  public ModelAndView Cart(Model model,HttpSession session)
  {
	  System.out.println(1);
	  User u=(User)session.getAttribute("user");
	  if(u!=null)
	  {
		  System.out.println(u.getUser_fname());
	  }
	  else
	  {
	  System.out.println("sorry");
	  }
	  
	  return null;
  }
//  public String addtocart(Model model,HttpSession session)
//  {
//	  System.out.println("addtocart");
//	  ModelAndView obj=new ModelAndView("index");
//		User u=(User)session.getAttribute("user");
//		if(u==null){
//			System.out.println(1);
//			
//		}
//		return "redirect:/login";
//  }
  
  
  
  
  
  
}
