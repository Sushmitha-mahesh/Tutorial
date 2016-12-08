package com.niit.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.pendent.dao.UserDao;
import com.niit.pendent.model.User;

@Controller
public class LoginControl {
	@Autowired
    UserDao userDao;

	/*@RequestMapping("/login")
	public ModelAndView Login() {
		ModelAndView obj = new ModelAndView("login");
		obj.addObject("chose", "Hi");
		// model.addAttribute("hi", "Hi welcome to my website");
		System.out.println("login is working");
		return obj;
	}*/
	
	@RequestMapping("/login")
	public String login(@RequestParam(value="error",required=false) String error, @RequestParam(value="logout",required=false) String logout, Model model){
			if(error!=null)
		model.addAttribute("error","Invalid username and password");
		
		if(logout!=null)
			model.addAttribute("logout","You have logged out successfully");
		return "login";

 
}
 @RequestMapping("/j_spring_security_check") 
 public ModelAndView sub(@RequestParam("email")String e,@RequestParam("password")String pwd,HttpSession session, HttpServletRequest request)
	{
		System.out.println(e+" "+pwd);
		ModelAndView obj=new ModelAndView("index");
		User u=(User)userDao.isvalidate(e, pwd);
		if(u==null)
		{
		ModelAndView obj1=new ModelAndView("login");
		obj1.addObject("mes","login failed");
		
		session.setAttribute("s", "false");
	       return obj1;  
		}
		else
		{
			    
			    request.getSession().setAttribute("user", u);
			    session.setAttribute("user", u);
			    session.setAttribute("username",u.getUser_fname());
			    session.setAttribute("s","true");
		    	if(u.getRole_name()=="ROLE_ADMIN") System.out.println("welcome Admin");
		    	if(u.getRole_name()=="ROLE_USER")System.out.println("welcome User");
		    	System.out.println("login is working");
		    	return obj; 
		}
	
		//model.addAttribute("hi", "Hi welcome to my website");
		}
	
	
	@RequestMapping("/logout")
	public ModelAndView Logout(HttpSession session,HttpServletRequest request)
	{
		ModelAndView obj=new ModelAndView("index");
		session.invalidate();
		session=request.getSession(true); 
		obj.addObject("chose","");
		//model.addAttribute("hi", "Hi welcome to my website");
		System.out.println("logout is working");
		return obj; 
	}
	/*@RequestMapping("/sub")
	public ModelAndView sub(@RequestParam("email") String e, @RequestParam("pwd") String pwd, HttpSession session) {
		System.out.println(e + " " + pwd);
		ModelAndView obj = new ModelAndView("index");
		User u = (User) userDao.isvalidate(e, pwd);
		if (u == null) {
			ModelAndView obj1 = new ModelAndView("login");
			obj1.addObject("mes", "login failed");

			session.setAttribute("s", "false");
			return obj1;
		} else {
			session.setAttribute("user", u);
			session.setAttribute("username", u.getUser_fname());
			if (u.getRole_name() == "ROLE_ADMIN")
				System.out.println("welcome admin");

			if (u.getRole_name() == "ROLE_USER")
				System.out.println("welcome user");
			System.out.println("login is working");
			return obj;
		}
		// model.addAttribute("hi", "Hi welcome to my website");

	}

	@RequestMapping("/logout")
	public ModelAndView Logout(HttpSession session, HttpServletRequest request) {
		ModelAndView obj = new ModelAndView("index");
		session.invalidate();
		session = request.getSession(true);
		obj.addObject("chose", "");
		System.out.println("logout is working");
		return obj;

	}*/

}
