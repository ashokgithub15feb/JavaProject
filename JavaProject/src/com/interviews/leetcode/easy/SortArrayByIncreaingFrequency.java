package com.interviews.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortArrayByIncreaingFrequency {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 2, 3 };
		// output [3, 1, 1, 2, 2, 2]

		System.out.println("Input: " + Arrays.toString(arr));
		int[] result = sortArrayByIncreaingFrequency(arr);

		System.out.println("Result: " + Arrays.toString(result));
	}

	private static int[] sortArrayByIncreaingFrequency(int[] arr) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		List<Integer> list = new ArrayList<Integer>(map.keySet());
		System.out.println("list of key before sort: "+list);
		Comparator<Integer> co = new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {
				if (map.get(a) == map.get(b)) {
					return b - a;
				} else {
					return map.get(a) - map.get(b);
				}
			}
		};
		Collections.sort(list, co);

		System.out.println("list of key after sort: "+list);
		

		int[] result = new int[arr.length];

		int index = 0;

		for (int num : list) {
			for (int i = 0; i < map.get(num); i++) {
				result[index] = num;
				index++;
			}
		}

		return result;
	}
}
