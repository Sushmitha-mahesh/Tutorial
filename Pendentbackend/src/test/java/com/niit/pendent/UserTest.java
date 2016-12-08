package com.niit.pendent;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.pendent.dao.UserDao;
import com.niit.pendent.model.User;

public class UserTest {
	public static void main(String a[])
	  {
		  AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		  context.scan("com.niit.*");
		  context.refresh();
		  
		  UserDao userDao = (UserDao) context.getBean("userDao");
		  User  user= (User) context.getBean("user");
		  System.out.println(1);
		  user.setUser_id("hgf345");
		  user.setUser_fname("love");
		  user.setUser_lname("gcfk");
		  user.setEmail("su@gmail.com");
		  user.setPassword("sasa");
		
		  
 		  user.setRole_name("ROLE_USER");
 		  user.setMobile_number(974122764);
		  
		  
		  if(userDao.saveorupdate(user)==true)
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
