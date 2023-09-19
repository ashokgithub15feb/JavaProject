package com.datastructures.recursion;

public class ExponentMPowN2 {

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
		} 
		if(n % 2 == 0) {
			return pow(m * m, n/2);
		}
		else {
			return m * pow(m * m, (n - 1)/2);
		}
	}
}
