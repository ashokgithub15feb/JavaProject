package com.datastructures.recursion;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n = 5;
		
		int result = fib(n);
		System.out.println("\n5th Terms: "+result);
	}

	private static int fib(int n) {
		
		int t0 = 0;
		int t1 = 1;
		int s = 0;
		System.out.print(t0+" "+t1+" ");
		
		if(n <= 1 ) {
			return n;
		}
		
		for(int i=0; i<=n; i++) {
			s = t0+t1;
			t0 = t1;
			t1 = s;
			System.out.print(s+" ");
		}
		return s;
	}
}
