package com.interviews.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class SortingTheSentence {

	public static void main(String[] args) {

		String str = "is2 sentence4 This1 a3";

		String result = sortingTheSentence(str);

		System.out.println("Result: " + result);
	}

	private static String sortingTheSentence(String str) {

		String[] words = str.split(" ");

		Map<Integer, String> map = new HashMap<Integer, String>();

		for (int i = 0; i < words.length; i++) {

			int len = words[i].length();

			char ch = words[i].charAt(len - 1);

			String valueOf = String.valueOf(ch);

			int num = Integer.parseInt(valueOf);

			map.put(num, words[i].substring(0, len - 1));
		}

		System.out.println(map);

		String[] result = new String[words.length];

		for (Map.Entry<Integer, String> entry : map.entrySet()) {

			int index = entry.getKey();
			result[index - 1] = entry.getValue();
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < result.length; i++) {

			sb.append(result[i]).append(" ");
			if (i != result.length - 1) {
				sb.append(" ");
			}
		}

		// return sb.toString().trim();
		return sb.toString();
	}
}
