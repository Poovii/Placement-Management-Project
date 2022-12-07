package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.example.demo.Entity.Student;
import com.example.demo.service.Studentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Studentcontroller {

	 @Autowired
	 private Studentservice service;
	 
	 // RESTful API methods for Retrieval operations
	 @GetMapping("/student")
	 public List<Student> list() 
	 {
	 return service.listAll();
	 }
	 @GetMapping("/student/{id}")
	 public ResponseEntity<Student> get(@PathVariable Long id) 
	 {
	 try
	 {
	 Student s = service.get(id);
	 return new ResponseEntity<Student>(s, HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Create operation
	 @PostMapping("/student")
	 public void add(@RequestBody Student s) 
	 {
	 service.save(s);
	 }
	 
	 // RESTful API method for Update operation
	 @PutMapping("/student/{id}")
	 public ResponseEntity<?> update(@RequestBody Student s, @PathVariable Long id) 
	 {
	 try
	 {
	 Student existStudent = service.get(id);
	 service.save(s);
	 return new ResponseEntity<>(HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Delete operation
	 @DeleteMapping("/student/{id}")
	 public void delete(@PathVariable Long id) 
	 {
	 service.delete(id);
	 }
	}

