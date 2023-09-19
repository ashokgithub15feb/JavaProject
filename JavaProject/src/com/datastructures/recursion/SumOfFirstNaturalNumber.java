package com.datastructures.recursion;

public class SumOfFirstNaturalNumber {

	public static void main(String[] args) {
		
		int n = 5;
		int result = sumOfNumber(n);
		System.out.println(result);
	}

	private static int sumOfNumber(int n) {
		if( n > 0) {
			return sumOfNumber(n - 1) + n;
		}
		
		return 0;
	}
}
