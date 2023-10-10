package com.leetcode.patterns.arrays;

import java.util.HashSet;
import java.util.Set;

public class DistinctCharacterAndDistinctSubString {

	public static void main(String[] args) {

		//String s = "LEETCODE";
		String s = "ABA";
		int result = findDistinctCharacterAndDistinctSubString(s);

		System.out.println(result);// 18
		
		int result1 = findDistinctCharacterAndDistinctSubString2(s);

		System.out.println(result1);// 18
	}

	private static int findDistinctCharacterAndDistinctSubString(String s) {

		int count = 0;
		Set<String> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			String temp = "";

			Set<Character> setChar = new HashSet<>();

			for (int j = i; j < s.length(); j++) {
				temp = temp + s.charAt(j);

				setChar.add(s.charAt(j));

				if (!set.contains(temp)) {
					set.add(temp);

					count = count + setChar.size();
				}
			}
		}

		return count;
	}

	private static int findDistinctCharacterAndDistinctSubString2(String s) {

		int n = s.length();
		
		int ans = 0;
		int[] cnt = new int[26];
		
		int i=0;
		int j=0;
		
		while(j < n)
		{
			if(j < n && (cnt[s.charAt(j) - 'A'] == 0))
			{
				cnt[s.charAt(j) - 'A']++;
				
				ans += (j-i+1);
				j++;
			}
			else
			{
				cnt[s.charAt(i) - 'A']--;
				i++;
			}
		}
		
		return ans;
	}
}
