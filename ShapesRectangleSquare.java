package com.obsqura.training.inheritance;

public class ShapesRectangleSquare extends ShapesRectangle {
	
	void print() {
		System.out.println("Square is rectangular shape");
		super.print();
	}	
	public static void main(String args[]) {
		ShapesRectangleSquare sq = new ShapesRectangleSquare();
		sq.print();
	}	
}
