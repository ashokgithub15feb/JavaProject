package com.leetcode.patterns.practice;

public class P1 {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 5, 0};
		
		int re = missingNums(nums);
		
		System.out.println(re);
	}

	private static int missingNums(int[] nums) {
		
		int n = nums.length;
		int et = (n * (n + 1))/2;
		int t = 0;
		
		for(int i =0; i<nums.length; i++)
		{
			t = t + nums[i];
		}
		
		return et - t;
	}
}
