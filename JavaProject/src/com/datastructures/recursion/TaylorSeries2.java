package com.datastructures.recursion;

public class TaylorSeries2 {

	private static double sum = 0;

	public static void main(String[] args) {

		int x = 1;
		int n = 10;

		double result = e(x, n);
		System.out.println(result);

		double result1 = e1(x, n);
		System.out.println(result1);
	}

	private static double e(int x, int n) {

		double res = 1;
		if (n == 0) {
			return 1;
		}

		for (; n > 0; n--) {
			res = 1 + (x * res) / n;
		}
		return res;
	}

	private static double e1(int x, int n) {

		if (n == 0) {
			return sum;
		}
		sum = 1 + (x * sum) / n;
		return e1(x, n - 1);
	}

}
