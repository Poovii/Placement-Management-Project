package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.Placement;
import com.example.demo.Entity.Student;
import com.example.demo.repository.Placementrepository;
import com.example.demo.repository.Studentrepository;

import org.springframework.beans.factory.annotation.Autowired;

public class Studentservice {
	 @Autowired
	 private Studentrepository repo;
	 
	 public List<Student> listAll() 
	 {
	 return repo.findAll();
	 }
	 
	 public void save(Student s) 
	 {
	 repo.save(s);
	 }
	 
	 public Student get(Long id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Long id) 
	 {
	 repo.deleteById(id);
	 }

}
