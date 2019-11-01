package com.java;

public class DecimalToOctal {
	
	public static void main(String[] args) {
		int n=33;
		int rem=0;
		int count=0;
		int bin=0;
		int i=1;
		
		while(n!=0) {
		rem=n%8;
			
		bin=bin+rem*i;
		i=i*10;
		n=n/8;
		}
		System.out.println(bin);
	}
	

}
