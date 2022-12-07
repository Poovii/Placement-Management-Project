package com.example.demo.controller;

import java.util.*;


import com.example.demo.Entity.Certificate;
import com.example.demo.service.Certificateservice;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
@RestController
public class Certificatecontroller 
{
 @Autowired
 private Certificateservice service;
 
 // RESTful API methods for Retrieval operations
 @GetMapping("/certificate")
 public List<Certificate> list() 
 {
 return service.listAll();
 }
 @GetMapping("/certificate/{id}")
 public ResponseEntity<Certificate> get(@PathVariable Long id) 
 {
 try
 {
 Certificate c = service.get(id);
 return new ResponseEntity<Certificate>(c, HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Create operation
 @PostMapping("/certificate")
 public void add(@RequestBody Certificate c) 
 {
 service.save(c);
 }
 
 // RESTful API method for Update operation
 @PutMapping("/certificate/{id}")
 public ResponseEntity<?> update(@RequestBody Certificate c, @PathVariable Long id) 
 {
 try
 {
 Certificate existCollege = service.get(id);
 service.save(c);
 return new ResponseEntity<>(HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Delete operation
 @DeleteMapping("/certificate/{id}")
 public void delete(@PathVariable Long id) 
 {
 service.delete(id);
 } }