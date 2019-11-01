package com.pack.Data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity

public class Student {
	
	private String sname;
	@Id
	private int sid;
	private String mark;
	@ManyToMany(mappedBy = "student")
	private List <Laptop> laptop=new ArrayList<Laptop>();
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getSid() {
		return sid;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}

}
