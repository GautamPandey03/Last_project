package com.nagarro.librarysystem.controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nagarro.librarysystem.Entity.Book;
import com.nagarro.librarysystem.Service.BookService;
@Controller
public class BookController {
	
	@Autowired 
	BookService book;
	
	@GetMapping("/wel")
	public String Login(Model model)
	{
		List<Book> list=book.getAll();
		model.addAttribute("name", "Gautam");
		model.addAttribute("all", list);
		return "Welcome";
	}
	@GetMapping("addBook")
	public String bookAdd(Model m)
	{
		m.addAttribute("name", "Gautam");
		m.addAttribute("obj", new Book());
		return "AddBook";
	}
	
	@GetMapping("getbook")
	public String getBook(Model m)
	{
		List<Book> list=book.getAll();
		m.addAttribute("all", list);
		return "Welcome";
	}
	
	@PostMapping("savebook")
	public String saveBookDetail(@ModelAttribute Book obj,Model m)
	{
		String string="";
		if(book.add(obj).equals("success"))
				{
					string="Welcome";
				}
		System.out.println("aa gaya");
		System.out.print(obj);
		List<Book> list=book.getAll();
		m.addAttribute("all", list);
		
		
		return string;

	}
	@GetMapping("delete/{id}")
	public String delete(@PathVariable String id,Model m)
	{
		String string="Error";
		if(book.delete(Integer.parseInt(id)).equals("success"))
		{
			string= "redirect:/getbook";
		}
		
		return string;
		
	}
	@GetMapping("editbook/{id}")
	public String editBook(@PathVariable String id,Model m)
	{
		m.addAttribute("name", "Gautam");
		Book b=book.search(Integer.parseInt(id));
		m.addAttribute("book", b);
		
		System.out.println(id);
		return "EditBook";
	}
	@PostMapping("update")
	public String updateBook(@ModelAttribute Book obj,Model m)
	{
		System.out.println(obj.getBookName());
		book.add(obj);
		return "redirect:/getbook";
	}
	

}
