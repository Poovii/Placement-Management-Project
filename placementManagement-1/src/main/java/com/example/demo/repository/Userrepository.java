package com.example.demo.repository;



import com.example.demo.Entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<User,Integer> {

}
