package com.interviews.leetcode.easy;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {

		int[] num1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] num2 = { 2, 5, 6 };
		int n = 3;

		int[] result = mergeSortedArray(num1, m, num2, n);

		System.out.println("Result: " + Arrays.toString(result));

	}

	private static int[] mergeSortedArray(int[] num1, int m, int[] num2, int n) {

		int p1 = m - 1;
		int p2 = n - 1;
		int p3 = num1.length - 1;

		while (p3 >= 0) {
			int element1, element2;
			element1 = (p1 >= 0) ? num1[p1] : Integer.MIN_VALUE;
			element2 = (p2 >= 0) ? num2[p2] : Integer.MIN_VALUE;

			if (element1 > element2) {
				num1[p3] = element1;
				p3--;
				p1--;
			} else {
				num1[p3] = element2;
				p3--;
				p2--;
			}
		}
		return num1;
	}
}
