package com.leetcode.patterns.arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] nums = {3,0,1};
		
		int result = missingNumber(nums);
		
		System.out.println("Missing Number: "+result);
	}

	private static int missingNumber(int[] nums) {
		
		int missing = 0;
        
        for(int i=0; i<nums.length; i++)
        {
            missing = missing ^ i ^ nums[i];
        }
        
        missing = missing ^ nums.length;
        
        return missing;
		
//		int n = nums.length;
//        int expectedTotal = n * (n + 1)/2;
//        
//        int total = 0;
//        
//        for(int num : nums)
//        {
//            total += num;
//        }
//        
//        return expectedTotal - total;
	}
}
