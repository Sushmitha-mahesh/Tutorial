package com.niit.pendent;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.pendent.dao.SupplierDao;
import com.niit.pendent.model.Supplier;

public class SupplierTest {
	public static void main(String a[])
	 {
		 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		 context.scan("com.niit.*");
		 context.refresh();
		 
		 SupplierDao supplierDao  =(SupplierDao )context.getBean("supplierDao");
		 Supplier supplier=( Supplier)context.getBean("supplier");
		   System.out.println(1);
		   
		   supplier.setS_name("asd");
		   supplier.setS_address("bangalore");
		   supplier.setS_description("hi");
		   System.out.println(2);
		   
		   if(supplierDao.saveorupdate(supplier)==true)
			{
				System.out.println(3);
				System.out.println("saved");
			}
		   else
			{
				System.out.println(4);
				System.out.println("sorry");
			}
		   
	        /*if(supplierDao.delete("supplierAD")==true)
	        {
	        	System.out.println("done");
	        }
	        else
	        {
	        	System.out.println("sorry");
	        }*/

	     Supplier l1= (Supplier)supplierDao.get("hdmk568");
	     if(l1==null)
	     {
	    	 System.out.println("there is no record found");
	     }
	     else
	     {
	    	 System.out.println(l1.getS_id()+l1.getS_name()+l1.getS_description());
	     }
	     
	     List<Supplier> lsupplier=(List<Supplier>) supplierDao.list();
	     if(lsupplier==null || lsupplier.isEmpty())
			{
				System.out.println("no data found");
			}
	     else
	     {
	    	 for(Supplier p:lsupplier)
	    	 {
	    		 System.out.println(p.getS_id());
	    		 System.out.println(p.getS_name());
	    		 System.out.println(p.getS_description());
	    		 System.out.println(p.getS_address());
	    	 }
	    		 
	     }
	 }


}
