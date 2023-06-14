package com.SpringJdbcApp.test;
import com.SpringJdbcApp.bean.Customer;
import com.SpringJdbcApp.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@Autowired
	CustomerService cs;
	
	@GetMapping("/")
	public String LoginPage()
	{
		return "Login";
	}
	
	
	@GetMapping("login")
	public String LoginPage(Model m)
	{		
		return "Login";
	}
	
	@PostMapping("LogProcess")
	public String LoginPage(@RequestParam String txtUser, 
			@RequestParam String txtPass, Model m)
	{
		String page="";
		
		if(txtUser.equalsIgnoreCase("admin") && txtPass.equalsIgnoreCase("admin@1234"))
		{
			page = "redirect:showAll";
		}
		else
		{
			Customer cus = cs.CheckuserDetails(txtUser, txtPass);
			if(cus!=null)
			{
				m.addAttribute("cust",cus);
				page = "Welcome";
			}
			else
			{
				page = "Login";
				m.addAttribute("info", "Please check username / password");
			}
		}
		return page;
	}
	@GetMapping("Change/{id}")
	public String ChangePassword(@PathVariable String id,Model m)
	{
		//m.addAttribute("cust",id);
		System.out.println(id);
		return "ChangePaasword";
	}
	
	@PostMapping("changePass")
	public String ChangePassword(@RequestParam String email,@RequestParam String old, 
	@RequestParam String newp,@RequestParam String conf, Model m)
	{
		System.out.println("gautam pandey");
		String page="";
		Customer cus = cs.CheckuserDetails(email, old);
		if(cus!=null)
		{
			if(newp.equals(conf))
			{
				if(cs.updatePassword(email,newp).equals("success"))
				{
					m.addAttribute("info","password updated");
				}
				else
				{
					m.addAttribute("info","oh!! Error");
				}
				
			}
			else
			{
				m.addAttribute("info","oh!! Error");
			}
		}
		else
		{
			m.addAttribute("info","oh!! Error");
		}
		//Customer cus;
		
		
		
		return "ChangePaasword";
		
	}

	
}
