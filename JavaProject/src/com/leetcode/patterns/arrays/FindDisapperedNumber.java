package com.leetcode.patterns.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisapperedNumber {

	public static void main(String[] args) {
		
		int[] nums = {4, 3,2, 7, 8, 2, 3, 1, 10, 10};
		
		List<Integer> result = findDisapperedNumber(nums);
		
		System.out.println(result);
	}

	private static List<Integer> findDisapperedNumber(int[] nums) {

		System.out.println(Arrays.toString(nums));
		
		for(int i=0; i<nums.length; i++)
		{
			int curr = Math.abs(nums[i]);
			nums[curr-1] = -(Math.abs(nums[curr-1]));
			System.out.println(Arrays.toString(nums));
		}
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i] > 0)
			{
				list.add(i + 1);
			}
		}
		return list;
	}
}
