package com.leetcode.patterns.slidingwindow;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		
		int[] nums = {2, 3, 1, 2, 4, 3};
		int target = 7;
		
		int result = minSubArrayLen(nums, target);
		
		System.out.println("Returned minimal length of a contiguous subarray: "+result);
	}

	private static int minSubArrayLen(int[] nums, int target) {
		
		int result = Integer.MAX_VALUE;
		int left = 0;
		int sum  = 0;
		
		for(int i=0; i<nums.length; i++)
		{
			sum = sum + nums[i];
			
			while(sum >= target)
			{
				result = Math.min(result, i + 1 - left);
				sum = sum - nums[left];
				left++;
			}
		}
		
		return result != Integer.MAX_VALUE ? result : 0;
	}
}
