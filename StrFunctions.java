package com.obsqura.training.stringtest;
import java.util.Scanner;

public class StrFunctions {
	
	public static void main(String[] args) {
		String str1, str2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two strings : ");
		str1 = sc.nextLine();
		str2 = sc.nextLine();

		System.out.print("Equals Method: ");
		if(str1.equals(str2))
			System.out.println("Entered strings are same");
		else
			System.out.println("Entered strings are different");

		System.out.print("EqualIgnoreCase Method: ");
		
		if(str1.equalsIgnoreCase(str2))
			System.out.println("Entered strings are same");
		else
			System.out.println("Entered strings are different");
		
		System.out.print("Compare To Method: ");
		System.out.println(str1.compareTo(str2));
		
		System.out.print("EqualsTo Method: ");
		str1 = str2;
		if(str1==str2)
			System.out.println("Entered strings are same");
		else
			System.out.println("Entered strings are different");
		sc.close();
	}

}
