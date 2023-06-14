package com.example.demo.loginService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.contoller.Status;
import com.example.demo.pojo.Product;
import com.example.demo.pojo.User;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.UserRepository;


@Service
public class LoginServiceImp implements LoginService {
	@Autowired
	UserRepository userRepository;
	@Autowired
	ProductRepository productRepository;
	Status pStatus;

	@Override
	public Status saveUser(User obj) {

		User r = userRepository.save(obj);
		System.err.println(r);
		if (r != null) {
			pStatus = Status.SUCCESS;
		} else {
			pStatus = Status.FAILURE;
		}

		return pStatus;
	}

	@SuppressWarnings("unused")
	@Override
	public Status search(String username, String pass) {
		// TODO Auto-generated method stub
		Status enuStatus;
		System.out.println(username);
		List<User> objUser = userRepository.findUserByEmailAndPassword(username, pass);

		System.out.println(pass);
		System.out.println(objUser.toString());
		System.out.println(objUser.isEmpty());
		if (objUser.isEmpty()) {
			enuStatus = Status.FAILURE;
		} else {
			enuStatus = Status.SUCCESS;
		}

		return enuStatus;
	}

	@Override
	public Status saveProduct(Product product) {
		// TODO Auto-generated method stub
		Product p = productRepository.save(product);
		if (p != null) {
			pStatus = Status.SUCCESS;
		} else {
			pStatus = Status.FAILURE;
		}
		return pStatus;
	}

	@Override
	public List<Product> getProduct() {
		List<Product> products=productRepository.findAll();
		for(Product p:products)
		{
			System.out.println(p.getBrand()+"\t"+p.getName());
		}
		return products;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Product searchProduct(int p) {
		System.out.println("reache-2");
		
		Optional<Product> product=productRepository.findById(p);
		
		//System.out.println(product.toString());
		System.out.println(product.get());
				return  product.get();
			
	}

	@Override
	public Product getID(int id) {
		Optional<Product> obj=productRepository.findById(id);
		System.out.println(obj.toString());
		if(obj.isEmpty())
		{
			System.out.println("error");
		}
		return obj.get();
	}

	@Override
	public List<Product> searchByName(String p) {
		System.out.println("reached!!Else");
		List<Product> product=productRepository.findProductByName(p);
	System.out.println((product.isEmpty()));
	if(product.isEmpty())
	{
		product=null;
	}
		System.out.println(product);
		return product;
	}

	@Override
	public List<Product> searchByBrand(String p) {
		System.out.println("Brand!!");
		List<Product> product=productRepository.findProductByBrand(p);
		if(product.isEmpty())
		{
			product=null;
		}
		System.out.println(product);
		return product;
	}

	@Override
	public Status addImage(MultipartFile multipartFile, String name, String brand, String price, String description) {
		String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
		
		Product objProduct=new Product();
		objProduct.setImage(fileName);
		objProduct.setName(name);
		objProduct.setBrand(brand);
		objProduct.setPrice(price);
		objProduct.setDescription(description);
		Product p = productRepository.save(objProduct);
        String uploadDir = "src/main/resources/static/image";



       try {
		FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
	}
       catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
		if (p != null) {
			pStatus = Status.SUCCESS;
		} else {
			pStatus = Status.FAILURE;
		}
		
		return pStatus;
	}



}
