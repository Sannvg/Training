package com.obsqura.training.instancemethods;

import java.util.Scanner;

public class CustomerDiscount {
	public void disAmt(double tot)
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

	public static void main(String[] args) {
		// to avail customer discount 
		CustomerDiscount cd = new CustomerDiscount();
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
		cd.disAmt(tamt);
		sc.close();
	}

}
