package com.leetcode.patterns.practice;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumMedium {

	public static void main(String[] args) {
		
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		int[] result = towSum(nums, target);
		
		System.out.println("Two Sum: "+Arrays.toString(result));
	}

	private static int[] towSum(int[] nums, int target) {
		
		int[] result = new int[2];
		HashMap<Integer, Integer> index = new HashMap<>();
		
		for(int i=0; i<nums.length; i++)
		{
			if(index.containsKey(target - nums[i]))
			{
				result[0] = index.get(target - nums[i]);
				result[1] = i;
				
				return result;
			}
			index.put(nums[i], i);
		}
		return result;
	}
}







