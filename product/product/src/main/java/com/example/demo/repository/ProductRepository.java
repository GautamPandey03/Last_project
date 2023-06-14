package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	public List<Product> findProductByName(String p);
	public List<Product> findProductByBrand(String p);
	


}
