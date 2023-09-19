package com.leetcode.patterns.arrays;

public class LongestPalindromicSubString {

	public static void main(String[] args) {

		String s = "baab";
		
		String result = findPalindromicSubString(s);
		
		System.out.println(result);
		
	}

	private static String findPalindromicSubString(String s) {
		
		int start = 0;
		int end = 0;
		
		for(int i=0; i<s.length();i++)
		{
			int len1 = expendFromCenter(s, i, i+1);
			int len2 = expendFromCenter(s, i, i);
			System.out.println("==========================================");
			int len = Math.max(len1, len2);
			
			if(end - start < len)
			{
				start = i - (len -1)/2;
				end = i + len/2;
			}
		}
		
		return s.substring(start, end + 1);
	}

	private static int expendFromCenter(String s, int i, int j) {
		
		System.out.println("S: "+s+", i: "+i+", j: "+j);
		while(i>= 0 && j < s.length() && s.charAt(i) == s.charAt(j))
		{
			i--;
			j++;
		}
		return j - i - 1;
	}
}
