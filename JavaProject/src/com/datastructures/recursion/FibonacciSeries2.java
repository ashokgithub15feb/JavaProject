package com.datastructures.recursion;

public class FibonacciSeries2 {

	public static void main(String[] args) {
		
		int n = 11;
		for(int i = 0; i < n; i++) {
			int result = fib(i);
			System.out.println(result);
		}
	}

	private static int fib(int n) {
		
		if(n <= 1) {
			return n;
		}
		return fib(n - 2) + fib(n - 1);
	}
}
