package com.SpringJdbcApp.service;

import java.util.List;

import com.SpringJdbcApp.bean.Customer;

public interface CustomerService {

		public String AddCustomer(Customer c);
		public List<Customer> ShowAll();
		public Customer SearchCustomer(int cid);
		public String UpdateCustomer(Customer c);
		public String DeleteCustomer(int cid);
		public Customer CheckuserDetails(String email, String pwd);	
		String updatePassword(String email, String newp);
	}



