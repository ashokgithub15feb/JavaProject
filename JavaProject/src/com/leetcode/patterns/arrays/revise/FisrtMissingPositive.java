package com.leetcode.patterns.arrays.revise;

import java.util.Arrays;

public class FisrtMissingPositive {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 0};
		
		int res = findMissing(nums);
		System.out.println(res);
	}

	private static int findMissing(int[] nums) {
		
		int n = nums.length;
		boolean isOne = false;
		
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i] == 1) isOne = true;
			
			if(nums[i] < 0 || n < nums[i]) nums[i] = 1;
		}
		
		if(isOne == false) return 1;
		
		for(int i=0; i<nums.length; i++)
		{
			int index = Math.abs(nums[i]);
			
			nums[index - 1] = -Math.abs(nums[index-1]);
		}
		
		System.out.println(Arrays.toString(nums));
		
		for(int i=0; i<nums.length; i++)
		{
			if(nums[0] > 0)
			{
				return i + 1;
			}
		}
		return n + 1;
	}
}
