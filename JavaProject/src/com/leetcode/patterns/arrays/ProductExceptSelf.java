package com.leetcode.patterns.arrays;

import java.util.Arrays;

public class ProductExceptSelf {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4};
		System.out.println(Arrays.toString(nums));
		int[] result = new int[nums.length];
		
		int rp = 1;
		
		//left pass
		
		for(int i=0; i<nums.length; i++)
		{
			result[i] = rp;
			rp = rp * nums[i];
			
			System.out.println(Arrays.toString(result));
		}
		
		//right pass
		System.out.println("---------------------------");
		rp = 1;
		
		for(int i=nums.length-1; i >= 0; i--)
		{
			result[i] = result[i] * rp;
			rp = rp * nums[i];
			
			System.out.println(Arrays.toString(result));
		}
		
		System.out.println("Result: "+Arrays.toString(result));
		
	}
}
