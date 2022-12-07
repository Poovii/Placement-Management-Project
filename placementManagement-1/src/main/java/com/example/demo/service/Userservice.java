package com.example.demo.service;

import java.util.List;
import javax.transaction.Transactional;

import com.example.demo.Entity.User;
import com.example.demo.repository.Userrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class Userservice 
{
 @Autowired
 private Userrepository repo;
 
 public List<User> listAll() 
 {
 return repo.findAll();
 }
 
 public void addUser(User user) 
 {
 repo.save(user);
 }
 
 public User get(Integer id) 
 {
 return repo.findById(id).get();
 }
 
 public void delete(Integer id) 
 {
 repo.deleteById(id);
 } }