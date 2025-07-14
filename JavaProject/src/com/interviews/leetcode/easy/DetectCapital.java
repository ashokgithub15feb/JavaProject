package com.interviews.leetcode.easy;

public class DetectCapital {

	public static void main(String[] args) {

		//String s1 = "USA";
		//String s = "leetcode";
		String s = "Java";
		//String s = "JavaL";

		boolean result = detectCapital(s);
		
		System.out.println("Result: "+result);

	}

	private static boolean detectCapital(String s1) {

		if (allCapital(s1) || allLower(s1) || firatTitleCapital(s1)) {
			return true;
		}
		return false;
	}

	public static boolean allCapital(String s1) {

		int count = 0;

		for (int i = 0; i < s1.length(); i++) {

			if (Character.isUpperCase(s1.charAt(i))) {
				count++;
			}
		}
		if (s1.length() == count) {
			return true;
		}
		return false;
	}

	public static boolean allLower(String s2) {

		int count = 0;

		for (int i = 0; i < s2.length(); i++) {

			if (Character.isLowerCase(s2.charAt(i))) {
				count++;
			}
		}
		if (s2.length() == count) {
			return true;
		}
		return false;
	}

	public static boolean firatTitleCapital(String s3) {

		if (Character.isUpperCase(s3.charAt(0)) && allLower(s3.substring(1))) {
			return true;
		} else {
			return false;
		}
	}
}
