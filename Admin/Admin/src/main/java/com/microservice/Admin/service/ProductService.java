package com.microservice.Admin.service;

import java.util.List;

import com.microservice.Admin.pojo.Product;
import com.microservice.Admin.pojo.Status;



public interface ProductService {
	public Status addProduct(Product obj);
	public Status removeProduct(int id);
	
	public Product getProduct(int id);
	public List<Product> viewAll();
	

}
