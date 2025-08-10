package com.interviews.coding;

import java.util.Arrays;

public class SortAllZeroOneSize {

	public static void main(String[] args) {

		int[] nums = { 1, 0, 1, 0, 1, 1, 0, 0 };

		//bubbleSort(nums);
		insertionSort(nums);
	}

	private static void insertionSort(int[] nums) {
		
		for(int i=1; i < nums.length; i++) {
			int k = nums[i];
			int j =  i - 1;
			
			while( j >= 0 && nums[j] > k) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = k;
		}
		System.out.println(Arrays.toString(nums));
	}

	private static void bubbleSort(int[] nums) {
		System.out.println(Arrays.toString(nums));
		boolean swap = false;
		for (int i = 0; i < nums.length - 1; i++) {
			swap = false;
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					swap = true;
				}
			}

			if (!swap) {
				break;
			}
		}

		System.out.println(Arrays.toString(nums));
	}

}
