package com.datastructures.recursion;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int n = 5;
		int result = factorial(n);
		System.out.println(result);
	}

	private static int factorial(int n) {
		
		if(n < 0) {
			return 0;
		}
		
		if(n == 0) {
			return 1;
		}
		else  {
			return factorial(n - 1) * n;
		}
		
	}
}
