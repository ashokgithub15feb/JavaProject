package com.leetcode.patterns.arrays.revise;

import java.util.ArrayList;
import java.util.List;

public class DisappearsNumbs {

	public static void main(String[] args) {
		
		int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
		
		List<Integer> res = disapperars(nums);
		
		System.out.println(res);
	}

	private static List<Integer> disapperars(int[] nums) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<nums.length; i++)
		{
			int index = Math.abs(nums[i]) - 1;
			
			if(nums[index] > 0)
			{
				nums[index] = nums[index] * -1;
			}
		}
		
		for(int i=0; i< nums.length ;i++)
		{
			if(nums[i] > 0)
			{
				int edata = i + 1;
				list.add(edata);
				list.add(nums[edata]);// added data on particular index
			}
		}
		return list;
		
	}
}
