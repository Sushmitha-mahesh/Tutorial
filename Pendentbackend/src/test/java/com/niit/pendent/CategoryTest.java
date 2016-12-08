package com.niit.pendent;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.pendent.dao.CategoryDao;
import com.niit.pendent.model.Category;

public class CategoryTest {
	public static void main(String a[])
	   {
		   AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		   context.scan("com.niit.*");
		   context.refresh();
		   
		   CategoryDao categoryDao =(CategoryDao)context.getBean("categoryDao");
		   Category category=(Category)context.getBean("category");
		   System.out.println(1);
		   
          // category.setC_Id("hu5685");
		   category.setC_NAME("bhg");
		   category.setC_DESCRIPTION("kjhifd");
		   System.out.println(2);
		   
		   if(categoryDao.saveorupdate(category)==true)
			{
				System.out.println(3);
				System.out.println("saved");
			}
		   else
			{
				System.out.println(4);
				System.out.println("sorry");
			}
		   
//		   if(categorydetailsDao.delete("hu5685")==true)
//		   {
//			   System.out.println("done");
	//	
//		   }
//		   else
//		   {
//			   System.out.println("sorry");
//		   }
		   
		   Category l1= (Category)categoryDao.get("hu5685");
		     if(l1==null)
		     {
		    	 System.out.println("there is no record found");
		     }
		     else
		     {
		    	 System.out.println(l1.getC_Id()+l1.getC_NAME()+l1.getC_DESCRIPTION());
		     }
		 

		     List<Category> lcategory=(List<Category>) categoryDao.list();
		     if(lcategory==null || lcategory.isEmpty())
				{
					System.out.println("no data found");
				}
		     else
		     {
		    	for(Category p:lcategory)
		    	 {
		    		 System.out.println(p.getC_Id());
		    		 System.out.println(p.getC_NAME());
		    		 System.out.println(p.getC_DESCRIPTION());
		    	 }
		     }
	  }
			

}
