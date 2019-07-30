package com.ds.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatedCharacterDemo {

	public static void main(String[] args) {
		
		String s = "aabbddef";
		
		System.out.println(getFirstNotRepeatedChar(s));
	}

	private static Character getFirstNotRepeatedChar(String s) {
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char ch : s.toCharArray())
		{
			map.put(ch, map.containsKey(ch)? map.get(ch)+1:1);
		}
		
		for(Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue() == 1)
			{
				return entry.getKey();
			}
		}
		
		throw new RuntimeException("Error..");
	}
}
