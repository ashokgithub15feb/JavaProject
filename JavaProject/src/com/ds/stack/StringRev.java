package com.ds.stack;

import java.util.Arrays;

public class StringRev {

	public static void main(String[] args) {

		String str = "Ashok Kumar Yadav";

		revOfWords(str);
		revOfWords1(str);
		
	}

	private static void revOfWords1(String str) {
		String s1 = "";
		
		char[] ch = new char[str.length()];
		char[] ch1 = new char[str.length()];
		
		for(int i=0; i<str.length(); i++)
		{
				
		}
		
		System.out.println(Arrays.toString(ch));
		
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			String revWord = "";
			for(int j=word.length()-1; j>=0; j--)
			{
				revWord = revWord + word.charAt(j);
			}
			
			s1 = s1 + revWord + " ";
		}

		System.out.println(s1);
	}
	
	private static void revOfWords(String str) {
		String s1 = "";
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			String revWord = "";
			for(int j=word.length()-1; j>=0; j--)
			{
				revWord = revWord + word.charAt(j);
			}
			
			s1 = s1 + revWord + " ";
		}

		System.out.println(s1);
	}
}
