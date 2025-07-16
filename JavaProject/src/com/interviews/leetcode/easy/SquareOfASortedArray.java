package com.interviews.leetcode.easy;

import java.util.Arrays;

public class SquareOfASortedArray {

	public static void main(String[] args) {

		int[] arr = { -4, -1, 0, 3, 10 };

		int[] result = squareOfASortedArray(arr);

		System.out.println("Result: " + Arrays.toString(result));
	}

	private static int[] squareOfASortedArray(int[] arr) {
		int[] result = new int[arr.length];
		int left = 0;
		int right = arr.length - 1;

		for (int i = result.length - 1; i >= 0; i--) {
			int leftSquare = arr[left] * arr[left];
			int rightQquare = arr[right] * arr[right];

			if (leftSquare > rightQquare) {
				result[i] = leftSquare;
				left++;
			} else {
				result[i] = rightQquare;
				right--;
			}
		}
		return result;
	}
}
