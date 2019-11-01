package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(scopeName="prototype")
public class Employee {
	
	private String ename;
	private int id;
	@Autowired
	private EmpAdress emadress;
	public Employee() {
		System.out.println("object create");
	}
	public EmpAdress getEmadress() {
		return emadress;
	}
	public void setEmadress(EmpAdress emadress) {
		this.emadress = emadress;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		System.out.println("in Object...");
		emadress.adress();
		
	}

}
