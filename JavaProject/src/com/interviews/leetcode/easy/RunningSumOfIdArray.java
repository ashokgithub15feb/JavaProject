package com.interviews.leetcode.easy;

import java.util.Arrays;

public class RunningSumOfIdArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };

		System.out.println("Input: " + Arrays.toString(arr));
		int[] result = runningSumOfIdArray(arr);
		System.out.println("Result: " + Arrays.toString(result));
	}

	private static int[] runningSumOfIdArray(int[] arr) {

		int sum = 0;

		for (int i = 1; i < arr.length; i++) {
			sum = arr[i] + arr[i - 1];
			arr[i] = sum;
		}

		return arr;
	}
}
