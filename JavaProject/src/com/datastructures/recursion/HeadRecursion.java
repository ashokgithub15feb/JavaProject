package com.datastructures.recursion;

public class HeadRecursion {

	public static void main(String[] args) {
		
		int n = 5;
		test(n);
	}

	private static void test(int n) {
		
		if(n > 0) {
			test(n - 1);
			System.out.println(n);
		}
	}
}
