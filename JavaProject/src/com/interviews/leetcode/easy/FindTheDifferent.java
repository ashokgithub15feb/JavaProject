package com.interviews.leetcode.easy;

public class FindTheDifferent {

	public static void main(String[] args) {
		
		String s = "abcd";
		String t = "abcde";
		
		char result = findDiff(s, t);
		
		System.out.println("Result: "+result);
	}

	private static char findDiff(String s, String t) {
		
		int s_sum = 0;
		int t_sum = 0;
		for(int i=0; i < s.length(); i++) {
			s_sum += s.charAt(i);
		}
		
		for(int i=0; i< t.length(); i++) {
			t_sum += t.charAt(i);
		}
		
		int diff = t_sum - s_sum;
		return (char) diff;
	}
}
