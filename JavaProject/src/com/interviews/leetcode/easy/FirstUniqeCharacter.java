package com.interviews.leetcode.easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqeCharacter {

	public static void main(String[] args) {
		
		String str = "leetcodel";
		
		char result = firstUniqeCharacter(str);
		
		System.out.println("Result: "+result);
	}

	private static char firstUniqeCharacter(String str) {
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i =0; i < str.length(); i++) {
			
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return '1' ;
	}
}
