package com.java;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int n=15;
		int i=0;
		for(i=2;i<n;i++) 
			if(n%i==0)
				break;
		if(i==n) {
			System.out.println("prime");
		}else {
			System.out.println("notPrime");
		}
		
		
	}

}
