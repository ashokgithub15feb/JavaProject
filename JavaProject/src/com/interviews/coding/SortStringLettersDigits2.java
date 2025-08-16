package com.interviews.coding;

public class SortStringLettersDigits2 {

	public static void main(String[] args) {

		 String str = "hfjsk6485lop";

		//String str = "abcedfghi6485zr";

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

		String sortedLettersWithout = sortTheWithoutInBuidFunction(letters.toString());
		String sortedDigitsWithout = sortTheWithoutInBuidFunction(digits.toString());

		StringBuilder result = new StringBuilder(sortedLettersWithout + sortedDigitsWithout);

		return result.toString();
	}

	private static String sortTheWithoutInBuidFunction(String str) {

		char[] charArray = str.toCharArray();
		// 6 4 8 5
		for (int i = 1; i < charArray.length; i++) {
			for (int j = i; j > 0; j--) {
				if (charArray[j] < charArray[j - 1]) {
					char temp = charArray[j];
					charArray[j] = charArray[j - 1];
					charArray[j - 1] = temp;
				}
			}
		}

		return String.valueOf(charArray);
	}
}
