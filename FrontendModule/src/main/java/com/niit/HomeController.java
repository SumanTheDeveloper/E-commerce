package com.niit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController 
{
 @RequestMapping(value="/home")
 public String getHomePage(HttpServletRequest request)
 { 
	 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	 HttpSession session = request.getSession();
	 session.setAttribute("authenticate", auth);
	 session.setAttribute("loggedIn", true);
	 return "Home";	 
 }
 @RequestMapping(value="/all/AdminPage")
 public String getAdminPage()
 {
	 return "AdminPage";	 
 }
 @RequestMapping(value="/all/AboutPage")
 public String getAboutusPage()
 {
	 return "AboutUs";	 
 }
 @RequestMapping("/login")
	public String login()
    {
	 
		return "Login";
	}
 @RequestMapping(value="/loginerror")
 public String loginError(Model model)
  {
 	model.addAttribute("Error","Invalid EmailID OR Password!!!");
 	return "Login";
   }
	@RequestMapping(value="/logout")
	public String logout(Model model, HttpServletRequest request, HttpServletResponse response)
	{
		model.addAttribute("message","Loggedout successfully..");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth != null)
		{
		 new SecurityContextLogoutHandler().logout(request,response,auth);	
		}
		return "Login";
	}
  @RequestMapping(value="/all/Header")
	public String getStartPage(){
		return "Home";
	}
  @RequestMapping(value="/loginsuccess")
 	public String loginSuccess(){
 		return "Product";
 	}
}
