package com.obsqura.training.abstraction;

public class EmployeeContractor extends Employee {

	int wrkhrs=5;
	@Override
	void calculateSalary() {
		System.out.println("Salary: "+(payperhr * wrkhrs));
	}
	public static void main(String[] args) {
		EmployeeContractor ec = new EmployeeContractor();
		ec.calculateSalary();
	}
}
