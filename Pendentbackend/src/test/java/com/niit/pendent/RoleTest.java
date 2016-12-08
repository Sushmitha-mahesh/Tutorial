package com.niit.pendent;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.pendent.dao.RoleDao;
import com.niit.pendent.model.Role;

public class RoleTest {
	public static void main(String a[])
	   {
		   AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
			context.scan("com.niit.*");
			context.refresh();
			
			RoleDao roleDao=(RoleDao)context.getBean("roleDao");
			Role role=(Role)context.getBean("role");
			System.out.println(1);
		
			
			role.setROLE_ID("fnk3");
			role.setROLE_USER("ROLE_USER");
			role.setUSERNAME("z@gmail.com");
			role.setENABLED("true");
			
			System.out.println(2);
			
			if(roleDao.save(role)==true)
			{
				System.out.println(3);
				System.out.println("saved");
			}
			else
			{
			System.out.println(4);
			System.out.println("sorry");
			}
			
			/*if(roleDao.delete("hdhhh1022")==true)
			{
				System.out.println("done");
			}
			else
			{
				System.out.println("sorry");
			}			
			
			
			
			Role l1 = (Role)roleDao.get("hdhhh1022");
			if(l1==null)
			{
				System.out.println("there is no record found");
			}
			else
			{
				System.out.println(l1.getROLE_ID()+l1.getUSERNAME()+l1.getUSERNAME());
			}
			
			
*/			List<Role> lrole=(List<Role>) roleDao.list();
			if(lrole==null || lrole.isEmpty())
			{
				System.out.println("no data found");
			}
			else
			{
				for(Role p:lrole)
				{
					System.out.println(p.getROLE_ID());
					System.out.println(p.getROLE_USER());
					System.out.println(p.getUSERNAME());
					System.out.println(p.getENABLED());			
				}
			}
	   }
		


}
