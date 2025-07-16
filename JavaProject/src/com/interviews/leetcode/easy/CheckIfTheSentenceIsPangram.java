package com.interviews.leetcode.easy;

public class CheckIfTheSentenceIsPangram {

	public static void main(String[] args) {
		
		//String sentence = "abcdefghijklmnopqrstuvwxyz";
		String sentence = "leetcode";
		
		boolean result = isPangram(sentence);
		
		System.out.println("Result: "+result);
	}

	private static boolean isPangram(String sentence) {
		
		if(sentence.length() == 26) {
			return true;
		}
		
		return false;
	}
}
