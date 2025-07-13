package com.interviews.leetcode.easy;

public class ValidPalindrome {

	public static void main(String[] args) {
		
		String str = "A man, a plan, a canal: panama";
		
		boolean result = isPalindrome(str);
		
		if(result) {
			System.out.println("Palindrome: "+result);
		}
		else {
			System.out.println("Not a palindrome: "+result);
		}
	}

	private static boolean isPalindrome(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i< str.length(); i++) {
			
			char ch = str.charAt(i);
			if(Character.isLetter(ch) || Character.isDigit(ch)) {
				sb.append(ch);
			}
		}
		
		String currentStr = sb.toString().toLowerCase();
		
		boolean result = checkPalindrome(currentStr);
		return result;
	}

	private static boolean checkPalindrome(String currentStr) {
		
		int start = 0;
		int end = currentStr.length() - 1;
		
		while(start < end) {
			
			if(currentStr.charAt(start) != currentStr.charAt(end)) {
				return false;
			}
			
			start++;
			end--;
		}
		
		return true;
	}
}
