package com.obsqura.training.inheritance;

public class EmployeeSalDed extends EmployeeSal {
	
	int hra,pf;
	void hraCal(int bspy) {  //to calculate the HRA of an employee
		
		hra = 5*bspy/100;
		//return hra;
	}		
	void pfCal(int bspy) {  //to calculate the PF of an employee
		//int pf =0;
		pf = 20*bspy/100;
		//return pf;
	}
}
