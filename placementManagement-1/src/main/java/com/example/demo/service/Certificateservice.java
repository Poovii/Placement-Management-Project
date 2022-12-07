package com.example.demo.service;

import java.util.List;
import javax.transaction.Transactional;

import com.example.demo.Entity.Certificate;
import com.example.demo.repository.Certificaterepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class Certificateservice 
{
 @Autowired
 private Certificaterepository repo;
 
 public List<Certificate> listAll() 
 {
 return repo.findAll();
 }
 
 public void save(Certificate c) 
 {
 repo.save(c);
 }
 
 public Certificate get(Long id) 
 {
 return repo.findById(id).get();
 }
 
 public void delete(Long id) 
 {
 repo.deleteById(id);
 }
}