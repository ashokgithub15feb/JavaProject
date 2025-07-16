package com.interviews.leetcode.easy;

import java.util.Arrays;

public class ConcatationOfArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1 };

		int[] result = concatationOfArray(arr);
		
		System.out.println("Result: "+Arrays.toString(result));
	}

	private static int[] concatationOfArray(int[] arr) {

		int[] ans = new int[arr.length * 2];

		for (int i = 0; i < arr.length; i++) {
			ans[i] = arr[i];
		}

		int index = arr.length;

		for (int i = 0; i < arr.length; i++) {
			ans[index] = arr[i];
			index++;
		}

		return ans;
	}
}
