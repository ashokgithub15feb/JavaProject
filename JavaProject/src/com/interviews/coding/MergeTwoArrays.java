package com.interviews.coding;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {

		int[] a = { 2, 10, 18, 20, 23 };
		int[] b = { 4, 9, 19, 25 };

		int m = a.length - 1;
		int n = b.length - 1;

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		mergerTwoArray(a, b, m, n);

	}

	private static void mergerTwoArray(int[] a, int[] b, int m, int n) {

		int i = 0;
		int j = 0;
		int k = 0;
		int[] c = new int[m + n];

		while (i < m && j < n) {
			if (a[i] < b[j]) {
				c[k++] = a[i++];
			} else {
				c[k++] = b[j++];
			}
		}

		for (; i < m; i++) {
			c[k++] = a[i];
		}

		for (; j < n; j++) {
			c[k++] = b[j];
		}

		System.out.println(Arrays.toString(c));
	}
}
