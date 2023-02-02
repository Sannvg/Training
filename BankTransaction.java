package com.obsqura.training.instancemethods;

import java.util.Scanner;

public class BankTransaction {
	int cb = 0;
	public void checkCB(){
		System.out.println("Current Balance:" +cb);
	}
	public int depAmt(int dp){
		cb = cb + dp;
		return cb;		
	}
	public int wdAmt(int wd){
		cb = cb-wd;
		return cb;
	}

	public static void main(String[] args) {
		// To deposit, withdraw and calculate the deposit
		BankTransaction bk = new BankTransaction();
		Scanner sc = new Scanner(System.in);
		int dp, wd;		
		System.out.print("Enter the amount to deposit:");
		dp = sc.nextInt();
		bk.depAmt(dp);
		System.out.println("Amount deposited");		
		System.out.print("Enter the amount to withdraw:");
		wd = sc.nextInt();
		if(wd>bk.cb)
			System.out.println("Insufficient Balance");
		else{
			bk.wdAmt(wd);
			System.out.println("Amount withdrawn");}
		bk.checkCB();
		sc.close();

	}

}
