package com.niit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.DAO.CustomerDAO;
import com.niit.Model.Customer;

@Controller
public class CustomerController 
{
	@Autowired
	private CustomerDAO customerDao;
	@RequestMapping(value="/all/getregistrationform")
	public String getRegistrationForm(Model model){
	Customer customer	=new Customer();
	model.addAttribute("customer",customer);	
	return "registrationform";	
	}
	@RequestMapping(value="/all/registercustomer")
	public String registerCustomer(@ModelAttribute Customer customer,Model model){
		String email=customer.getUser().getEmail();
		if(!customerDao.isEmailUnique(email))
		{
			model.addAttribute("errorMessage","Email already exists.. please choose different email id");
			return "registrationform";
		}
		customerDao.registerCustomer(customer);
		
		 return "redirect:/login";
	}
}
