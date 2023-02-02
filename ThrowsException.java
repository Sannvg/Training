package com.obsqura.training.exceptions;

public class ThrowsException {

	public static void main(String[] args) throws Exception{
		
		int age =15;
		//if(5/0 == 0)
			//System.out.println("Not Divisible");
		if(age<18)
			throw new InvalidAgeException("Age is not valid");
			
	}

}
