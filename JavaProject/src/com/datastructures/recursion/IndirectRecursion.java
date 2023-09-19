package com.datastructures.recursion;

public class IndirectRecursion {

	public static void main(String[] args) {

		int n = 20;
		testA(n);
	}

	private static void testA(int n) {

		if (n > 0) {
			System.out.println(n);
			testB(n - 1);
		}
	}

	private static void testB(int n) {

		if (n > 1) {
			System.out.println(n);
			testA(n / 2);
		}
	}
}
