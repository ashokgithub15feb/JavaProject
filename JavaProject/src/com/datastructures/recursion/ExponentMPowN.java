package com.datastructures.recursion;

public class ExponentMPowN {

	public static void main(String[] args) {
		
		int m = 2;
		int n = 5;
		
		int result = pow(m, n);
		System.out.println(result);
	}

	private static int pow(int m, int n) {
		
		if(n < 0) {
			return 0;
		}
		
		if(n == 0) {
			return 1;
		} else {
			return pow(m, n - 1) * m;
		}
	}
}
