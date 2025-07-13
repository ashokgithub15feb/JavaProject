package com.interviews.leetcode.easy;

public class ValidAnagram {

	public static void main(String[] args) {

		String s = "Anagram";
		String t = "mnagraa";

		boolean result = validAnagram(s, t);
		
		System.out.println("Result: "+result);
	}

	private static boolean validAnagram(String s, String t) {

		if (s != null && t != null && s.length() != t.length()) {
			return false;
		}
		
		s = s.toLowerCase();
		t = t.toLowerCase();

		int[] count = new int[26];

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			count[ch - 'a']++;
		}

		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			count[ch - 'a']--;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				return false;
			}
		}

		return true;
	}
}
