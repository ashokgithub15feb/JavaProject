package com.datastructures.recursion;

public class TreeRecursion {

	public static void main(String[] args) {
		
		int n = 3;
		test(n);
	}

	private static void test(int n) {
		
		if(n > 0) {
			System.out.println(n); 
			test(n - 1);
			test(n - 1);
		}
	}
}
