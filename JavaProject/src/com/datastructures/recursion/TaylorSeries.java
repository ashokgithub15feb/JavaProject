package com.datastructures.recursion;

public class TaylorSeries {

	private static double POWER = 1;
	private static double FACTORIAL = 1;
	
	public static void main(String[] args) {
		
		int x = 1;
		int n = 10;
		
		double result = e(x, n);
		System.out.println(result);
	}

	private static double e(int x, int n) {
		
		double res = 0;
		if(n == 0) {
			return 1;
		}
		else {
			res = e(x, n - 1);
			POWER = POWER * x;
			FACTORIAL = FACTORIAL * n;
			return res + POWER/FACTORIAL;
		}
	}
}
