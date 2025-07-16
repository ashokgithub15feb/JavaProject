package com.interviews.leetcode.easy;

public class ShuffleString {

	public static void main(String[] args) {

		String str = "codeleet";
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		String result = shuffleString(str, indices);
		System.out.println("Result: " + result);
	}

	private static String shuffleString(String str, int[] indices) {

		if (str == null || str.length() == 0 || indices == null || indices.length == 0) {
			return "";
		}

		if (str.length() != indices.length) {
			return "";
		}

		char[] ch = new char[str.length()];

		for (int i = 0; i < indices.length; i++) {

			int pos = indices[i];
			ch[pos] = str.charAt(i);
		}

		String res = "";

		for (int i = 0; i < ch.length; i++) {
			res += ch[i];
		}

		return res;
	}
}
