package com.interviews.leetcode.easy;

public class FindNumberOfWithEvenNumberOfDigit {

	public static void main(String[] args) {

		int[] arr = { 12, 345, 2, 6, 7896 };

		int result = findNumberOfWithEvenNumberOfDigit(arr);

		System.out.println("Result: " + result);
	}

	private static int findNumberOfWithEvenNumberOfDigit(int[] arr) {

		if (arr == null || arr.length == 0) {
			return 0;
		}

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			int noOfDigit = 0;
			while (arr[i] != 0) {
				arr[i] = arr[i] / 10;
				noOfDigit++;
			}

			if (noOfDigit % 2 == 0) {
				count++;
			}
		}

		return count;
	}
}
