package com.example.demo.loginService;


import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.contoller.Status;
import com.example.demo.pojo.Product;
import com.example.demo.pojo.User;

public interface LoginService {
	public Status saveUser(User obj);
	public Status search(String username,String pass);
	public Status saveProduct(Product product);
	public List<Product> getProduct();
	public Product searchProduct(int i);
	public List<Product> searchByName(String p);
	public List<Product> searchByBrand(String p);
	public Product getID(int id);
	public Status addImage(MultipartFile multipartFile, String name,String brand, String price,String description);

}
