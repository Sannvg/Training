package com.obsqura.training.inheritance;

public class EmployeeClsAccountant extends EmployeeCls {
	
	void accountantSal(double bp,double da, double hra) {
		System.out.println("Accountant Salary: ");
		super.calculateSal(bp,da,hra);
		super.calculateBonus(bp);
	}
}
