package com.interviews.hackerrank;

public class PalindromeIndex {

	public static void main(String[] args) {

		String s = "aabccccaa";
		int index = palindromeIndex(s);

		System.out.println("Result: " + index);

	}

	public static int palindromeIndex(String s) {

		int palindromeIndex = -1;

		int len = s.length();

		for (int i = 0; i < len / 2; i++) {
			System.out.println("i:"+i);
			System.out.println("len:"+len);
			System.out.println("(len - i - 1):"+(len - i - 1));
			if (s.charAt(i) != s.charAt(len - i - 1)) {
				if (i + 1 < len) {
					System.out.println("s.substring(i + 1, len - i): "+(s.substring(i + 1, len - i)));
					boolean palindrome = isPalindrome(s.substring(i + 1, len - i));

					if (palindrome) {
						return i;
					}

					return len - i - 1;
				}
			}
			
			
			System.out.println("==========");
			
		}

		return palindromeIndex;

	}

	private static boolean isPalindrome(String str) {
		int len = str.length();

		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1)) {
				return false;
			}
		}

		return true;
	}

}
