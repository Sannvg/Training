package com.obsqura.staticmethods;

import java.util.Scanner;

public class Palindrome {
	int temp;
	public static int numReverse(int n){
		int sum = 0, rem=0;
		while(n>0){
			rem = n%10;
			sum = sum*10 + rem;
			n = n/10;}
		return sum;
	}
	public static void chkPalindrome(int nm, int tnum){
		if(tnum==nm)
			System.out.println(tnum+ " is palindrome");
		else
			System.out.print(tnum+ " is not a palindrome number");
		
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num,rvnum,temp;
		System.out.print("Enter the number: ");
		num = sc.nextInt();
		temp = num;
		rvnum = Palindrome.numReverse(num);
		System.out.println("Reversed Number is: "+rvnum);
		Palindrome.chkPalindrome(rvnum,temp);
		sc.close();
	}
}
