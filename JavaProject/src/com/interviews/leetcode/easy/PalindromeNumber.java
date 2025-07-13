package com.interviews.leetcode.easy;

public class PalindromeNumber {

	public static void main(String[] args) {

		int x = 123321;

		boolean result = isPalindromeNumber(x);

		System.out.println("Result: " + result);
	}

	private static boolean isPalindromeNumber(int x) {
		if (x < 0) {
			return false;
		}

		String str = x + "";

		return checkPalindrome(str);
	}

	private static boolean checkPalindrome(String str) {

		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}
}
