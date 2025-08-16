package com.interviews.coding;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		
		String str = "Java";
		
		firstUniqueCharacter(str);
		
		char firstUniqueCharacterWithoutInBuiltFunction = firstUniqueCharacterWithoutInBuiltFunction(str);
		
		System.out.println(firstUniqueCharacterWithoutInBuiltFunction);
	}

	private static void firstUniqueCharacter(String str) {

		str.replaceAll("\\s", "").toLowerCase().chars().mapToObj(c -> (char) c)
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
		.entrySet().stream()
		.filter(entry -> entry.getValue() == 1).map(key -> key.getKey())
		.limit(1)
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}
	
	private static char firstUniqueCharacterWithoutInBuiltFunction(String str) {
		
		int[] charCount = new int[26];
		
		for(int i=0; i < str.length(); i++) {
			charCount[str.toLowerCase().charAt(i) - 'a']++;
		}
		
		for(int i=0; i< str.length(); i++) {
			if(charCount[str.toLowerCase().charAt(i) - 'a'] == 1) {
				return str.toLowerCase().charAt(i);
			}
		}
		
		return ' ';
	}
}
