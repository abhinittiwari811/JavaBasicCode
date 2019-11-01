package com.java;

public class Hcf {
	
	public static void main(String[] args) {
		int n1=30;
		int n2=15;
		int n=0;
		n=n1<n2?n1:n2;
		for(int i=2;i<n;i++) {
			if(n1%i==0&&n2%i==0) {
				System.out.println("Hcf: "+i);
				break;
			}
		}
	}

}
