package com.datastructures.array;

import java.util.Arrays;

public class InsertAtDeletionInMiddle {

	public static void main(String[] args) {

		int[] nums = { 8, 3, 7, 12, 6, 9, 10, 11, 15, 17 };
		int index = 4;

		insertAtDeletionInMiddle(nums, index);
	}

	private static void insertAtDeletionInMiddle(int[] nums, int index) {

		System.out.println(Arrays.toString(nums));
		int[] temp = new int[nums.length - 1];

		if (index >= 0 && index <= temp.length) {
			for (int i = 0, k = 0; i < nums.length; i++) {

				if (index == i) {
					continue;
				}
				temp[k++] = nums[i];
			}
		}
		nums = temp;
		temp = null;
		System.out.println(Arrays.toString(nums));
	}
}
