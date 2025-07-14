package com.interviews.leetcode.easy;

public class ReverseWordInAStringIII {

	public static void main(String[] args) {

		String str = "let's take leetcode contest";

		System.out.println("Input: " + str);

		String result = reverseWords(str);

		System.out.println("Result: " + result);
	}

	private static String reverseWords(String str) {

		String[] words = str.split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < words.length - 1; i++) {

			String reverseWord = reverseString(words[i]);

			sb.append(reverseWord).append(" ");
		}

		String lastWord = reverseString(words[words.length - 1]);
		sb.append(lastWord);

		return sb.toString();
	}

	private static String reverseString(String word) {

		String res = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			res += word.charAt(i);
		}

		return res;
	}
	
}
