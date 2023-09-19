package com.datastructures.recursion;

public class TailRecursion {

	public static void main(String[] args) {
		
		int n = 5;
		test(n);
	}

	private static void test(int n) {
		
		if(n > 0) {
			System.out.println(n);
			test(n - 1);
		}
	}
}
