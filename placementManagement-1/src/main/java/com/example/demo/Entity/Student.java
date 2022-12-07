package com.example.demo.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.example.demo.Entity.Certificate;

@Entity
@Table

public class Student {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private College college;
	private long roll;
	private List<String>Qualification;
	private List<String>course;
	private int year;
	private List<Certificate>Certificate;
	private long hallTicketNo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public long getRoll() {
		return roll;
	}
	public void setRoll(long roll) {
		this.roll = roll;
	}
	public List<String> getQualification() {
		return Qualification;
	}
	public void setQualification(List<String> qualification) {
		Qualification = qualification;
	}
	public List<String> getCourse() {
		return course;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public List<Certificate> getCertificate() {
		return Certificate;
	}
	public void setCertificate(List<Certificate> certificate) {
		Certificate = certificate;
	}
	public long getHallTicketNo() {
		return hallTicketNo;
	}
	public void setHallTicketNo(long hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}
	public Student() {
		super();
		//TODO Auto-generated constructor stub
	}
	public Student(long id, String name, College college, long roll, List<String> qualification, List<String> course,
			int year, List<com.example.demo.Entity.Certificate> certificate, long hallTicketNo) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.roll = roll;
		Qualification = qualification;
		this.course = course;
		this.year = year;
		Certificate = certificate;
		this.hallTicketNo = hallTicketNo;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", roll=" + roll + ", Qualification="
				+ Qualification + ", course=" + course + ", year=" + year + ", Certificate=" + Certificate
				+ ", hallTicketNo=" + hallTicketNo + "]";
	}
	
	
}
