package com.SpringJdbcApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.SpringJdbcApp.bean.Customer;
@Service
public class ServiceApp implements CustomerService{
	@Autowired
	JdbcTemplate  jt;

	@Override
	public String AddCustomer(Customer c) {
		// TODO Auto-generated method stub
		String res = "Error";
		String sql = "Insert into customer(firstName, middleName, lastName, emailAddress, password) values(?,?,?,?,?)";
		int r = jt.update(sql, new Object[] {c.getFirstname(), c.getMiddlename(), c.getLastname(), c.getEmailaddress(), c.getPassword()});
		if(r>=1)
			res ="Success";
		return res;
		
	}

	@Override
	public List<Customer> ShowAll() {
		// TODO Auto-generated method stub
		String sql = "Select id,firstname,middlename,lastname,emailaddress,password from Customer";
		List<Customer>  cusInfo = jt.query(sql, new BeanPropertyRowMapper(Customer.class));
		return cusInfo;
	}

	@Override
	public Customer SearchCustomer(int cid) {
		// TODO Auto-generated method stub
		Customer customer = null;
		try
		{			
			String sql = "Select * from customer where id=?";
			customer = (Customer)jt.queryForObject(sql, new Object[] {cid}, new BeanPropertyRowMapper(Customer.class));
		}
		catch(Exception ex)
		{
			customer = null;
		}
		return customer;
	}

	@Override
	public String UpdateCustomer(Customer c) {
		// TODO Auto-generated method stub
		String res = "Error";
		String sql = "update customer set firstName=?, middleName=?, lastName=?, emailAddress=? where id=?";
		int r = jt.update(sql, new Object[] {c.getFirstname(), c.getMiddlename(), c.getLastname(), c.getEmailaddress(), c.getId()});
		if(r>=1)
			res ="Success";
		return res;
		
	}

	@Override
	public String DeleteCustomer(int cid) {
		// TODO Auto-generated method stub
		String sql="delete from customer where id=?";
		String s="Error";
		int r=jt.update(sql, new Object[] {cid});
		if(r>=1)
		{
			s="success";
		}
		
		return s;
	}

	@Override
	public Customer CheckuserDetails(String email, String pwd) {
		// TODO Auto-generated method stub
		Customer customer = null;
		try
		{			
			String sql = "Select * from customer where emailaddress=? and password=?";
			customer = (Customer)jt.queryForObject(sql, new Object[] {email, pwd}, new BeanPropertyRowMapper(Customer.class));
		}
		catch(Exception ex)
		{
			customer = null;
		}
		return customer;
	}
	@Override
	public String updatePassword(String email, String newp) {
		// TODO Auto-generated method stub
		String str="error";
		String sql="update customer set password=? where emailaddress=?";
		int n=jt.update(sql,new Object[] {newp,email});
		if(n<=1)
		{
		str="success";	
		}
		return str;
	}

	
	

}
