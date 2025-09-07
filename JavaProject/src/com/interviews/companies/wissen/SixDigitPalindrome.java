package com.interviews.companies.wissen;

import java.util.Scanner;

public class SixDigitPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		
		int num = sc.nextInt();
		
		int reve = checkPalindrom(num);
		
		if(reve == num) {
			System.out.println("Palindrom");
		} 
		else {
			System.out.println("Not a Palindrom");
		}
		
		sc.close();
	}

	private static int checkPalindrom(int num) {
		
		if(String.valueOf(num).length() > 6) {
			return 0;
		}
		
		int rev = 0;
		
		while(num > 0) {
			int digit = num % 10;
			
			rev = rev * 10 + digit;
			
			num /=10;
		}
		
		return rev;
	}
}
