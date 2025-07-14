package com.interviews.leetcode.easy;

public class MaxConsecutiveOnceOfBinary {

	public static void main(String[] args) {

		int[] num = { 1, 1, 0, 1, 1, 1, 1 };

		int result = maxConsecutive(num);

		System.out.println("Result: " + result);
	}

	private static int maxConsecutive(int[] num) {

		int max = 0;
		int count = 0;

		for (int i = 0; i < num.length; i++) {

			if (num[i] == 1) {
				count++;

				max = Math.max(max, count);
			} else {
				count = 0;
			}
		}

		return max;
	}
}
