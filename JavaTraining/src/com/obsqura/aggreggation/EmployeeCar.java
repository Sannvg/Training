package com.obsqura.aggreggation;

public class EmployeeCar {
	String empNm,empID;
	Car empcar;	

	public EmployeeCar(String empNm, String empID, Car empcar) {
		super();
		this.empNm = empNm;
		this.empID = empID;
		this.empcar = empcar;
	}
	void employeedtls() {
		System.out.println("Employee Details");
		System.out.println("Name: "+empNm+'\n'+"ID: "+empID);
		System.out.println("Car Type: "+empcar.carnm+'\n'+"Color: "+empcar.carclr+'\n'+"Reg No: "+empcar.regno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car empcar1 = new Car("Black","Audi","D7575");
		EmployeeCar emp1 = new EmployeeCar("Ted","T1",empcar1);
		emp1.employeedtls();
	}

}
