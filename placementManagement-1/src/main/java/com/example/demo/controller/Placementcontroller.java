package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.example.demo.Entity.Placement;
import com.example.demo.service.Placementservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Placementcontroller 
{
 @Autowired
 private Placementservice service;
 
 // RESTful API methods for Retrieval operations
 @GetMapping("/placement")
 public List<Placement> list() 
 {
 return service.listAll();
 }
 @GetMapping("/placement/{id}")
 public ResponseEntity<Placement> get(@PathVariable Long id) 
 {
 try
 {
 Placement p = service.get(id);
 return new ResponseEntity<Placement>(p, HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Create operation
 @PostMapping("/placement")
 public void add(@RequestBody Placement p) 
 {
 service.save(p);
 }
 
 // RESTful API method for Update operation
 @PutMapping("/placement/{id}")
 public ResponseEntity<?> update(@RequestBody Placement p, @PathVariable Long id) 
 {
 try
 {
 Placement existPlacement = service.get(id);
 service.save(p);
 return new ResponseEntity<>(HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Delete operation
 @DeleteMapping("/placement/{id}")
 public void delete(@PathVariable Long id) 
 {
 service.delete(id);
 }
}
