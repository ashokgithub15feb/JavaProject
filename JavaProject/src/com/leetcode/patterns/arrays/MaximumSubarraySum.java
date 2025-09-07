package com.leetcode.patterns.arrays;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		
		int[] nums = {5, 4, -1, 7, 8};
		
		int result = maxSubArraySum(nums);
		
		System.out.println("Result: "+result);
	}

	private static int maxSubArraySum(int[] nums) {

		if(nums == null || nums.length == 0) return 0;
		
		int maxSum = nums[0];
		int sum = nums[0];
		
		for(int i=1; i<nums.length; i++)
		{
			if(sum < 0)
			{
				sum = nums[i];
			}else {
				sum = sum + nums[i];
			}
			maxSum = Math.max(sum, maxSum);
		}
		
		return maxSum;
	}
}
