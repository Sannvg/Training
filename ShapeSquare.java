package com.obsqura.training.abstraction;

public class ShapeSquare extends Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeSquare ss = new ShapeSquare();
		ss.print();

	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("This is Square");
	}

}
