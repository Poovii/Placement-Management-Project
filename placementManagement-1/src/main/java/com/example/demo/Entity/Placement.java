package com.example.demo.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Placement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private College college;
	private int localdate;
	private List<String>qualification;
	private int year;
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
	public int getLocaldate() {
		return localdate;
	}
	public void setLocaldate(int localdate) {
		this.localdate = localdate;
	}
	public List<String> getQualification() {
		return qualification;
	}
	public void setQualification(List<String> qualification) {
		this.qualification = qualification;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Placement(long id, String name, College college, int localdate, List<String> qualification, int year) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.localdate = localdate;
		this.qualification = qualification;
		this.year = year;
	}
	public Placement() {
		super();
		//TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Placement [id=" + id + ", name=" + name + ", college=" + college + ", qualification=" + qualification
				+ ", year=" + year + "]";
	}
	
	
	
}
