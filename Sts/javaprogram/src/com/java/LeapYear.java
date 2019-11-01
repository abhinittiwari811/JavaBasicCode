package com.java;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		if((n%4==0)&&(n%100!=0)||(n%400==0)) {
			System.out.println("leap");
		}else {
			System.out.println("notleap");
		}
		
	}
	
}
