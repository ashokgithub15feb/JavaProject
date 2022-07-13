package com.leetcode.patterns.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContaingDuplicate {

	public static void main(String[] args)
	{
		int[] nums = {1, 2, 2, 3, 4};
		
		System.out.println("Nums: is contains duplicate: "+containsDuplicate(nums));
	}

	private static boolean containsDuplicate(int[] nums) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<nums.length; i++)
		{
			if(set.contains(nums[i]))
			{
				return true;
			}
			set.add(nums[i]);
		}
		
		return false;
	}
}
