package com.interviews.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

//27) Find first repeated character in a string?

public class FindFirstRepeatedCharacter {

	public static void main(String[] args) {

		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

		LinkedHashMap<Character, Long> collect = inputString.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
	
		System.out.println(collect);
		
		Entry<Character, Long> entry = collect.entrySet().stream().filter(f -> f.getValue() > 1).findFirst().get();
		
		System.out.println("First Repeted Character: "+entry.getKey()+"="+entry.getValue());
		
		Entry<Character, Long> entry1 = collect.entrySet().stream().filter(f -> f.getValue() > 1).skip(1).findFirst().get();
		
		System.out.println("Second Repeted Character: "+entry1.getKey()+"="+entry1.getValue());
		
		Character character = collect.entrySet().stream().filter(f -> f.getValue() > 1).map(entryy -> entryy.getKey()).findFirst().get();
		
		System.out.println("First Repeted Character: "+character);
		
		Character key = inputString.replaceAll("\\s", "").toLowerCase()
		.chars()
		.mapToObj(c -> (char) c)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet()
		.stream()
		.max(Map.Entry.comparingByValue()).get().getKey();
		
		System.out.println(key);
	}
}
