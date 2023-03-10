package com.obsqura.instancemethods;

import java.util.Scanner;

public class Palindrome {
	int rem=0,sum=0;
	public int revNum(int n){
		while(n>0){
			rem = n%10;
			sum = sum*10 + rem;
			n = n/10;
		}
		return sum;
	}
	public void palCheck(int nm, int rnum){
		if(nm==rnum)
			System.out.print(nm+" is a palindrome number");
		else
			System.out.print(nm+" is not a palindrome number");
	}

	public static void main(String[] args) {// to find a number is palindrome or not
		Palindrome p = new Palindrome();
		Scanner sc = new Scanner(System.in);

		int temp, num, rvnum;

		System.out.print("Enter the number: ");
		num = sc.nextInt();
		temp = num;
		rvnum = p.revNum(num);
		p.palCheck(temp,rvnum);
		sc.close();
	}

}
