package com.interviews.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

	public static void main(String[] args) {

		String jewels = "aA";
		String stone = "aAAbbb";

		int result = numJewelsInStones(jewels, stone);

		System.out.println("Result: " + result);
	}

	private static int numJewelsInStones(String jewels, String stone) {

		Set<Character> set = new HashSet<Character>();

		for (Character ch : jewels.toCharArray()) {
			set.add(ch);
		}
		int count = 0;
		for (Character ch : stone.toCharArray()) {
			if (set.contains(ch)) {
				count++;
			}
		}

		return count;

	}
}
