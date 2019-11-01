package com.java;

public class Pelindrome {
	
	public static void main(String[] args) {
		
		String str1="nitin";
		String strResult="";
		for(int i=str1.length()-1;i>=0;i--) {
			strResult=strResult+str1.charAt(i);
		}
		if(str1.equals(strResult)) {
			System.out.println("pelindrome");
		}
		else {
			System.out.println("NotPelindrome");
		}
	}

}
