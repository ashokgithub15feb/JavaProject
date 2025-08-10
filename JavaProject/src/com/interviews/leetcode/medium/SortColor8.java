package com.interviews.leetcode.medium;

import java.util.Arrays;

public class SortColor8 {

	public static void main(String[] args) {
		
		int[] nums = {2, 0, 2, 1, 1, 0};
		
		//red - 0
		//white - 1
		//blue - 2
		
		int[] result = sortColor(nums);
		
		System.out.println("Result: "+Arrays.toString(result));
	}

	private static int[] sortColor(int[] nums) {
		
		int i = 0;
		int zeroPoint = 0;
		int lastPoint = nums.length - 1;
		
		while(i <= lastPoint) {
			
			if(nums[i] == 0) {
				int temp = nums[i];
				nums[i] = nums[lastPoint];
				nums[lastPoint] = temp;
				i++;
				zeroPoint++;
			} else if(nums[i] == 2) {
				int temp = nums[i];
				nums[i] = nums[lastPoint];
				nums[lastPoint] = temp;
				lastPoint--;
			} else {
				i++;
			}
			System.out.println(Arrays.toString(nums));
		}
		
		return nums;
	}
}
