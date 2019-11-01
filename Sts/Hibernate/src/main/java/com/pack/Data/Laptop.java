package com.pack.Data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {

	private String lname;
	@Id
	private int lid;
	@ManyToMany
	private List <Student> student=new ArrayList<Student>();
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public List<Student> getStudent() {
		return student;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	
}
