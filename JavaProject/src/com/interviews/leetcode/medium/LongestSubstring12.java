package com.interviews.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring12 {

	public static void main(String[] args) {

		//String s = "abcabcbb";
		
//		String s = "ababc";
		
		String s = "abcdecbeadf";

		int result = longestSunstring(s);

		System.out.println("Result: " + result);
		
		int result1 = longestSunstring1(s);

		System.out.println("Result1: " + result1);
	}

	
	private static int longestSunstring1(String s) {
		
		int[] count = new int[s.length()];
		int first = 0;
		int second = 0;
		int len = 0;
		
		while(second < s.length()) {
			while(count[s.charAt(second) - 'a'] == 0) {
				count[s.charAt(first) - 'a']++;
			}
			count[s.charAt(s.charAt(second)) - 'a'] = 1;
			len = Math.max(len, second - first);
			
			second++;
		}
		
		return len;
	}
	
	private static int longestSunstring(String s) {

		Set<Character> set = new HashSet<>();

		int max = 0;

		int left = 0;

		for (int right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);
			while (set.contains(ch)) {
				set.remove(s.charAt(left));
				left++; 
			}
			set.add(ch);
			int len = right - left + 1;
			max = Math.max(max, len);
		}

		return max;
	}
}
