package com.obsqura.training.abstraction;

public class EmployeeFullTime extends Employee {

	@Override
	void calculateSalary() {
		System.out.println("Salary: "+(payperhr*8));
	}
	public static void main(String[] args) {
		EmployeeFullTime eft = new EmployeeFullTime();
		eft.calculateSalary();
	}
}
