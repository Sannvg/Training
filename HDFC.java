package com.obsqura.training.interfaces;

public class HDFC implements RBI {

	@Override
	public void recurringdeposit(float amt, float month) {
		float famt = (amt*month*intrt)+ amt;
		System.out.println("Amount: " +famt);
		
	}

	public static void main(String[] args) {
		HDFC hc = new HDFC();
		float amt=5000;
		float mnth = 6;
		hc.recurringdeposit(amt, mnth);

	}

}
