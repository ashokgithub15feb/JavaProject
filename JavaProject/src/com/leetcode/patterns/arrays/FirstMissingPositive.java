package com.leetcode.patterns.arrays;

public class FirstMissingPositive {

	public static void main(String[] args) {
		
		int[] nums = {9, 12, 4, 1, 2,3, -1, 8};
		
		int result = firstMissingPositive(nums);
		
		System.out.println("First Smallest Missing Number: "+result);
	}

	private static int firstMissingPositive(int[] nums) {
		
		//step 1: marks element which are out of the range and manage the presence
		boolean one = false;
		int n = nums.length;
		
		for(int i=0; i<n; i++)
		{
			if(nums[i] == 1)
			{
				one = true;
			}
			
			if(nums[i] < 1 || n < nums[i])
			{
				nums[i] = 1;
			}
		}
		
		if(one == false)
			return 1;
		
		//step 2: map the element with index
		for(int i =0; i<n; i++)
		{
			int index = Math.abs(nums[i]);
			int id = nums[index-1];
			nums[index-1] = -Math.abs(id);
		}
		//step 3: find out smallest missing positive number
		for(int i=0; i<n; i++)
		{
			//step 4: if element is +ve that means index + 1 is missing number from array
			if(nums[i] > 0)
			{
				return i + 1;
			}
		}
		
		return n + 1;
	}
}
