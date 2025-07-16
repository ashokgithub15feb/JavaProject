package com.interviews.leetcode.easy;

public class ValidMountainArray {

	public static void main(String[] args) {

		int[] arr = { 0, 2, 3, 4, 5, 2, 1, 0 };

		boolean result = validMountain(arr);
		
		System.out.println("Result: "+result);
	}

	private static boolean validMountain(int[] arr) {

		int len = arr.length;

		if (arr == null || len == 0) {
			return false;
		}

		if (len < 3) {
			return false;
		}

		int i = 0;
		int j = len - 1;

		while (i + 1 < len && arr[i] < arr[i + 1]) {
			i++;
		}

		while (j > 0 && arr[j - 1] > arr[j]) {
			j--;
		}

		if (i == j) {
			return true;
		}

		return false;
	}
}
