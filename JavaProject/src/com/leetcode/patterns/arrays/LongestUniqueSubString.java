package com.leetcode.patterns.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubString {

	public static void main(String[] args) {
		
		String s = "abcacbbb";
		
		int result = findLongestUniqueSubString(s);
		
		System.out.println(result);
	}

	private static int findLongestUniqueSubString(String s) {

		int left = 0;
		int right = 0;
		Set<Character> set = new HashSet<>();
		int max = 0;
		
		while(right < s.length())
		{
			char c = s.charAt(right);
			if(set.add(c))
			{
				max = Math.max(max, right - left + 1);
				right++;
			}
			else
			{
				while(s.charAt(left) != c)
				{
					set.remove(s.charAt(left));
					left++;
				}
				set.remove(c);
				left++;
			}
		}
		return max;
	}
}
