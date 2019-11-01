package com.java;

public class Fibonici {

	/*
	 * public static int fib(int n) { if(n==1) return 0; if(n==2) return 1;
	 * 
	 * return (fib(n-2)+fib(n-1)); }
	 * 
	 * public static void main(String[] args) { for(int i=1;i<=10;i++) {
	 * System.out.print(fib(i)+" "); } }
	 */
	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<10;i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		
	}
	
	
}
