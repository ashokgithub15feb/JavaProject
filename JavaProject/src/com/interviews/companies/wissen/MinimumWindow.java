package com.interviews.companies.wissen;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindow {

	public static String minimumWindow(String s, String t) {

		Map<Character, Integer> map = new HashMap<>();

		int n = s.length();

		if (t == null || t.length() == 0 || t.length() > n) {
			return "String t size greater then s string: " + t;
		}

		for (char ch : t.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		int requiredCount = t.length();

		int i = 0;
		int j = 0;

		int minimumWindowSize = Integer.MAX_VALUE;
		int start_i = 0;

		while (j < n) {

			char ch = s.charAt(j);

			if (!map.containsKey(ch)) {
				map.put(ch, -1);
			}

			if (map.get(ch) > 0) {
				requiredCount--;
			}

			map.put(ch, map.get(ch) - 1);

			while (requiredCount == 0) {
				// start shrinking the window

				int currentWindowSize = j - i + 1;

				if (minimumWindowSize > currentWindowSize) {
					minimumWindowSize = currentWindowSize;
					start_i = i;
				}

				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);

				if (map.get(s.charAt(i)) > 0) {
					requiredCount++;
				}
				i++;
			}
			j++;
		}

		System.out.println(start_i+" : "+minimumWindowSize+" : "+j);
		return minimumWindowSize == Integer.MAX_VALUE ? "" : s.substring(start_i, j);
	}

	public static void main(String[] args) {

		String s = "ADOBECODEBANC";
		String t = "ABC";

		System.out.println("s: " + s);
		System.out.println("t: " + t);
		String result = minimumWindow(s, t);

		System.out.println("Minimum Window: " + result);
	}
}
