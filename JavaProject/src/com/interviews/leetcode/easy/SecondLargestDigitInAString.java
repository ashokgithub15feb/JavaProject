package com.interviews.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondLargestDigitInAString {

	public static void main(String[] args) {

		String str = "dfa12321afd";
		int result = secondLargestDigitInAString(str);
		System.out.println("Result: " + result);
	}

	private static int secondLargestDigitInAString(String str) {

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int numericValue = Character.getNumericValue(ch);
				set.add(numericValue);
			}
		}
		System.out.println(set);

		List<Integer> list = new ArrayList<Integer>(set);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		if (list.size() < 2) {
			return -1;
		}

		int result = list.get(list.size() - 2);
		return result;
	}
}
