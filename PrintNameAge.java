package com.obsqura.training.instancemethods;

import java.util.Scanner;

public class PrintNameAge {
	public void printNameAge(String s, int n){
		System.out.println("Name: " +s);
		System.out.print("Age: "+n);
		}
	public static void main(String[] args) {//program to print name and age using method
		PrintNameAge na = new PrintNameAge();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the name: ");
		String nm = sc.nextLine();

		System.out.print("Enter the age: ");
		int ag = sc.nextInt();

		na.printNameAge(nm,ag);
		sc.close();
	}

}
