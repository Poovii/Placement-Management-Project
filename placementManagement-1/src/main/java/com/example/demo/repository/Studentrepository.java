package com.example.demo.repository;

import com.example.demo.Entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepository extends JpaRepository<Student,Long> {

}
