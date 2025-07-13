package com.interviews.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	public static void main(String[] args) {

		int[] num = { 2, 3, 5, 2, 6, 3, 6, 4, 5 };

		int resultUsingMap = usingMap(num);

		System.out.println("Result UsingMap: " + resultUsingMap);
		
		int resultUsingXOR = usingXOR(num);
		
		System.out.println("Result UsingXOR: " + resultUsingXOR);
	}

	private static int usingXOR(int[] num) {
		
		int result = 0;
		
		for(int n : num) {
			
			result = result ^ n;
		}
		
		return result;
	}

	private static int usingMap(int[] num) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < num.length; i++) {

			if (map.containsKey(num[i])) {
				map.put(num[i], map.get(num[i]) + 1);
			} else {
				map.put(num[i], 1);
			}
		}
		System.out.println(map);
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return -1;
	}
}
