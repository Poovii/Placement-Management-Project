package com.example.demo.service;

import java.util.List;
import javax.transaction.Transactional;

import com.example.demo.Entity.Admin;
import com.example.demo.repository.Adminrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class Adminservice 
{
 @Autowired
 private Adminrepository repo;
 
 public List<Admin> listAll() 
 {
 return repo.findAll();
 }
 
 public void save(Admin admin) 
 {
 repo.save(admin);
 }
 
 public Admin get(Integer id) 
 {
 return repo.findById(id).get();
 }
 
 public void delete(Integer id) 
 {
 repo.deleteById(id);
 } }