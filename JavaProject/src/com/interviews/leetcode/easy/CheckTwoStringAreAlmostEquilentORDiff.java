package com.interviews.leetcode.easy;

public class CheckTwoStringAreAlmostEquilentORDiff {

	public static void main(String[] args) {

		String w1 = "aaaa";
		String w2 = "bccb";

		// String w1 = "abcdeef";
		// String w2 = "abaaacc";

		boolean result = checkTwoStringAreAlmostEquilentORDiff(w1, w2);

		System.out.println("Result: " + result);
	}

	private static boolean checkTwoStringAreAlmostEquilentORDiff(String w1, String w2) {

		int[] f1 = new int[26];
		int[] f2 = new int[26];

		for (int i = 0; i < w1.length(); i++) {
			f1[w1.charAt(i) - 'a']++;
		}

		for (int i = 0; i < w2.length(); i++) {
			f2[w2.charAt(i) - 'a']++;
		}

		int count = 0;

		for (int i = 0; i < 26; i++) {
			int abs = Math.abs(f1[i] - f2[i]);
			System.out.println(abs);
			if (abs > 3) {
				count++;
				break;
			}
		}
		System.out.println("count: " + count);
		if (count == 1) {
			return false;
		}
		return true;
	}
}
