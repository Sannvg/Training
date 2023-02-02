package com.obsqura.training.inheritance;

public class EmployeeCls {
	double bp,da,hra, bn,sal;	
	void calculateSal(double bp,double da, double hra) {
		sal = bp+da+hra;
		System.out.println("Salary: "+sal);
	}	
	void calculateBonus(double bp) {		
		bn = bp*10/100;
		System.out.println("Bonus :"+bn);
	}
}
