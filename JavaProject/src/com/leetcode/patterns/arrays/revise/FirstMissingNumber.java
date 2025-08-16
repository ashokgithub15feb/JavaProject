package com.leetcode.patterns.arrays.revise;

import java.util.Arrays;

public class FirstMissingNumber {

	public static void main(String[] args) {
		
		int[] nums = {4, 1, 3, 3, 5, 6};
		System.out.println(Arrays.toString(nums));
		
		int result = findMissingNumber(nums);
		System.out.println(result);
		
	}

	private static int findMissingNumber(int[] nums) {
		
		int n = nums.length -1;
		
		for(int i= 0; i < n; i++) {
			int index = Math.abs(nums[i]);
			nums[index - 1] = -Math.abs(nums[index - 1]);
			//System.out.println(Arrays.toString(nums));
		}
		
		System.out.println(Arrays.toString(nums));
		
		return 0;
	}
}
