package com.ds.array;

import java.util.HashMap;
import java.util.Map;

public class AdditionOfTwoNumTargentNum {

	public static void main(String[] args) {
		
		int[] nums = {2,7,11,15};
		//int[] nums = {3,2,4};
		int target = 9;
		
		getTargetNumber(nums, target);
		System.out.println("=====================");
		getTargetNumUsingHashMap(nums, target);
	}

	private static void getTargetNumber(int[] nums, int target) {
		
		int i = 0;
		int j = nums.length-1;
		
		while(i < j)
		{
			if(nums[i] + nums[j] == target)
			{
				System.out.println("Result: ["+i+", "+j+"]");
				return;
			} else if(nums[i] + nums[j] > target){
				j--;
			}
			else {
				i++;
			}
		}
	}
	
	private static void getTargetNumUsingHashMap(int[] nums, int target)
	{
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<nums.length; i++)
		{
			int complement = target - nums[i];
			
			if(map.containsKey(complement))
			{
				System.out.println("Result: ["+map.get(complement)+", "+ i+"]");
				return;
			}
			else {
				map.put(nums[i], i);
			}
		}
	}
}
