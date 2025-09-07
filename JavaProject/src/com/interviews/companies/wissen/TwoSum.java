package com.interviews.companies.wissen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 2, 4, 5, 1, 3 };

		int target = 7;

		//twoSum(nums, target);
		
		int[] twoSum1 = twoSum1(nums, target);
		
		System.out.println(Arrays.toString(twoSum1));
		
		//twoSum(nums, target);
	}

	private static void twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();
		//Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int count = 0;

		int left = 0;
		int right = nums.length - 1;

		while (left < right) {

			if (nums[left] + nums[right] == target) {
				
				count++;
				left++;
				right--;
			} else if (nums[left] + nums[right] > target) {
				right--;
			} else if (nums[left] + nums[right] < target) {
				left++;
			}
		}

		//System.out.println("Count: "+count);
	}
	
	public static int[] twoSum1(int[] nums, int target) {
		System.out.println(Arrays.toString(nums));
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		int[] res = new int[nums.length + 1];
		int index =  0;
		
		for(int i = 0; i< nums.length; i++) {
			int diff = target - nums[i];
			
			if(map.containsKey(diff)) {
				count++;
				res[index++] = map.get(diff);
				res[index++] = i;
				//return new int[] {map.get(diff), i};
			}
			map.put(nums[i], i);
		}
		
		//return new int[] {-1, -1};
		System.out.println("count: "+count);
		return res;
	}
}
