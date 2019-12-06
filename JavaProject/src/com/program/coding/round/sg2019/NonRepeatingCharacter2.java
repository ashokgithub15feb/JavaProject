package com.program.coding.round.sg2019;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepeatingCharacter2 {

	public static void main(String[] args) {
		
		String str = "geeksforgeeks"; 
		
		firstNonRepeatingChar(str);
	}

	private static void firstNonRepeatingChar(String str) {
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i=0; i<str.length();i++)
		{
			if(map.get(str.charAt(i)) == null)
			{
				map.put(str.charAt(i), 1);
			}
			else
			{
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			
		}
		
		map.entrySet().stream().filter(key -> {
			
			if(key.getValue() == 1)
			{
				return true;
			}else
			{
				return false;
			}
			
		}).collect(Collectors.toList()).forEach(System.out::println);
		
		
		
		System.out.println(map);
		
		
	}
}
