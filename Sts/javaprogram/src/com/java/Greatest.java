package com.java;

public class Greatest {
	
	public static void main(String[] args) {
		int arr[]= {10,20,90,40,30,95,60,50,80,70,100};
		int h=arr[0];
		int s=arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>h) {
					s=h;
					h=arr[i];
				}
				
			}
		}
		
		System.out.println(h);
		System.out.println(s);
	}
}
