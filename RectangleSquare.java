package com.obsqura.training.inheritance;

public class RectangleSquare extends Rectangle {
	float s;	
	void areaSqu() {
		System.out.println("Area of Square: "+(s*s));
	}	
	void perimeterSqu() {
		System.out.println("Perimeter of Square: "+(4*s));
	}	
	public RectangleSquare(float l, float b, float s) {
		super(l, b);
		this.s = s;
		/*this.areaRec();
		this.perimeterRec();
		this.areaSqu();
		this.perimeterSqu();*/
	}
	public static void main(String args[]) {
		RectangleSquare rs = new RectangleSquare(1f,3f,2f);
		rs.areaRec();
		rs.perimeterRec();
		rs.areaSqu();
		rs.perimeterSqu();		
	}	
}
