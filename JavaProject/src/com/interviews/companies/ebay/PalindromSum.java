package com.interviews.companies.ebay;

import java.util.Scanner;

public class PalindromSum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		
		long number = scan.nextLong();
		
		long currentSum = number;
		
		boolean isPalindrom = isPalindrom(number);
		
		if(isPalindrom) {
			long reverseCurrentSum = revereNumber(number);
			
			currentSum = currentSum + reverseCurrentSum;
			
			System.out.println("Current Sum: "+currentSum);
			System.out.println("Palindrom Found: "+currentSum);
		} else {
			System.out.println("No Palindrome exist");
		}
		
		scan.close();
	}

	private static boolean isPalindrom(long number) {
		
		return number == revereNumber(number);
	}

	private static long revereNumber(long number) {
		
		long reverseNumber = 0;
		
		while(number > 0) {
			long digit = number % 10;
			reverseNumber = reverseNumber * 10 + digit;
			number = number / 10;
		}
		System.out.println("reverseNumber: "+reverseNumber);
		return reverseNumber;
	}
}
