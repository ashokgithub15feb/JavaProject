package com.interviews.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfAnagram10 {

	public static void main(String[] args) {
		
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		List<List<String>> result =  sroupOfAnagram(strs);
		System.out.println(result);
	}

	private static List<List<String>> sroupOfAnagram(String[] strs) {
		
		//create hashmap
		//foreach look
		//sort the word and store in map
		//check map cantain value or not
		
		List<List<String>> result = new ArrayList<>();
		
		Map<String, List<String>> map = new HashMap<>();
		
		for(String str : strs) {
			
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String sortedString = new String(ch);
			
 			if(!map.containsKey(sortedString)) {
 				map.put(sortedString, new ArrayList<>());
 			}
 			
 			map.get(sortedString).add(str);
		}
		
		result.addAll(map.values());
		return result;
	}
}
