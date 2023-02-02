package com.obsqura.training.aggreggation;

public class EmployeeCarBike {
	String empNm,empId;
	Car empcar;
	Bike empbike;
	
	public EmployeeCarBike(String empNm, String empId, Car empcar, Bike empbike) {
		super();
		this.empNm = empNm;
		this.empId = empId;
		this.empcar = empcar;
		this.empbike = empbike;
	}
	void employeedtls() {
		System.out.println("Employee Details");
		System.out.println("Name: "+empNm+'\n'+"ID: "+empId);
		System.out.println("Car Type: "+empcar.carnm+'\n'+"Color: "+empcar.carclr+'\n'+"Reg No: "+empcar.regno);
		System.out.println("Bike Type: "+empbike.bikenm+'\n'+"Reg No: "+empbike.bikeregno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car empcar1 = new Car("Black","Audi","D7575");
		Bike empbk1 = new Bike("Bullet","B345");
		EmployeeCarBike emp1 = new EmployeeCarBike("Tom","E1",empcar1,empbk1);
		emp1.employeedtls();

	}

}
