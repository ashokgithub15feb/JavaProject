package com.interviews.companies.persistent;

public class LeftOfSumAndRightSideSumIsAvailable {

	public static void main(String[] args) {
		
		int[] nums = {3, 2, 15, 4, 1};
		
		int index = patternMatching(nums);
		
		System.out.println(index);
	}

	private static int patternMatching(int[] nums) {
		
		int totalSum = 0;
		
		for(int i=0; i < nums.length; i++) {
			totalSum += nums[i];
		}
		
		int leftSum = 0;
		
		for(int i=0; i< nums.length; i++) {
			
			totalSum -= nums[i];
			
			if(totalSum == leftSum) {
				return i;
			}
			
			leftSum += nums[i];
		}
		
		totalSum = 0;
		
		for(int i=0; i < nums.length; i++) {
			totalSum += nums[i];
		}
		
		int rightSum = 0;
		
		for(int i=nums.length-1 ; i>=0; i--) {
			totalSum -= nums[i];
			
			if(totalSum == rightSum) {
				return i;
			}
			
			rightSum += nums[i];
		}
		
		return -1;
	}
}
