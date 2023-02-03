package com.obsqura.training.exceptions;

public class TryCatchException {

	public static void main(String[] args) {
		
		try{
			if(10/0 ==1)
				System.out.println("Divisible");
		}catch(ArithmeticException e) {
			System.out.println("You can’t divide a number by 0");
		}		

	}

}
