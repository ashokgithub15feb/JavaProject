package com.interviews.leetcode.easy;

public class CountIntegerWIthEvenDigitSum {

	public static void main(String[] args) {

		int[] n = { 1, 2, 3, 4 };

		int count = countIntegerWIthEvenDigitSum(n);
		
		System.out.println("Result: "+count);
	}

	private static int countIntegerWIthEvenDigitSum(int[] n) {

		int count = 0;
		for (int i = 0; i < n.length; i++) {

			if (sumOfDigit(n[i]) % 2 == 0) {
				count++;
			}
		}

		return count;
	}

	private static int sumOfDigit(int n) {

		int sum = 0;

		while (n != 0) {
			int digit = n % 10;
			sum += digit;
			n = n / 10;
		}
		System.out.println(sum);
		return sum;
	}
}
