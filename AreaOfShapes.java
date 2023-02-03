package com.obsqura.training.staticmethods;

import java.util.Scanner;

public class AreaOfShapes {

	public static double shapeArea(double r){
		double car = 3.14*r*r;
		return car;
	}
	public static int shapeArea(int w, int h){
		int rear = w*h;
		return rear;
	}
	public static int shapeArea(int s){
		int sqar = s*s;
		return sqar;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		double r = sc.nextInt();
		System.out.println("Area of circle is : " +AreaOfShapes.shapeArea(r));

		System.out.print("Enter the width and height: ");
		int w= sc.nextInt();
		int h = sc.nextInt();
		System.out.println("Area of rectangle is : " +AreaOfShapes.shapeArea(w,h));

		System.out.print("Enter the length of side: ");
		int a= sc.nextInt();
		System.out.print("Area of square is : "+AreaOfShapes.shapeArea(a));
		sc.close();
	}

}
