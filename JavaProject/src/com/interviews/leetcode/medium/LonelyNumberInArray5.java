package com.interviews.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyNumberInArray5 {

	public static void main(String[] args) {

		int[] nums = { 10, 5, 6, 8 };

		List<Integer> result = lonelyNumber(nums);

		System.out.println("Result: " + result);
	}

	private static List<Integer> lonelyNumber(int[] nums) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}

		List<Integer> list = new ArrayList<>();

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1
					&& !(map.containsKey(entry.getKey() + 1) || map.containsKey(entry.getKey() - 1))) {
				list.add(entry.getKey());
			}
		}

		return list;
	}
}
