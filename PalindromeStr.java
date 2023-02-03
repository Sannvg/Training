package com.obsqura.training.stringtest;

public class PalindromeStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Java", s2 = "malayalam", tempstr ="";
		char ch,ch1;

		System.out.println("Strings are: "+s1+" & "+s2);
		
		for(int i=0;i<s1.length();i++){
			ch = s1.charAt(i);
			tempstr =ch + tempstr;}
		if(s1.equals(tempstr))
			System.out.println(s1+ " is palindrome");
		else
			System.out.println(s1+ " is  not palindrome");

		tempstr = "";
			
		for(int j=0;j<s2.length();j++){
			ch1 = s2.charAt(j);
			tempstr =ch1 + tempstr;}
		if(s2.equals(tempstr))
			System.out.println(s2+ " is palindrome");
		else
			System.out.println(s2+ " is  not palindrome");
	}

}
