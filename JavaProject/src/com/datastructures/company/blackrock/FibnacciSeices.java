package com.datastructures.company.blackrock;

public class FibnacciSeices {

	public static void main(String[] args) {
		//fib(10);
		System.out.println(fib1(10));
	}

	private static int fib1(int n) {
		if(n <= 1) {
			return n;
		}
		
		return fib1(n - 2) + fib1(n - 1);
	}

	private static void fib(int n) {
		
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for(int i = 0; i < n; i++) {
			
			int c = a + b;
			a = b;
			b = c;
			
			System.out.println(c);
		}
	} 
}
