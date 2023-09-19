package com.leetcode.patterns.arrays.revise;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateInArray {

	public static void main(String[] args) {
		
		int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
		
		List<Integer> result = findAllDuplicate(nums);
		System.out.println(result);
	}

	private static List<Integer> findAllDuplicate(int[] nums) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<nums.length; i++)
		{
			int index = Math.abs(nums[i]) - 1;
			
			int val = nums[index];
			
			if(val < 0)
			{
				list.add(index+1);
			}
			else
			{
				nums[index] *= -1;
			}
		}
		
		return list;
	}
}
