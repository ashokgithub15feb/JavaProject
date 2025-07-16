package com.interviews.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class CountCommonWordWithOneOccuranceTwoWord {

	public static void main(String[] args) {

		String[] words1 = { "leetcode", "is", "amazing", "as", "is" };
		String[] words2 = { "amazing", "leetcode", "is" };

		int result = countCommonWordWithOneOccuranceTwoWord(words1, words2);
		
		System.out.println("Result: "+result);

	}

	private static int countCommonWordWithOneOccuranceTwoWord(String[] words1, String[] words2) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < words1.length; i++) {

			if (map.containsKey(words1[i])) {
				map.put(words1[i], map.get(words1[i]) + 1);
			} else {
				map.put(words1[i], 1);
			}
		}

		for (String word : words2) {
			if (map.containsKey(word)) {
				if (map.get(word) <= 1) {
					map.put(word, map.get(word) - 1);
				}
			}
		}
		System.out.println(map);
		int count = 0;

		for (String w : words1) {
			if (map.get(w) == 0) {
				count++;
			}
		}
		return count;
	}
}
