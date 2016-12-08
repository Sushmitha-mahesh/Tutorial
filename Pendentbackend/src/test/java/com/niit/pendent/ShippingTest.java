package com.niit.pendent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.pendent.dao.ShippingDao;
import com.niit.pendent.model.Customer;
import com.niit.pendent.model.Shipping;



public class ShippingTest {
	public static void main(String a[])
	  {
	 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	  context.scan("com.niit.*");
	  context.refresh();
	  System.out.println(3);
	  ShippingDao shippingDao = (ShippingDao) context.getBean("shippingDao");
	  Shipping  shipping= (Shipping) context.getBean("shipping");
	  System.out.println(1);
	  shipping.setS_id("billing2345h");
	  shipping.setS_address("fkjhis");
	  Customer obj1= new Customer();
		obj1.setCustomer_id("customerC286E0");

		 if(shippingDao.saveorupdate(shipping)==true)
		  {
			  System.out.println("done");
		  }
		  else
		  {
			  System.out.println("Sorry");
		  }
		  System.out.println(2);
		  
	  
}

}
