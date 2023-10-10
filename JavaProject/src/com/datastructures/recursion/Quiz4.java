package com.datastructures.recursion;

public class Quiz4 {

	public static void main(String[] args) {
		
		int n = 5;
		int result = f(n);
		System.out.println(result);
	}

	private static int f(int n) {
		
		int x = 1;
		if(n == 1)
			return x;
		for(int k = 1; k < n ; k++) {
			x = x + f(k) * f(n - k);
		}
		return x;
	}
}
