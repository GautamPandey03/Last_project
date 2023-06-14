package com.example.AzureMvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AzureMvc.pojo.entity;
import com.example.AzureMvc.repository.EntityRepo;

@Service
public class serviceimple implements EnitityService{

	@Autowired
	EntityRepo repo;
	@Override
	public entity saveEntity(entity obj) {
		// TODO Auto-generated method stub
		entity n=repo.save(obj);
		return n;
	}

	@Override
	public List<entity> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
