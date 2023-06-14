package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.Product;
import com.example.demo.pojo.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	//@Query(value = "SELECT u FROM User u WHERE u.email = ?1 and u.password = ?2")
	   public List<User> findUserByEmailAndPassword(String email, String pass);
	 //  public User findUserByNameAndEmail(String name,String email);
}
