package com.interviews.leetcode.easy;

public class SignOfThProductOfAnArray {

	public static void main(String[] args) {

		int[] num = { -1, -2, -3, -4, 3, 2, 1 };

		int result = signOfThProductOfAnArray(num);
		
		System.out.println(result);
	}

	private static int signOfThProductOfAnArray(int[] num) {

		int countNegativeNumber = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 0) {
				return 0;
			}

			if (num[i] < 0) {
				countNegativeNumber++;
			}

			if (countNegativeNumber % 2 == 0) {
				return 1;
			}
		}

		return -1;
	}
}
