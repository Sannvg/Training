package com.obsqura.inheritance;

public class MemberEmployee extends Member {
	String sp,dept;
	
	void memberdtls() {
		System.out.println("Name: "+name+'\n'+"Age: "+age+'\n'+"Phone No: "+ph+'\n'+"Address: "+addr);
		System.out.println("Specilization: "+sp+'\n'+"Department: "+dept);
	}
	
	public MemberEmployee(String name, String addr, int age, int ph, float sal, String sp, String dept) {
		super(name, addr, age, ph, sal);
		this.sp = sp;
		this.dept = dept;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberEmployee me = new MemberEmployee("Claire","ALPY",25,123,5000f,"Test","IT");
		System.out.println("Employee Details");
		me.memberdtls();
		me.salPrint();
	}

}
