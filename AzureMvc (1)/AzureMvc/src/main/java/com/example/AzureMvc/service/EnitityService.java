package com.example.AzureMvc.service;

import java.util.List;

import com.example.AzureMvc.pojo.entity;

public interface EnitityService {
	public entity saveEntity(entity obj);
	public List<entity> getAll();

}
