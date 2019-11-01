package com.pack.Hello;

import javax.persistence.Embeddable;

@Embeddable
public class EmpName {
	
	private String fname;
	public String getFname() {
		return fname;
	}
	@Override
	public String toString() {
		return "EmpName [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	private String mname;
	private String lname;
	
	

}
