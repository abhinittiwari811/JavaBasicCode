package com.java;

public class Armstrong {
	
	public static void main(String[] args) {
		int n=371;
		int rem=0;
		int result=0;
		int m=n;
		
		
		while(n!=0) {
			rem=n%10;
			result=result+rem*rem*rem;
			n=n/10;
			
		}
		if(m==result) {
			System.out.println("Armstrong");
		}else {
			System.out.println("notArmstrong");
		}
	}

}
