package com.niit.pendent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.pendent.dao.BillingDao;

import com.niit.pendent.model.Billing;


public class BillingTest {
	public static void main(String a[])
	  {
		  AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		  context.scan("com.niit.*");
		  context.refresh();
		  System.out.println(3);
		  BillingDao billingDao = (BillingDao) context.getBean("billingDao");
		  Billing  billing= (Billing) context.getBean("billing");
		  
		  System.out.println(1);
		 /* Customer obj1= new Customer();
			obj1.setCustomer_id("customerC286E0");
			*/
		 // Billing c=(Billing)billingDao.get("customerC286E0");
		  billing.setB_id("billing2345h");
		  billing.setB_address("fkjhis");
		 
		  
		 
     
			 if(billingDao.saveorupdate(billing)==true)
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
