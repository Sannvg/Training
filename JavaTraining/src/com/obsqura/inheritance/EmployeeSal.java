package com.obsqura.inheritance;

import java.util.Scanner;
public class EmployeeSal {
	int bp=0,ded =0,bon=0;
	
	void getSaldtls() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basic pay: ");
		bp = sc.nextInt();
		System.out.println("Enter the deduction: ");
		ded = sc.nextInt();
		System.out.println("Enter the bonus: ");
		bon = sc.nextInt();
		sc.close();
	}
}
