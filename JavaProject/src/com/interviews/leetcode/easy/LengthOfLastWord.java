package com.interviews.leetcode.easy;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String str = "Hello World";
		
		int result = lengthOfLastWorld(str);
		
		System.out.println("Input: "+str+"\nOutput: "+result);
	}

	private static int lengthOfLastWorld(String str) {
		
		String[] words = str.split(" ");
		
		String lastWorld = words[words.length - 1];
		
		int len = lastWorld.length();
		
		return len;
	}
}
