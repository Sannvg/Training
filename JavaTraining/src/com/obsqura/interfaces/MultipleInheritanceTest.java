package com.obsqura.interfaces;

public class MultipleInheritanceTest implements MultipleInheritanceTest1, MultipleInheritanceTest2 {

	@Override
	public void display() {
		System.out.println("Multiple Inheritance");
		
	}
	public static void main(String[] args) {
		MultipleInheritanceTest mi = new MultipleInheritanceTest();
		mi.display();
	}
}
