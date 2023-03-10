package com.obsqura.aggreggation;

public class Student {
	String studnm;
	int studid;
	Address studadd;	
	
	public Student(String studnm, int studid, Address studadd) {
		super();
		this.studnm = studnm;
		this.studid = studid;
		this.studadd = studadd;
	}	
	void displayStuddtls() {
		System.out.println("Student Details");
		System.out.println("Student Name: "+studnm+'\n'+"ID: "+studid);
		System.out.println("HouseName: "+studadd.hsnm+'\n'+"City: "+studadd.city+'\n'+"State: "+studadd.state+'\n'+"Country: "+studadd.country);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address studadd1 = new Address("ABC","ALPY","KERALA","INDIA");
		Student stud1 = new Student("Claire",156,studadd1);
		
		stud1.displayStuddtls();
	}
}
