package com.obsqura.staticmethods;

import java.util.Scanner;

public class BankTransaction {

	static int cb = 0;
	public static void checkCB(){
		System.out.println("Current Balance:" +cb);
	}
	public static int depAmt(int dp){
		cb = cb + dp;
		return cb;		
	}
	public static int wdAmt(int wd){
		cb = cb-wd;
		return cb;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int dp, wd;		
		System.out.print("Enter the amount to deposit:");
		dp = sc.nextInt();
		BankTransaction.depAmt(dp);
		System.out.println("Amount deposited");		
		System.out.print("Enter the amount to withdraw:");
		wd = sc.nextInt();
		if(wd>cb)
			System.out.println("Insufficient Balance");
		else{
			BankTransaction.wdAmt(wd);
			System.out.println("Amount withdrawn");}
		BankTransaction.checkCB();
		sc.close();
	}

}
