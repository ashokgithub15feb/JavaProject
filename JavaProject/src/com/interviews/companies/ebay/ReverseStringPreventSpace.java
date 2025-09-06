package com.interviews.companies.ebay;

public class ReverseStringPreventSpace {

	public static void main(String[] args) {
		
		String str = "I love programming";
		
		String result = reverseString(str);
		
		System.out.println(result);
	}

	private static String reverseString(String str) {

		int left = 0;
		int right = str.length() - 1;
		char[] ch = str.toCharArray();
		
		while(left < right) {
			
			if(ch[left] == ' ') {
				left++;
			}
			else if(ch[right] == ' ') {
				right--;
			} 
			else {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;
			}
		}
		
		return String.valueOf(ch);
	}
}
