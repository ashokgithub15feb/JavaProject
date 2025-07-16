package com.interviews.leetcode.easy;

public class CapitalizeTheTitle {

	public static void main(String[] args) {
		
		String str = "First leTTeR of EACH Word";
		
		System.out.println("Input: "+str);
		
		String result = capitalizeTheTitle(str);
		
		System.out.println("Result: "+result);
	}

	private static String capitalizeTheTitle(String str) {
		
		String[] words = str.split(" ");
		StringBuilder sb = new StringBuilder();
		 
		for(int i=0; i< words.length; i++) {
			
			if(words[i].length() < 3) {
				sb.append(words[i]).append(" ");
			} else {
				char ch = words[i].charAt(0);
				ch = Character.toUpperCase(ch);
				String newString = ch + words[i].substring(1).toLowerCase();
				sb.append(newString).append(" ");
			}
		}
		
		String result = sb.toString().trim();
		
		return result;
	}
}
