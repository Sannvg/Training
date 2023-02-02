package com.obsqura.training.inheritance;

public class Rectangle {
	float l,b;
	public Rectangle(float l, float b) {
		super();
		this.l = l;
		this.b = b;		
	}
	void areaRec() {
		float area = l*b;
		System.out.println("Area of rectangle: "+area);		
	}
	void perimeterRec() {
		float pm = 2*(l+b);		
		System.out.println("Perimeter of rectangle: "+pm);
	}
}
