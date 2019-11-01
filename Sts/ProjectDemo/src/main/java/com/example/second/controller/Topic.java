package com.example.second.controller;

public class Topic {

	private int tNo;
	public Topic(int tNo, String lession, String book) {
		super();
		this.tNo = tNo;
		this.lession = lession;
		this.book = book;
	}
	
	public Topic() {
		// TODO Auto-generated constructor stub
	}
	private String lession;
	private String book;
	public int gettNo() {
		return tNo;
	}
	public void settNo(int tNo) {
		this.tNo = tNo;
	}
	public String getLession() {
		return lession;
	}
	public void setLession(String lession) {
		this.lession = lession;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	
	
	
}
