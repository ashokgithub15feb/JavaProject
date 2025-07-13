package com.interviews.leetcode.easy;

import java.util.Arrays;

public class MoveZero {

	public static void main(String[] args) {

		int[] num = { 0, 1, 0, 3, 1, 2 };

		int[] result = moveZero(num);
		
		System.out.println("Result: "+Arrays.toString(result));
	}

	private static int[] moveZero(int[] num) {

		int index = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] != 0) {
				num[index] = num[i];
				index++;
			}
		}

		for (int i = index; i < num.length; i++) {
			num[i] = 0;
		}
		return num;
	}
}
