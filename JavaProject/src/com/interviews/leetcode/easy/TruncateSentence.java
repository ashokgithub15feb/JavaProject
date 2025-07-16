package com.interviews.leetcode.easy;

public class TruncateSentence {

	public static void main(String[] args) {
		
		String str = "Hello how are you Constentant";
		int k = 4;
		
		String result = truncateSentence(str, k);
		System.out.println("Result: "+result);
	}

	private static String truncateSentence(String str, int k) {
		
		String[] words = str.split(" ");
		StringBuilder sb = new StringBuilder();
		
		int index = 0;
		
		while(k != 0) {
			sb.append(words[index]+ " ");
			index++;
			k--;
		}
		
		return sb.toString().trim();
	}
}
