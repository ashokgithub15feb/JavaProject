package com.datastructures.array;

import java.util.Arrays;

public class InsertAtMiddle {

	public static void main(String[] args) {

		int[] nums = { 8, 3, 7, 12, 6, 9, 10, 11, 15, 17 };
		int index = 4;
		int newElement = 40;

		insertAtMiddle(nums, index, newElement);
	}

	private static void insertAtMiddle(int[] nums, int index, int newElement) {

		System.out.println(Arrays.toString(nums));
		int[] temp = new int[nums.length + 1];

		for (int i = 0; i < nums.length; i++) {
			temp[i] = nums[i];
		}

		if (index >= 0 && index <= temp.length) {
			for (int i = temp.length - 1; i >= index; i--) {

				if (index == i) {
					temp[i] = newElement;
					break;
				}
				temp[i] = temp[i - 1];
			}
		}
		nums = temp;
		temp = null;
		System.out.println(Arrays.toString(nums));
	}
}
