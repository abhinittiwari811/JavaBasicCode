package com.java;

public class Lcm {
	
	public static void main(String[] args) {
		
		int n1=2;
		int n2=8;
		for(int i=2;i<=n1*n2;i++) {
			if(i%n1==0&&i%n2==0) {
				System.out.println(i);
				break;
			}
		}
	}
	
}
