package com.obsqura.encapsulation;


public class BankTransUser {

	public static void main(String[] args) {
		BankTrans bt = new BankTrans();
		//bt.setPinNo(1001);		
		//bt.setPinNo(1234);	
		//bt.setPinNo(1212);
		bt.setPinNo(1213);
		if(bt.getPinNo()==1001||bt.getPinNo()==1234||bt.getPinNo()==1212)
			System.out.println("Valid Pin");
		else
			System.out.println("Invalid Pin");
	}
}
