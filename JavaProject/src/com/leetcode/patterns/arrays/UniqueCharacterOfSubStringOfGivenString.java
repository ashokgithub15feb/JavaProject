package com.leetcode.patterns.arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharacterOfSubStringOfGivenString {

	public static void main(String[] args) {
		
		String s = "ABC";
		
		int result = findUniqueCharacterOfSubStringOfGivenString(s);
		
		System.out.println(result);
		
	}

	private static int findUniqueCharacterOfSubStringOfGivenString(String s) {
		Map<Character, List<Integer>> map = new HashMap<>();
		for(int i=0; i<s.length(); i++)
		{
			List<Integer> list = map.computeIfAbsent(s.charAt(i), key -> new ArrayList<>());
			list.add(i);
		}
		
		System.out.println(map);
		int sum = 0;
		Collection<List<Integer>> values = map.values();
		
		values.stream().forEach(f -> System.out.println(f));
		
		for(List<Integer> list : values)
		{
			for(int i=0; i<list.size(); i++) 
			{
			
				int left = i == 0 ? list.get(i) + 1 : list.get(i) - list.get(i - 1);
				int right = i == list.size() -1 ? s.length() - list.get(i) : list.get(i + 1) - list.get(i);
				sum += left * right;
				System.out.println("Sum: "+sum);
			}
		}
		return sum;
	}
	
}
