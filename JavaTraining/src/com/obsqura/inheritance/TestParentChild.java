package com.obsqura.inheritance;

public class TestParentChild extends TestParent {
	
		void displaychild() {
			System.out.println("This is child class");
		}
		
		public static void main(String args[]) {
			TestParentChild tpc = new TestParentChild();
			tpc.display();
			tpc.displaychild();
		}
}
