package com.obsqura.inheritance;

import java.util.Scanner;

public class OnSeason extends OffSeason {
	double disc,discVal=0;
	
	void discount(double amt){
		super.discount(amt);
		disc = amt*40/100;
		discVal = amt-disc;
		System.out.println("Onseason Discount: "+disc);
		System.out.println("Final Amount: "+discVal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		OnSeason ons = new OnSeason();
		System.out.println("Enter the purchase amount: ");
		double amt = sc.nextDouble();
		ons.discount(amt);		
		sc.close();
	}
}
