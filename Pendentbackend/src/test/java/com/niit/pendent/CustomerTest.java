package com.niit.pendent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.pendent.dao.CartDao;
import com.niit.pendent.dao.CustomerDao;
import com.niit.pendent.dao.UserDao;
import com.niit.pendent.model.Cart;
import com.niit.pendent.model.Customer;
import com.niit.pendent.model.User;



public class CustomerTest {
	public static void main(String a[])
	  {
		  AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		  context.scan("com.niit.*");
		  context.refresh();
		  System.out.println(3);
		  
		  CustomerDao customerDao = (CustomerDao) context.getBean("customerDao");
		  Customer  customer= (Customer) context.getBean("customer");
		  UserDao userDao = (UserDao) context.getBean("userDao");
		  User user= (User) context.getBean("user");
		  CartDao cartDao = (CartDao) context.getBean("cartDao");
		  Cart  cart= (Cart) context.getBean("cart");
          Customer cus=(Customer)customerDao.get("user62A31F");
          if(cus==null)
          {
        	  User u=(User)userDao.get("user62A31F");
        	  System.out.println("not a user");
          

		  System.out.println(1);
		 
		  customer.setCustomer_name(u.getUser_fname());
		  customer.setCustomer_email(u.getEmail());
		  customer.setCustomerphone(u.getMobile_number());
		  //customer.setB_id("bil345");
		 // customer.setCart_id("cart5678");
		  //customer.setS_id("ship908");
	  	  customer.setUser_id(u.getUser_id());
	  	  if(customerDao.save(customer)==true){
	  		  System.out.println("new customer");
	  	  }
	  	  
	  	  else{
	  		  System.out.println("cart is present");
	  	  }
          }	  
          Cart c1= (Cart)cartDao.get(cus.getCustomer_id());
		   if(c1==null)
		   {
			   System.out.println("u dont have a cart");
              cart.setCustomer(cus);			   
			   if(cartDao.saveorupdate(cart)==true)
			   {
				   cus.setCart(cart);
				   if(customerDao.update(cus)==true)
				   {
					   System.out.println("Update is done");
				   }
				   System.out.println("new cart is created");
			   }
		   }
				   else
				   {
					   System.out.println("u hv  a cart");
				   }
				  
			   }
		  }
	  

		   

