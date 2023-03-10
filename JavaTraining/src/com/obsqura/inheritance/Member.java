package com.obsqura.inheritance;

public class Member {
	String name, addr;
	int age, ph;
	float sal;	
	
	void salPrint() {
		System.out.println("Salary: "+sal);		
	}
	
	public Member(String name, String addr, int age, int ph, float sal) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
		this.ph = ph;
		this.sal = sal;
	}
}
