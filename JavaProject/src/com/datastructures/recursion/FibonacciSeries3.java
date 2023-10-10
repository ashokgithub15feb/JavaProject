package com.datastructures.recursion;
//not working as expected 
public class FibonacciSeries3 {

	private int[] F = new int[10];
	
	public static void main(String[] args) {
		int n = 5;
		FibonacciSeries3 f = new FibonacciSeries3();
		int result = f.fib(n);
		System.out.println(result);
	}

	private int fib(int n) {
		
		for(int i = 0; i <10; i++) {
			F[i] = -1;
		}
		
		if(n <= 1) {
			F[n] = n;
			return n;
		}
		else {
			if(F[n - 2] == -1) {
				F[n - 2] = fib(n - 2);
			}
			
			if(F[n - 1] == -1) {
				F[n - 1] = fib(n - 1);
			}
			return F[n - 2] + F[n - 1];
		}
	}
}
