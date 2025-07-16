package com.interviews.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortThePeople {

	public static void main(String[] args) {

		String[] name = { "Mary", "John", "Emma" };
		int[] height = { 180, 165, 170 };

		String[] result = sortThePeopleByDecendingOrberByName(name, height);

		System.out.println("Result: " + Arrays.toString(result));
	}

	private static String[] sortThePeopleByDecendingOrberByName(String[] name, int[] height) {

		if (name.length != height.length) {
			return null;
		}

		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < name.length; i++) {

			map.put(height[i], name[i]);
		}

		Arrays.sort(height);
		System.out.println(Arrays.toString(height));
		String[] result = new String[name.length];
		int index = 0;
		System.out.println(map);
		for (int i = height.length - 1; i >= 0; i--) {
			result[index] = map.get(height[i]);
			index++;
		}

		return result;
	}
}
