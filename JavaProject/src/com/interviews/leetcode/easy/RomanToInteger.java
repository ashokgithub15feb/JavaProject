package com.interviews.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {

		String roman = "XLIV";

		int number = romanToInt(roman);

		System.out.println("Input: " + roman + "\nResult: " + number);
	}

	private static int romanToInt(String roman) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		char[] ch = roman.toCharArray();

		int result = 0;
		int i = 0;
		int j = 0;

		for (i = 0, j = 1; j < ch.length; i++, j++) {

			if (map.get(ch[i]) >= map.get(ch[j])) {
				result = result + map.get(ch[i]);
			} else {
				result = result - map.get(ch[i]);
			}
		}
		result = result + map.get(ch[i]);
		return result;
	}
}
