package com.java;

public class NprimeNumber {
	public static void main(String[] args) {
		int arr[];
		for(int i=0;i<100;i++) {
			prime(i);
			
		}
		
		
	}
		public static void prime(int n) {
			int i=0;
			for( i=2;i<n;i++)
				if(n%i==0)
					break;
			if(i==n)
				System.out.print(i+" ");
		}
}
