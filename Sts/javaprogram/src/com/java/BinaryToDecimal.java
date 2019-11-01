package com.java;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		int n=1010;
		int rem=0;
		double i=0;
		double result=0;
		
		while(n!=0) {
		rem=n%10;
		result=result+(rem)*Math.pow(2, i);
		n=n/10;i++;
		}
		System.out.println(result);
	}

}
