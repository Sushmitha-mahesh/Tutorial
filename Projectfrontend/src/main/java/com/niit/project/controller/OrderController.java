package com.niit.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.pendent.dao.OrdersDao;
import com.niit.pendent.dao.ProductDao;
import com.niit.pendent.dao.UserDao;
import com.niit.pendent.model.Orders;
import com.niit.pendent.model.Product;
import com.niit.pendent.model.User;

@Controller
public class OrderController {
	
	@Autowired
	Orders orders;
	
	@Autowired
	User user;
	
	@Autowired
	Product product;
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	OrdersDao ordersDao;
	
	@Autowired
	UserDao userDao;
	@RequestMapping("/buy")
	public String Buyall(Model model,HttpSession session)throws Exception
	{
		return "shippingaddress";
	}
   
	@RequestMapping("/buy/{p_id}")
	public String Buy(@PathVariable("p_id")String p_id,Model model,HttpSession session)throws Exception
	{
		System.out.println(1+" "+p_id);
		System.out.println(p_id);
		product=(Product)productDao.get(p_id);
		if(product==null)
		{
			System.out.println("sorry");
		}
		else
		{
			System.out.println("product="+product.getP_name()+" "+product.getP_price()+" "+product.getP_quantity()+" "+product.getP_description()+" "+product.getCategory()+" "+product.getSupplier()+" "+product.getImg());
		}
		session.setAttribute("pro", product);
//		model.addAttribute("buy", product);
//		model.addAttribute("pro1", this.productDao.list());
		return "shippingaddress";

//		return "index";
	}
	
//	@RequestMapping("/shipping/{p_Id}")
//	public ModelAndView Shipping(@PathVariable("p_Id")String p_Id)
//	{    System.out.println(1);
//		ModelAndView obj= new ModelAndView("shippingaddress");
//		Product product= productDao.get(p_Id);
////		product=(Product)productDao.get(p_Id);
//		return obj;
//	}

		

	
	@RequestMapping("/BillingAddress")
	public ModelAndView Billing(@RequestParam("ShippingAddress") String sa){
		ModelAndView obj= new ModelAndView("billingadress");
		orders.setS_address(sa);
		return obj;
		
	}
	@RequestMapping("/Payment")
	public ModelAndView Payment(@RequestParam("BillingAddress") String sa){
		ModelAndView obj= new ModelAndView("paymentmethod");
		orders.setB_address(sa);
		return obj;
		
	}
	@RequestMapping("/ConfirmOrder")
	public ModelAndView confirmorder(@RequestParam("opt") String sa){
		ModelAndView obj= new ModelAndView("thankyou");
		orders.setPayment(sa);
		System.out.println(8);
		Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
		System.out.println(9);
		if(!(authentication instanceof AnonymousAuthenticationToken))
		{
			System.out.println(10);
			String currentUserName= authentication.getName();
			System.out.println(currentUserName);
			user=(User)userDao.getByEmail(currentUserName);
			if(user==null)
			{
				System.out.println("sorry");
			}
			else
			{
		         System.out.println("Hi");
		         Orders ord=new Orders();
		         ord.setPayment(sa);
		         ord.setB_address(orders.getB_address());
		         ord.setS_address(orders.getS_address());
		         ord.setUser_id(user.getUser_id());
		         ord.setP_id(product.getP_id());
		         ord.setTotalprice(product.getP_price()); 
					if(ordersDao.saveorupdate(ord)==true)
				{
					System.out.println("web flow is completed");
				}
			}
//		if(user==null)
//		{
//			System.out.println("sorry i am not coming");
//		}
		
	
	}
		return obj;
}
	@RequestMapping("/Cancel")
	public ModelAndView cancel(){
		ModelAndView obj= new ModelAndView("redirect:"+"/");
		return obj;
		
	}
}
