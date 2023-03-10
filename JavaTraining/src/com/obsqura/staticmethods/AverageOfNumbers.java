package com.obsqura.staticmethods;

import java.util.Scanner;

public class AverageOfNumbers {

	public static int findAvg(int a,int b, int c){
		int sum = (a+b+c)/3;
		return sum;
	}
	public static float findAvg(float x, float y, float z){
		float avg = (x+y+z)/3;
		return avg;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int iavg = findAvg(10,20,30);
		System.out.println("Average of integer numbers is: "+iavg);

		float favg = findAvg(10.2f,20.3f,30.4f);
		System.out.print("Average of float numbers is: "+favg);
		sc.close();
	}

}
