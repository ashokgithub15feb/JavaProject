package com.interviews.coding;

import java.util.Arrays;

public class SortStringLettersDigits {

	public static void main(String[] args) {

		String str = "hfjsk6485lop";

		System.out.println("Input: " + str);

		String result = sortStringLettersDigits(str);

		System.out.println("Result: " + result);
	}

	private static String sortStringLettersDigits(String str) {

		StringBuilder letters = new StringBuilder();
		StringBuilder digits = new StringBuilder();

		for (char ch : str.toCharArray()) {

			if (Character.isLetter(ch)) {
				letters.append(ch);
			} else {
				digits.append(ch);
			}
		}

		//String sortedLetters = sortTheLettersUsingInBuidFunction(letters.toString());
		//String sortedDigits = sortTheDigitsUsingInBuidFunction(digits.toString());
		
		//String result = sortedLetters + sortedDigits;
		
		String sortedLettersWithout = sortTheLettersWithoutInBuidFunction(letters.toString());
		String sortedDigitsWithout = sortTheDigitsWithoutInBuidFunction(digits.toString());
		
		StringBuilder result = new StringBuilder(sortedLettersWithout + sortedDigitsWithout);
		
		return result.toString();
	}

	private static String sortTheDigitsWithoutInBuidFunction(String digits) {

		char[] digitArray = digits.toCharArray();
		// 6 4 8 5
		for (int i = 1; i < digitArray.length; i++) {
			for (int j = i; j > 0; j--) {
				if (digitArray[j] < digitArray[j - 1]) {
					swap(digitArray, j);
				}
			}
		}

		return String.valueOf(digitArray);
	}

	private static void swap(char[] charArray, int j) {
		char temp = charArray[j];
		charArray[j] = charArray[j - 1];
		charArray[j - 1] = temp;
	}

	private static String sortTheLettersWithoutInBuidFunction(String letters) {
		char[] lettersArray = letters.toCharArray();
		// 6 4 8 5
		for (int i = 1; i < lettersArray.length; i++) {
			for (int j = i; j > 0; j--) {
				if (lettersArray[j] < lettersArray[j - 1]) {
					swap(lettersArray, j);
				}
			}
		}

		return String.valueOf(lettersArray);
	}

	private static String sortTheDigitsUsingInBuidFunction(String digits) {
		char[] digitArr = digits.toString().toCharArray();

		Arrays.sort(digitArr);

		return String.valueOf(digitArr);
	}

	private static String sortTheLettersUsingInBuidFunction(String letters) {
		char[] letterArr = letters.toString().toCharArray();

		Arrays.sort(letterArr);

		return String.valueOf(letterArr);
	}
}
