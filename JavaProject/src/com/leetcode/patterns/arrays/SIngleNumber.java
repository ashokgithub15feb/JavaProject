package com.leetcode.patterns.arrays;

public class SIngleNumber {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 2, 3, 1, 9};
		
		int result = singleNumber(nums);
		
		System.out.println("Result: Single Number: "+result);
	}

	private static int singleNumber(int[] nums) {
		
		int sn = 0;
		
		for(int i=0; i<nums.length; i++)
		{
			sn = sn ^ nums[i];
		}
		
		return sn;
	}
}
