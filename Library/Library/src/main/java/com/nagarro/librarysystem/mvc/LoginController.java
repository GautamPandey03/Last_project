package com.nagarro.librarysystem.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nagarro.librarysystem.Entity.Book;
import com.nagarro.librarysystem.Service.BookService;


@Controller
public class LoginController {
	@Autowired 
	BookService book;
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String logIn() {
		return "Login";
	}
	
	@RequestMapping(value = "/Check",method = RequestMethod.POST)
	public String userAccess(@RequestParam String name,@RequestParam String pass,Model model)
	{
		String result = "";

		if ((name.toLowerCase().equals("gautam")) && (pass.equals("Gautam@12"))) {
			List<Book> list=book.getAll();
			model.addAttribute("name", "Gautam");
			model.addAttribute("all", list);
			result = "Welcome";
		}
		else 
			{
			model.addAttribute("message", "Sorry wrong user!!");
				result = "Error";
			}
		
		return result;
	}

}
