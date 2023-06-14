package com.example.AzureMvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AzureMvc.pojo.entity;

public interface EntityRepo extends JpaRepository<entity, Integer>{

}
