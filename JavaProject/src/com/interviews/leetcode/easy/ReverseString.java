package com.interviews.leetcode.easy;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		char[] chStr = {'h', 'e', 'l', 'l', 'o'};
		
		System.out.println("Input: "+Arrays.toString(chStr));
		
		char[] result = reverseOfString(chStr);
		
		System.out.println("Result: "+Arrays.toString(result));
	}

	private static char[] reverseOfString(char[] chStr) {
		
		int start = 0;
		int end = chStr.length -1 ;
		
		while(start < end) {
			
			char ch = chStr[start];
			
			chStr[start] = chStr[end];
			
			chStr[end] = ch;
			
			start++;
			end--;
		}
		
		return chStr;
	}
}
