package com.datastructures.company.blackrock;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str = "madam";
		
		palinrome(str);
		palinrome1(str);
	}

	private static void palinrome1(String str) {
		
		boolean noneMatch = IntStream.range(0, str.length()/2).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
		
		if(noneMatch) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palinrome");
		}
	}

	private static void palinrome(String str) {
		char[] ch = str.toCharArray();
		
		for(int i=0, j = ch.length - 1; i < ch.length/2; i++, j--) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		
		String s = String.valueOf(ch);
		if(s.equals(str)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palinrome");
		}
	}
}
