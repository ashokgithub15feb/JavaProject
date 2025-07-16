package com.interviews.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElement {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 6, 3, 7};

		int result = sumOfUniqueElement(arr);
		
		System.out.println("Result: "+result);
	}

	private static int sumOfUniqueElement(int[] arr) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		int sum  = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				sum += entry.getKey();
			}
		}
		return sum;
	}
}
