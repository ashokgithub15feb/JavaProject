package com.interviews.leetcode.easy;

public class CircularSentence {

	public static void main(String[] args) {

		String sentence = "leetcode exercises sound delightful";
		//String sentence = "6leetcode exercises sound delightful";
		//String sentence = "leetcode";
		//String sentence = "leetcodel";

		boolean result = isCircularSentence(sentence);

		System.out.println("Result: " + result);
	}

	private static boolean isCircularSentence(String sentence) {

		String[] words = sentence.split(" ");

		if (words.length == 1 && sentence.charAt(0) == sentence.charAt(sentence.length() - 1)) {
			return false;
		}

		if (words.length == 1 && sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) {
			return false;
		}

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);

			if (!Character.isLetter(ch) && sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) {
				return false;
			}
		}

		return true;
	}
}
