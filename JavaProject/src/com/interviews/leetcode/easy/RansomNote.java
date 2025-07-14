package com.interviews.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public static void main(String[] args) {

		String ransomeNote = "aa";
		String magazine = "aab";

		boolean result = canConstruct(ransomeNote, magazine);
		
		System.out.println("Result: "+result);
	}

	public static boolean canConstruct(String ransomNote, String magazine) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < magazine.length(); i++) {
			if (map.containsKey(magazine.charAt(i))) {
				map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
			} else {
				map.put(magazine.charAt(i), 1);
			}
		}

		int count = 0;

		for (int i = 0; i < ransomNote.length(); i++) {

			if (map.containsKey(ransomNote.charAt(i)) && map.get(ransomNote.charAt(i)) > 0) {
				count++;
				map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
			} else {
				break;
			}
		}

		if (count == ransomNote.length()) {
			return true;
		} else {
			return false;
		}
	}
}
