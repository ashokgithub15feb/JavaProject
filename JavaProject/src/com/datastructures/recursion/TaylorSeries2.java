package com.datastructures.recursion;

public class TaylorSeries2 {

	public static void main(String[] args) {
		
		int x = 1;
		int n = 10;
		
		double result = e(x, n);
		System.out.println(result);
	}

	private static double e(int x, int n) {
		
		double res = 1;
		if(n == 0) {
			return 1;
		}
		
		for(; n > 0 ; n--) {
			res = 1 + x/n * res;
		}
		return res;
	}
}
