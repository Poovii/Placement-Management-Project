package com.example.demo.service;

import java.util.List;
import javax.transaction.Transactional;

import com.example.demo.Entity.College;
import com.example.demo.repository.Collegerepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class Collegeservice 
{
 @Autowired
 private Collegerepository repo;
 
 public List<College> listAll() 
 {
 return repo.findAll();
 }
 
 public void save(College c) 
 {
 repo.save(c);
 }
 
 public College get(Long id) 
 {
 return repo.findById(id).get();
 }
 
 public void delete(Long id) 
 {
 repo.deleteById(id);
 }
 }