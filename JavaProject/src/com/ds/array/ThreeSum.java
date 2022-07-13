package com.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ThreeSum {

	public static void main(String[] args) {
		
		int[] nums = {7, 12, 3, 1, 2, -6, 5, -8, 6};
		int target = 0;
		
		List<Integer[]> results = getTargetNumb(nums, target);
		
		results.stream().forEach(f -> System.out.println(Arrays.toString(f)));
	}

	private static List<Integer[]> getTargetNumb(int[] nums, int target) {
		
		List<Integer[]> result = new ArrayList<>();
		
		for(int i=0; i<nums.length; i++)
		{
			int currentTarget = target - nums[i];
			Set<Integer> set = new HashSet<>();
			
			for(int j=i+1; j<nums.length; j++)
			{
				if(set.contains(currentTarget - nums[j]))
				{
					result.add(new Integer[] {nums[i], nums[j], currentTarget - nums[j]});
				}
				else
				{
					set.add(nums[j]);
				}
			}
		}
		
		return result;
	}
}
