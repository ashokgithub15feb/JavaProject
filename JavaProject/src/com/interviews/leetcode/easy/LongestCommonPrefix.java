package com.interviews.leetcode.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] str = { "flower", "flow", "flight" };

		String result = longestCommonPrefix(str);

		System.out.println("Input: " + Arrays.toString(str) + "\nResult: " + result);
	}

	private static String longestCommonPrefix(String[] str) {

		if (str == null || str.length == 0) {
			return "";
		}

		for (int i = 0; i < str.length; i++) {
			char ch = str[0].charAt(i);
			for (int j = 1; j < str.length; j++) {
				if (str[j].charAt(i) != ch) { //i == str[j].length() || str[j].charAt(i) != ch
					return str[0].substring(0, i);
				}
			}
		}
		return str[0];
	}
}
