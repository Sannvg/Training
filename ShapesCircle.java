package com.obsqura.training.inheritance;

public class ShapesCircle extends Shapes {
	
	void print() {
		System.out.println("This is circular shape");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapesCircle cr = new ShapesCircle();
		cr.print();
	}
}
