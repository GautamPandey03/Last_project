package com.microservice.Admin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.microservice.Admin.pojo.Product;
import com.microservice.Admin.pojo.Status;

@Service
public class ServiceImplementation implements ProductService{
	public List<Product> products=new ArrayList<>();
	Status result;

	@Override
	public Status addProduct(Product obj) {
		// TODO Auto-generated method stub
		if(obj==null)
		{
			result=Status.FAILURE;
		}
		else 
			{
				products.add(obj);
				result=Status.SUCCESS;
			}
		for (Product product : products) {
			System.out.println(product.getItemName()+"\t"+product.getPrice());
			
		}
		return result;
		
		
	}

	@Override
	public Status removeProduct(int id) {
		// TODO Auto-generated method stub
		boolean b=products.removeIf(products -> products.getId()==(id));
		if(b==true)
		{
			result=Status.SUCCESS;
		}
		else {
			result=Status.FAILURE;
			
		}
		
//		for(Product obj:products)
//		{
//			if(obj.getId()==id)
//			{
//				
//			}
//		}
		
		return result;
	}

	@Override
	public Product getProduct(int id) {
		  return 
				  this.products.stream().filter((obj)->obj.getId()==id).findAny().get();
		
		
	}

	@Override
	public List<Product> viewAll() {
		// TODO Auto-generated method stub
		return products;
	}

}
