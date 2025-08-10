package com.interviews.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class KDiffPairsInArray4 {

	public static void main(String[] args) {

		 int[] nums = { 3, 1, 4, 1, 5 };
	//	int[] nums = { 3, 3, 4, 4, 5 };

		int k = 2;

		int result = kDiffPairs(nums, k);

		System.out.println("Result: " + result);
		
		
		System.out.println("====================");
		
	}

	private static int kDiffPairs(int[] nums, int k) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}

		int count = 0;
		System.out.println(map);
		for (int num : map.keySet()) {
			if (k > 0 && map.containsKey(num + k)) {
				count++;
				System.out.println("num: " + num + ", K: " + k + " -> num + k: " + (num + k)+", Pairs is: ["+num+", "+k+"]");
			}

			if (k == 0 && map.get(num) > 1) {
				count++;
				System.out.println("num: " + num + ", K: " + k + ", map.get(num) = " + map.get(num));
			}
		}

		return count;
	}
}
