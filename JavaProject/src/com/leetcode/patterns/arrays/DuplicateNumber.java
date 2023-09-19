package com.leetcode.patterns.arrays;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		int[] nums = {1, 3, 3, 2, 3, 5};
		
		int result = findDuplicate(nums);
		
		System.out.println("Result: "+result);
		
		int[] nums2 = {3, 4, 1, 4, 2};
		
		int result2 = findDuplicate2(nums2);
		
		System.out.println("Result2: "+result2);
		
	}

	private static int findDuplicate(int[] nums) {
		
		if(nums == null || nums.length == 0) return -1;
		
		for(int i = 0; i< nums.length; i++)
		{
			int index = Math.abs(nums[i]);
			
			if(nums[index] < 0 ) return index;
			
//			nums[index] = -nums[index];
			nums[index] = -Math.abs(nums[index]);
		}
		
		return -1;
	}
	
	private static int findDuplicate2(int[] nums) {
		
		if(nums == null || nums.length == 0) return -1;
		
		int f = nums[0];
		int s = nums[0];
		
		do
		{
			s = nums[s];
			f = nums[nums[f]];
		}while(s != f);
		
		f = nums[0];
		while(f != s)
		{
			f = nums[f];
			s = nums[s];
		}
		return f;
	}
}
