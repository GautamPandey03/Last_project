package com.SpringJdbcApp.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.SpringJdbcApp.bean.Customer;
import com.SpringJdbcApp.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	CustomerService c;
	@GetMapping("add")
	public String Add(Model m)
	{
		m.addAttribute("cust", new Customer());//cust sent to Addcustomer page as customer object
		return "AddCustomer";
	}
	@PostMapping("newcus")
	public String addCustomer(@ModelAttribute Customer cust,Model m)//cust=cust
	{
		System.out.println(cust);
		System.out.println(c.AddCustomer(cust));
		m.addAttribute("info", "Customer Added");
		m.addAttribute("cust", new Customer());//remove the previous value from cust object so that new value can insert
		
		return "AddCustomer";
		
	}
	@GetMapping("showAll")
	public String ShowAllCustomers(Model m)
	{
		List<Customer>  listall = c.ShowAll();
		m.addAttribute("allcustomers", listall);
		return "ShowAllCustomer";
	}
	@GetMapping("delete/{id}")
	public String DeleteCustomer(@PathVariable String id,Model m)
	{
		String res="";
		int cuid=Integer.parseInt(id);
	
		System.out.println(id);
		if(c.DeleteCustomer(cuid).equals("success"))
		{
			res="redirect:/showAll";
		}
		return res;
	}
	@GetMapping("Modify/{id}")
		public String EditCustomer(@PathVariable String id,Model m)
		{
			int cid=Integer.parseInt(id);
			Customer cus=c.SearchCustomer(cid);
			m.addAttribute("cust",cus);
			return "ModCustomer";
		}
	@PostMapping("updateCustomer")
	public String update(@ModelAttribute Customer cust,Model m)
	{
		String str=c.UpdateCustomer(cust);
		//m.addAttribute("cust",cus);
		return "redirect:/showAll";
	}
	

}
