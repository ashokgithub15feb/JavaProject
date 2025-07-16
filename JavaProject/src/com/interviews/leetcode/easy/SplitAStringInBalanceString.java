package com.interviews.leetcode.easy;

public class SplitAStringInBalanceString {

	public static void main(String[] args) {

		String str = "RLRRLLRLRL";

		int result = splitAStringInBalance(str);
		
		System.out.println("Result: "+result);
	}

	private static int splitAStringInBalance(String str) {

		if (str == null || str.length() == 0) {
			return 0;
		}

		int left = 0;
		int right = 0;
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'L') {
				left++;
			} else { // for first character 'R' - right will increase by 1
				right++;
			}

			if (left == right) {
				count++;
			}
		}

		return count;
	}
}
