package com.java;

public class DecimalToBinary {
	public static void main(String[] args) {
		int n=234;
		int rem=0;
		int count=0;
		int bin=0;
		int i=1;
		
		while(n!=0) {
		rem=n%2;
			/*
			 * if(rem==1) { count++; }
			 */
		bin=bin+rem*i;
		i=i*10;
		n=n/2;
		}
		System.out.println(bin);
		//System.out.println(count);
	}
	
}
