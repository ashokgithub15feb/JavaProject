package com.datastructures.recursion;

public class CombinationFormula {

	public static void main(String[] args) {
		
		int n = 5;
		int r = 3;
	
		int result = c(n , r);
		System.out.println(result);
	}

	private static int c(int n, int r) {
		
		int t1 = 0;
		int t2 = 0;
		int t3 = 0;
		
		t1 = fact(n);
		t2 = fact(r);
		t3 = fact(n - r);
		return t1/(t2 * t3);
	}

	private static int fact(int n) {
		if(n < 0) {
			return 0;
		}
		
		if(n == 0) {
			return 1;
		}
		return fact(n - 1) * n;
	}
}
