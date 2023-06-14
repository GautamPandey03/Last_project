package com.microservice.Admin.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.Admin.pojo.Product;
import com.microservice.Admin.pojo.Status;
import com.microservice.Admin.service.ProductService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	Status reStatus;
	@Autowired
	ProductService objProductService;
	
	@PostMapping("/add")
	public Status addItem(@RequestBody Product obj)
	{
		reStatus=objProductService.addProduct(obj);
		return reStatus;
	}
	@GetMapping("/remove/{id}")
	public Status removeItem(@PathVariable int id)
	{
		reStatus=objProductService.removeProduct(id);
		return reStatus;
	}
	@GetMapping("/getDetail/{id}")
	public Product getDetail(@PathVariable int id)
	{
		return objProductService.getProduct(id);
	}
	@GetMapping("/viewAll")
	public List<Product> viewAll()
	{
		return objProductService.viewAll();
	}

}
