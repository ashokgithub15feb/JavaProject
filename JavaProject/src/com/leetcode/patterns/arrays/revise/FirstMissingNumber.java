package com.leetcode.patterns.arrays.revise;

import java.util.Arrays;

public class FirstMissingNumber {

	public static void main(String[] args) {
		
		int[] nums = {9, 12, 4, 1, 2, -1, 8};
		System.out.println(Arrays.toString(nums));
		
		int result = findMissingNumber(nums);
		System.out.println(result);
		
	}

	private static int findMissingNumber(int[] nums) {
		
		int n = nums.length;
		
		for(int i= 0; i < n; i++) {
			int index = Math.abs(nums[i]);
			nums[index - 1] = -Math.abs(nums[index - 1]);
		}
		
		System.out.println(Arrays.toString(nums));
		
		return 0;
	}
}
