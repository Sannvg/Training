package com.obsqura.training.instancemethods;

import java.util.Scanner;

public class Factorial {
	public int numFact(int n){
		int res=1;
		for(int i=1;i<=n;i++){
			res = res * i;
		}
		return res;
	}

	public static void main(String[] args) {//to find the factorial of a number
		Factorial f = new Factorial();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num = sc.nextInt(); 
		
		int res = f.numFact(num);
		System.out.print("Factorial of " +num+ " is " +res);
		sc.close();
	}

}
