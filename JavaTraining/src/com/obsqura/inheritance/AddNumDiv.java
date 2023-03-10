package com.obsqura.inheritance;

import java.util.Scanner;

public class AddNumDiv extends AddNum {
	void divResult(int res) {
		if(res%10==0)
			System.out.println(res+ " is divisible by 10");
		else
			System.out.println(res+ " is not divisible by 10");
	}
	public static void main(String args[]) {		
		AddNumDiv dr = new AddNumDiv();
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter 1st No: ");
		int n1= sc.nextInt();
		System.out.println("Enter 2nd No: ");
		int n2 = sc.nextInt();
		
		int sum = dr.sumNum(n1, n2);		
		dr.divResult(sum);		
		sc.close();		
	}
}
