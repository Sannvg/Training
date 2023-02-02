package com.obsqura.training.staticmethods;

import java.util.Scanner;

public class Factorial {

	public static int numFact(int n){
		int fn=1;
		for(int i=1;i<=n;i++){
			fn = fn * i;
		}
		return fn;
	}
	public static void main(String args[]){
		//Factorial f = new Factorial();
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter the number: ");
		num = sc.nextInt();
		
                if(num>0){	
			int fc = Factorial.numFact(num);
			System.out.print("Factorial of S" +num+" is "+fc);}
		else
			System.out.print("Number is zero or negative");
                sc.close();
	}

}
