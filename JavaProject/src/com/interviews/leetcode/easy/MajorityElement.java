package com.interviews.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {

		int[] num = { 2, 2, 1, 1, 1, 2, 2 };

		int result = getMajorityElement(num);
		
		System.out.println("Result: "+result);
	}

	private static int getMajorityElement(int[] num) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < num.length; i++) {
			if (map.containsKey(num[i])) {
				map.put(num[i], map.get(num[i]) + 1);
			} else {
				map.put(num[i], 1);
			}
		}

		int majority = num.length / 2;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() > majority) {
				return entry.getKey();
			}
		}

		return -1;
	}
}
