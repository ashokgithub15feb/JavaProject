package com.datastructures.recursion;

public class NestedRecursion {

	public static void main(String[] args) {

		int n = 95;
		int result = fun(n);
		System.out.println(result);
	}

	private static int fun(int n) {

		if (n > 100) {
			return n - 10;
		}
		else {
			return fun(fun(n + 11));
		}
	}
}
