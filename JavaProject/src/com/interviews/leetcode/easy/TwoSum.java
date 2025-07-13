package com.interviews.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int[] num = { 2, 11, 7, 15 };
		int target = 9;

		try {
			int[] result = twoSum(num, target);

			System.out.println("Result: "+Arrays.toString(result));
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException: "+e.getMessage());
		}
	}

	private static int[] twoSum(int[] num, int target) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < num.length; i++) {
			int temp = target - num[i];
			if (map.containsKey(temp)) {
				return new int[] { map.get(temp), i };
			} else {
				map.put(num[i], i);
			}
		}

		throw new IllegalArgumentException("No Match");
	}
}
