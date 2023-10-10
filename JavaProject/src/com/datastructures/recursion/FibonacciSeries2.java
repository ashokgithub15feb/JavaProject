package com.datastructures.recursion;

public class FibonacciSeries2 {

	public static void main(String[] args) {
		
		int n = 5;
		
		int result = fib(n);
		System.out.println(result);
	}

	private static int fib(int n) {
		
		if(n <= 1) {
			return n;
		}
		return fib(n - 2) + fib(n - 1);
	}
}
