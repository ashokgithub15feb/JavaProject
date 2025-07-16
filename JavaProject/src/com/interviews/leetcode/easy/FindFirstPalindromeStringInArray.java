package com.interviews.leetcode.easy;

public class FindFirstPalindromeStringInArray {

	public static void main(String[] args) {

		String[] words = { "abc", "car", "ada", "ravecar", "cool", "adda" };

		String result = findFirstPalindromeStringInArray(words);
		
		System.out.println("Result: "+result);
	}

	private static String findFirstPalindromeStringInArray(String[] words) {
		
		for(int i=0; i<words.length; i++) {
			
			if(isPalindrome(words[i])) {
				return words[i];
			}
		}
		
		return "";
	}

	private static boolean isPalindrome(String str) {

		int l = 0;
		int r = str.length() - 1;

		while (l < r) {

			if (str.charAt(l) != str.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}

		return true;
	}
}
