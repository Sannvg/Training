package com.obsqura.training.inheritance;

import java.util.Scanner;
public class EmployeeClsTest {	
	public static void main(String args[]) {
		double bp,hra,da;
		Scanner sc = new Scanner(System.in);
		EmployeeClsManager ecm = new EmployeeClsManager();
		EmployeeClsAccountant eca = new EmployeeClsAccountant();
		
		System.out.println("Enter the Basic Pay: ");
		bp = sc.nextDouble();
		System.out.println("Enter the HRA & DA: ");
		hra = sc.nextDouble();
		da = sc.nextDouble();
		
		ecm.managerSal(bp, da, hra);
		eca.accountantSal(bp, da, hra);
		
		sc.close();
	}
}
