package com.obsqura.staticmethods;

import java.util.Scanner;

public class CustomerDiscount {

	public static void disAmt(double tot)
	{
		double dc = 0;
		if(tot>=5000)
		{
			dc = tot*20/100;
			tot = tot-dc;
			System.out.print("Discounted Amount: " +tot);
			//return tot;
		}
		else
			System.out.print("No discount");
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int icnt;
		double tamt =0;
		System.out.print("Enter the number of items: ");
		icnt = sc.nextInt();

		double aritm[] = new double[icnt];
		System.out.print("Enter the prices: ");
		for(int i=0;i<icnt;i++)	
			aritm[i] = sc.nextInt();
		//total amt
		for(int j=0;j<aritm.length;j++)	
			tamt = tamt + aritm[j];	
		System.out.println("Total Amount: " +tamt);
		CustomerDiscount.disAmt(tamt);
		sc.close();
	}
}
