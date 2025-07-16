package com.interviews.leetcode.easy;

public class MergeTwoString {

	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "pqrst";
		
		String result = mergeTwoString(s1, s2);
		
		System.out.println("Result: "+result);
	}

	private static String mergeTwoString(String s1, String s2) {
		
		int len1 = s1.length();
		int len2 = s2.length();
		int min = Math.min(len1, len2);
		String largeString = "";
		
		if(min == len1) {
			largeString = s2;
		}
		
		if(min == len2) {
			largeString = s1;
		}
		
		System.out.println(largeString);
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<min; i++) {
			sb.append(ch1[i]);
			sb.append(ch2[i]);
		}
		
		sb.append(largeString.substring(min));
		return sb.toString();
	}
}
