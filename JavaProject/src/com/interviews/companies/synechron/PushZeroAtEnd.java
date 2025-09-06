package com.interviews.companies.synechron;

import java.util.Arrays;

public class PushZeroAtEnd {

	public static void main(String[] args) {

		int[] input = new int[] { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0 };
		// push zero at end output be like 1,9,8,4,2,7,6,0,0,0,0
		zeroPushToEnd(input);

		System.out.println(Arrays.toString(input));
	}

	private static void zeroPushToEnd(int[] input) {

		int left = 0;
		int right = input.length - 1;

		while (left <= right) {

			if (input[left] == 0 && input[right] != 0) {
				int temp = input[left];
				input[left] = input[right];
				input[right] = temp;
				left++;
				right--;
			} else if (input[left] != 0 && input[right] == 0) {
				left++;
				right--;
			} else if (input[left] != 0 && input[right] != 0) {
				left++;
			} else if (input[left] != 0) {
				left++;
			} else if (input[right] == 0) {
				right--;
			} else if (input[left] == 0) {
				int temp = input[left];
				input[right] = input[left];
				input[right] = temp;
				left++;
				right--;
			}
		}
	}
}
