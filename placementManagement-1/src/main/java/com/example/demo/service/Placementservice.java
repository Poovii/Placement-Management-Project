package com.example.demo.service;

import java.util.List;


import com.example.demo.Entity.Placement;

import com.example.demo.repository.Placementrepository;

import org.springframework.beans.factory.annotation.Autowired;

public class Placementservice 
{
	 @Autowired
	 private Placementrepository repo;
	 
	 public List<Placement> listAll() 
	 {
	 return repo.findAll();
	 }
	 
	 public void save(Placement p) 
	 {
	 repo.save(p);
	 }
	 
	 public Placement get(Long id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Long id) 
	 {
	 repo.deleteById(id);
	 }
	}


