package com.java;

public class Factorial {

	public static void main(String[] args) {
		/*
		 * int n=5; int fact=1; for(int i=1;i<=n;i++) { fact=fact*i; }
		 * System.out.println(fact);
		 */
		System.out.println(fact(5));
	}
	
	public static int fact(int n) {
		if(n==0)
			return 1;
		if(n==1)
			return 1;
		return n*fact(n-1);
	}
	
}
