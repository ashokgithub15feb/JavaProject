package com.interviews.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class CountPairOfString73 {

	public static void main(String[] args) {

		String[] str = { "aba", "aabb", "abcd", "bca", "aabc" };

		int result = countPairOfString(str);

		System.out.println("Result: " + result);
	}

	private static int countPairOfString(String[] str) {
		int count = 0;
		for (int i = 0; i < str.length - 1; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (checkPair(str[i], str[j])) {
					count++;
				}
			}
		}

		return count;
	}

	private static boolean checkPair(String s, String t) {

		Set<Character> s_set = new HashSet<Character>();
		Set<Character> t_set = new HashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			s_set.add(s.charAt(i));
		}

		for (int i = 0; i < t.length(); i++) {
			t_set.add(t.charAt(i));
		}

		if (s_set.equals(t_set)) {
			return true;
		}
		return false;
	}
}
