package com.example.AzureMvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.AzureMvc.pojo.entity;
import com.example.AzureMvc.service.EnitityService;


@RestController
public class EntityController {

	@Autowired
	EnitityService service;
	
	@PostMapping("/add")
	public entity add(@RequestBody entity o)
	{
		System.out.println("Yes");
		return service.saveEntity(o);
	}
	@GetMapping("/get")
	public List<entity> get()
	{
		return service.getAll();
	}
}
