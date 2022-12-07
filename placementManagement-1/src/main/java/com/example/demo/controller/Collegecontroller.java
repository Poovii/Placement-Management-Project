package com.example.demo.controller;

import java.util.*;

import com.example.demo.Entity.College;
import com.example.demo.service.Collegeservice;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
@RestController
public class Collegecontroller 
{
 @Autowired
 private Collegeservice service;
 
 // RESTful API methods for Retrieval operations
 @GetMapping("/college")
 public List<College> list() 
 {
 return service.listAll();
 }
 @GetMapping("/college/{id}")
 public ResponseEntity<College> get(@PathVariable Long id) 
 {
 try
 {
 College c = service.get(id);
 return new ResponseEntity<College>(c, HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Create operation
 @PostMapping("/college")
 public void add(@RequestBody College c) 
 {
 service.save(c);
 }
 
 // RESTful API method for Update operation
 @PutMapping("/college/{id}")
 public ResponseEntity<?> update(@RequestBody College c, @PathVariable Long id) 
 {
 try
 {
 College existCollege = service.get(id);
 service.save(c);
 return new ResponseEntity<>(HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Delete operation
 @DeleteMapping("/college/{id}")
 public void delete(@PathVariable Long id) 
 {
 service.delete(id);
 } }