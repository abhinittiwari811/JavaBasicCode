package com.example.demo;

import org.springframework.stereotype.Component;
@Component

public class EmpAdress {
	
	private String street;
	private int streetNo;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	@Override
	public String toString() {
		return "EmpAdress [street=" + street + ", streetNo=" + streetNo + "]";
	}
	public void adress() {
		System.out.println("Wellcome Adress");
	}

}
