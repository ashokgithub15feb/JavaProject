package com.leetcode.patterns.binarysearch;

import java.util.Arrays;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		
		int[] nums = {1, 3, 4, 2 , 2};
		
		//int[] nums = {3,1,5,4,2};
		
		int result = findDuplicate(nums);
		
		System.out.println("Duplicate Number: "+result);
	}

	private static int findDuplicate(int[] nums) {

		int n = nums.length;
		System.out.println("Original Array: "+Arrays.toString(nums));
		int max_idx = 0;
		int curr_max = 0;
		
		for(int i=0; i<n; i++)
		{
			int id = nums[i] % n;
			
			nums[id] += n;
		}
		
		System.out.println("Modified Array: "+Arrays.toString(nums));
		
		for(int i=0; i<n ; i++)
		{
			if(nums[i] > curr_max)
			{
				curr_max = nums[i];
				
				max_idx = i;
			}
			nums[i] %= n;
		}
		
		return max_idx;
	}
}
