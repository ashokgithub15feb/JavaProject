package com.interviews.leetcode.medium;

import java.util.Arrays;

public class ReverseWords6 {

	public static void main(String[] args) {
		
		String s = "the sky is blue";
		
		System.out.println("Input: "+s);
		
		String result = reverseWords(s);
		System.out.println("Resulto: "+result);
		
		String result2 = reverseWords2(s);
		System.out.println("Result: "+result2+":"+result2.length()+", s: "+s.length());
	}

	private static String reverseWords2(String s) {
		
		if(s == null || s.length() == 0) {
			return s;
		}
		
		String result = "";
		int i = 0;
		
		while( i  < s.length()) {
			
			while(i < s.length() && s.charAt(i) == ' ') {
				i++;
			}
			
			String word = "";
			
			while(i < s.length() && s.charAt(i) != ' ') {
				word = word + s.charAt(i);
				i++;
			}
			
			if(!word.equals("")) {
				result = word + " " + result;
			}
			
			System.out.println(result);
		}
		
		if(result.isEmpty()) {
			return "";
		}
		
		return result.substring(0, result.length() - 1);
	}

	private static String reverseWords(String s) {
		
		String[] words = s.split(" ");
		
		int left = 0 ;
		int right = words.length - 1;
		while (left < right) {
			
			String temp = words[right];
			words[right] = words[left];
			words[left] = temp;
			left++;
			right--;
		}
		return Arrays.toString(words).replaceAll(",", "");
	}
}
