package com.interviews.leetcode.easy;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingSomeElement {

	public static void main(String[] args) {

		// int[] arr = {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3};
		int[] arr = { 6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0 };
		double removingTheSmallest = 0.05;
		double result = trimMean(arr, removingTheSmallest);
		System.out.println("Result: " + result);
	}

	private static double trimMean(int[] arr, double removingTheSmallest) {

		Arrays.sort(arr);
		int len = arr.length;
		int limit = (int) removingTheSmallest * len;
		int start = limit;
		int end = len - 1;
		int sum = 0;
		int new_lenth = 0;

		for (int i = start; i <= end; i++) {
			sum += arr[i];
			new_lenth++;
		}

		double avg = sum / new_lenth;
		return avg;
	}
}
