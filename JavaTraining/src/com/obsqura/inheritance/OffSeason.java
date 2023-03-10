package com.obsqura.inheritance;


public class OffSeason {
	double disc,discVal=0;
	void discount(double amt){		
		disc = amt*15/100;
		discVal = amt-disc;
		System.out.println("Offseason Discount: "+disc);
		System.out.println("Final Amount: "+discVal);	
	}
}
