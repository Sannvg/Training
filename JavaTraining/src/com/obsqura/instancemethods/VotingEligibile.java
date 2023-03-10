package com.obsqura.instancemethods;

import java.util.Scanner;

public class VotingEligibile {
	public Boolean eligible(int ag){
		if(ag>=18)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		//to check whether eligible to vote or not
		VotingEligibile vt = new VotingEligibile();
		Scanner sc= new Scanner(System.in);
		int age;
		System.out.print("Enter the candidate's age: ");
		age = sc.nextInt();
		//if(age>0){
		if(vt.eligible(age) == true)
			System.out.print("Candidate is eligible for voting");
		else
			System.out.print("Not eligible for voting");
		sc.close();
	}

}
