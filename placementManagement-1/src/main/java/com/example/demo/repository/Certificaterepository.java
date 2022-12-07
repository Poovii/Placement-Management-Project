package com.example.demo.repository;

import com.example.demo.Entity.Certificate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Certificaterepository extends JpaRepository<Certificate,Long> {
	

}
