package com.obsqura.inheritance;

public class EmployeeClsManager extends EmployeeCls {
	
	void managerSal(double bp,double da, double hra) {
		System.out.println("Manager Salary: ");
		super.calculateSal(bp,da,hra);
		super.calculateBonus(bp);
	}
}
