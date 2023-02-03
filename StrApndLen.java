package com.obsqura.training.stringtest;

public class StrApndLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str1 = new StringBuilder("Obsqura");	
		StringBuilder str2 = new StringBuilder("Training");

		System.out.println("String length of "+str1+  " is: "+str1.length());
		System.out.println("String length of "+str2+ " is: "+str2.length());
		
		str1.append(" ");
					
		System.out.println("Appended string is: "+str1.append(str2));
	}

	
}
