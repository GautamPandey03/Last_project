package com.jpa.Prectice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class PrecticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrecticeApplication.class, args);
		System.out.println("Running");
	}

}
