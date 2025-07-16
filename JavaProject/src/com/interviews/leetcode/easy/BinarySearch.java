package com.interviews.leetcode.easy;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { -1, 0, 3, 5, 9, 12 };
		int target = 9;

		int result = binarySearch(arr, target);

		System.out.println("Resul: " + result);
	}

	private static int binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return -1;
	}
}
