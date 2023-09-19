package com.datastructures.recursion;

public class SumOfNumberUsingStaticVeriable {

	private static int x;
	
	public static void main(String[] args) {
		
		int n = 5;
		int result = sumOfNumber(n);
		System.out.println(result);
	}

	private static int sumOfNumber(int n) {
		if( n > 0) {
			x++;
			return sumOfNumber(n - 1) + x;
		}
		
		return 0;
	}
}
