package com.interviews.leetcode.easy;

import java.util.Arrays;

public class CountingBits {

	public static void main(String[] args) {

		int n = 5;

		int[] result = countingBits(n);

		System.out.println("Result: " + Arrays.toString(result));
	}

	private static int[] countingBits(int n) {

		int[] ans = new int[n + 1];

		ans[0] = 0;

		for (int i = 1; i <= n; i++) {
			String binary = Integer.toBinaryString(i);

			int count = countOnce(binary);

			ans[i] = count;
		}

		return ans;
	}

	private static int countOnce(String nums) {

		int count = 0;

		for (int i = 0; i < nums.length(); i++) {
			char ch = nums.charAt(i);

			if (ch == '1') {
				count++;
			}
		}

		return count;
	}
}
