package com.obsqura.training.inheritance;


public class EmployeeSalTot extends EmployeeSalDed {
	int sal=0;
	
	int finalSal(int bp) {		
		hraCal(bp);
		pfCal(bp);
		sal = bp+hra-pf-ded+bon;
		return sal;
	}	
	void setSalSlip() {
		System.out.println("Basic Pay: "+bp);
		System.out.println("Deduction: "+ded);
		System.out.println("HRA: "+hra);
		System.out.println("PF: "+pf);
		System.out.println("Bonus: "+bon);
		System.out.println("Total Salary: "+sal);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		EmployeeSalTot cs = new EmployeeSalTot();
		cs.getSaldtls();
		cs.finalSal(cs.bp);
		cs.setSalSlip();
	}	
}
