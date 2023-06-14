package com.nagarro.librarysystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


//@SpringBootApplication
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
//@ComponentScan(basePackages = {"com.mvc"})
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
		System.out.println("GAUTAM");
	}

}
