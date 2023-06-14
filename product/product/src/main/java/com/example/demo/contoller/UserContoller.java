package com.example.demo.contoller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.ast.Literal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb.PageRequestDto;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.loginService.LoginService;
import com.example.demo.pojo.Product;
import com.example.demo.pojo.User;
import com.example.demo.repository.UserRepository;

import net.bytebuddy.asm.Advice.This;

@RestController
@CrossOrigin(origins = "*")
public class UserContoller {

	@Autowired
	private LoginService log;
	@Autowired
	UserRepository userRepository;

	@PostMapping("/register")
	public Status home(@RequestBody User newUser, Model m) {
		return this.log.saveUser(newUser);
		/*
		 * userRepository.save(newUser); return Status.SUCCESS; List<User> users =
		 * userRepository.findAll(); System.out.println("New user: " +
		 * newUser.toString()); for (User user : users) {
		 * 
		 * if (user.equals(newUser)) { System.out.println("User Already exists!");
		 * return Status.USER_ALREADY_EXISTS; } }
		 */

	}

	@PostMapping("/login")
	public Status loginUser(@RequestBody User obj) {
		System.out.println(obj.getEmail() + " " + obj.getPassword());
		return this.log.search(obj.getEmail(), obj.getPassword());
		/*
		 * List<User> users = userRepository.findAll(); for (User other : users) { if
		 * (other.equals(user)) { user.setLoggedIn(true); userRepository.save(user);
		 * return Status.SUCCESS; } } return Status.FAILURE;
		 */
	}

	@PostMapping("/addData")
	public Status addProduct(@RequestBody Product product) {
		return this.log.saveProduct(product);
	}

	@GetMapping("/getProduct")
	public List<Product> getData() {
		
		return this.log.getProduct();
	}

	@GetMapping("searchByName/{name}")
	public List<Product> searchValue(@PathVariable String name) {
		
		//Optional<Integer> op=Optional.ofNullable(p.getId());
		System.out.println(name);
		
		Optional<String> optional=Optional.ofNullable(name);
	 	
		List<Product> objProduct;
		//System.out.println(p.getId());
		//System.out.println(p.getBrand().isEmpty());
		
			if(optional.isPresent())
				System.out.println("By name call");
				objProduct=this.log.searchByName(name);
		
		return objProduct;

	}
	@GetMapping("/searchByBrand/{brand}")
	public List<Product> searchBrand(@PathVariable String brand )
	{
		System.out.println("By brand call");
		return this.log.searchByBrand(brand);
		
	}
	@GetMapping("getById")
	public Product descProduct(@RequestBody Product p) {
		System.out.println(p.getId());
		return this.log.getID(p.getId());
	}

	@GetMapping("getById/{id}")
	public Product descProduc(@PathVariable int id) {
		System.out.println(id);
		return this.log.getID(id);
	}

	@GetMapping("pinCode/{id}")
	public Status checkPinCode(@PathVariable int id) {
		Status status=null;
		List<Integer> pin = new ArrayList<Integer>();

		pin.add(221105);
		pin.add(221106);
		pin.add(211011);
		pin.add(221023);
		pin.add(221110);
		System.out.println(id);
		for (Integer i : pin) {
			if (id == i) {
				System.out.println("ssss");
				status = Status.SUCCESS;
				break;
			}
			else {
					status = Status.FAILURE;
				}
			}
		

		return status;
	}
	@PostMapping("addImage")
	public Status saveImage(@RequestParam("image") MultipartFile multipartFile,
		    @RequestParam String name,
		    @RequestParam String brand,
		    @RequestParam String price,
		    @RequestParam String description)
	{
		return this.log.addImage(multipartFile,name,brand,price,description);
	}
	

}
