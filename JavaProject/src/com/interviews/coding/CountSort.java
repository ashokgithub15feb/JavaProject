package com.interviews.coding;

import java.util.Arrays;

public class CountSort {

	public static void main(String[] args) {

		int[] nums = { 6, 3, 9, 10, 15, 6, 8, 12, 3, 6 };

		
		
		int n = nums.length - 1;

		System.out.println(Arrays.toString(nums));
		countSort(nums, n);
	}

	private static void countSort(int[] nums, int n) {

		int max = 0;
		int min = 0;

		for (int i = 0; i < n; i++) {
			if (min > nums[i]) {
				min = nums[i];
			}

			if (max < nums[i]) {
				max = nums[i];
			}
		}

		int[] tempArr = new int[max + 1];

		for (int i = 0; i <= n; i++) {
			tempArr[nums[i]]++;
		}

		int i = 0;
		int j = 0;

		while (i < max + 1) {
			if (tempArr[i] > 0) {
				nums[j++] = i;
				tempArr[i]--;
			} else {
				i++;
			}
		}

		System.out.println(Arrays.toString(nums));
	}
}
