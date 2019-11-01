package com.java;

public class Swaap {
	
	public static void main(String[] args) {
		/*
		 * int n=10; int m=12; System.out.println(n+" "+m); int l=n; n=m; m=l;
		 * System.out.println(n+" "+m);
		 */
		
		int n=10;
		int m=12;
		System.out.println(n+" "+m);
		m=m+n;
		n=m-n;
		m=m-n;
		System.out.println(n+" "+m);
	}

}
