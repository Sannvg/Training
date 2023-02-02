package com.obsqura.training.inheritance;

public class MemberManager extends Member {
	String sp,dept;
	
	void memberdtls() {
		System.out.println("Name: "+name+'\n'+"Age: "+age+'\n'+"Phone No: "+ph+'\n'+"Address: "+addr);
		System.out.println("Specilization: "+sp+'\n'+"Department: "+dept);
	}
	
	public MemberManager(String name, String addr, int age, int ph, float sal, String sp, String dept) {
		super(name, addr, age, ph, sal);
		this.sp = sp;
		this.dept = dept;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberManager mm = new MemberManager("Tes","ALPY",35,345,10000,"Dev","IT");
		System.out.println("Manager Details");
		mm.memberdtls();
		mm.salPrint();
	}
}
