package com.datastructures.array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		int[] nums = {10, 18, 4, 5, 9, 6, 16, 12};
		
		System.out.println(Arrays.toString(nums));
		
		sortArray(nums);
		
		System.out.println(Arrays.toString(nums));
	}

	private static void sortArray(int[] nums) {
	
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
}
