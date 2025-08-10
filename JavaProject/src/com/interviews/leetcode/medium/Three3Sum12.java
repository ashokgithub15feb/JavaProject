package com.interviews.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Three3Sum12 {

	public static void main(String[] args) {

		int[] nums = { -1, 0, 1, 2, -1, -4 };
		// num[i]+num[j]+num[k] == 0

		Set<List<Integer>> three3Sum = three3Sum(nums);
		
		System.out.println(three3Sum);
	}

	private static Set<List<Integer>> three3Sum(int[] nums) {

		Arrays.sort(nums);
		Set<List<Integer>> set = new HashSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			int j = i + 1;
			int k = nums.length - 1;

			while (j < k) {

				int sum = nums[i] + nums[j] + nums[k];

				List<Integer> list = new ArrayList<>();
				if (sum == 0) {
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(nums[k]);
					j++;
					k--;
					set.add(list);
				} else if (sum > 0) {
					k--;
				} else {
					j++;
				}
			}
		}
		
		return set;
	}
}
