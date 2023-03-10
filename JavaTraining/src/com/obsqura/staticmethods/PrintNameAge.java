package com.obsqura.staticmethods;

import java.util.Scanner;

public class PrintNameAge {

	public static void printNA(String s, int age){
		System.out.println("Name: " +s);
		System.out.print("Age: "+age);
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name:");
		String name = sc.nextLine();
		System.out.print("Enter the age:");
		int age = sc.nextInt();
		
		//NameAge.printNA("Tom",25);
		PrintNameAge.printNA(name,age);
		sc.close();
	}
}
	/* To return only name
	public static String printNA(String s){
		System.out.println("Name: " +s);
		return s;
		}
*/	


