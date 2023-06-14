package com.prectice.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AwsApplication {
	@GetMapping("/Home")
	public String home()
	{
		return "Hello Gutam!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsApplication.class, args);
		System.out.println("Start sever");
		
	}
	

}
