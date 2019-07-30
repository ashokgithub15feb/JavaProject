package com.ds.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	static String input = "java2novice";
	static Map<String, Integer> map = new HashMap<>();
	static String distinct = "";
	static int count = 0;
	static int j = 0;

	public static void main(String arg[]) {
		char ch[] = input.toCharArray();
		for (Character c : ch) {
			if (distinct.contains("" + c)) {
				map.put(distinct, count);

				for (int k = 0; k < count; k++) {
					if (ch[k] == c) {
						j = k + 1;
						break;
					}
				}
				count = j;
			} else {
				distinct = distinct.concat("" + c);
				count++;
			}
		}

		System.out.println(distinct);
	}
}
