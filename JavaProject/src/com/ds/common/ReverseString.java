package com.ds.common;

public class ReverseString {

	public static void main(String[] args) {

		String txt = "aba";

		String rev = reverse(txt);

		if (txt.equals(rev)) {
			System.out.println("Palindrom: " + rev);
		} else {
			System.out.println("Not Palindrom: " + rev);
		}

		sub();
	}

	private static void sub() {

		String tax = "abc";
		System.out.println(tax.subSequence(0, tax.length()));
		System.out.println(tax.subSequence(0, tax.length() - 1));
		System.out.println(tax.subSequence(0, tax.length() - 2));
		System.out.println();
		System.out.println(tax.subSequence(0, 0));
		System.out.println(tax.subSequence(0, 1));
		System.out.println(tax.subSequence(0, 2));
		System.out.println(tax.subSequence(0, 3));

		System.out.println();

		System.out.println(tax.substring(0));
		System.out.println(tax.substring(1));
		System.out.println(tax.substring(2));
		System.out.println(tax.substring(3));

		System.out.println("====");

		System.out.println("1:" + tax.subSequence(1, 1));
		System.out.println("2:" + tax.subSequence(1, 2));
		System.out.println("3:" + tax.subSequence(1, 3));
		System.out.println("4:" + tax.subSequence(2, 3));

		System.out.println(revRec("ashok"));
	}

	public static String reverse(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
	}

	public static String revRec(String str) {
		
		if (str.equals("")) {
			return str;
		}
		return revRec(str.substring(1))+str.charAt(0);
	}

}
