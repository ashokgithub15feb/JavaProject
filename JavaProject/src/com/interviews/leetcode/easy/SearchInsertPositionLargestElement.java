package com.interviews.leetcode.easy;

import java.util.Arrays;

public class SearchInsertPositionLargestElement {

	public static void main(String[] args) {
		int[] num = { 1, 3, 5, 6 };
		int target = 5;

		int result = searchInsert(num, target);

		System.out.println("Input: " + Arrays.toString(num) + "\nResult: " + result);
	}

	private static int searchInsert(int[] num, int target) {

		int left = 0;
		int right = num.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (num[mid] == target) {
				return mid;
			} else if (num[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return left;
	}
}
