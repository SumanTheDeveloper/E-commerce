package com.niit.DAO;

import com.niit.Model.Customer;
import com.niit.Model.User;

public interface CustomerDAO 
{
	void registerCustomer(Customer customer);
	boolean isEmailUnique(String email);
	User getUser(String email);
}
