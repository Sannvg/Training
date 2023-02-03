package com.obsqura.training.staticmethods;

import java.util.Scanner;

public class VotingEligible {
	public static Boolean eligibleVote(int a){
		if(a>=18)
			return true;
		else
			return false;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//Boolean flag =false;
		System.out.print("Enter the age of candidate:");
		int age = sc.nextInt();
		if(VotingEligible.eligibleVote(age))
			System.out.print("Candidate is eligible for voting");
		else
			System.out.print("Not eligible for voting");
		sc.close();
	}

}
