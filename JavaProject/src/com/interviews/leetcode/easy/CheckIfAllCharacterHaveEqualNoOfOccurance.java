package com.interviews.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckIfAllCharacterHaveEqualNoOfOccurance {

	public static void main(String[] args) {

		String str = "abcabc"; // {a=2, b=2, c=2}, in set added the value 
		// String str = "aaabb";

		boolean result = checkIfAllCharacterHaveEqualNoOfOccurance(str);
		
		System.out.println("Result: "+result);

	}

	private static boolean checkIfAllCharacterHaveEqualNoOfOccurance(String str1) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str1.length(); i++) {
			if (map.containsKey(str1.charAt(i))) {
				map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
			} else {
				map.put(str1.charAt(i), 1);
			}
		}

		Set<Integer> set = new HashSet<Integer>(map.values());

		if (set.size() == 1) {
			return true;
		}
		return false;
	}
}
