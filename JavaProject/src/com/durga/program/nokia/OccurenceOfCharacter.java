package com.durga.program.nokia;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OccurenceOfCharacter {

	public static void main(String[] args) {
		
		String input = "I love programming";
		
		occOfChar(input);
		
		occOfChar1(input);
		
	}

	private static void occOfChar1(String input) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(Character ch : input.trim().replaceAll("\\s", "").toCharArray())
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		System.out.println(map);
		
	}

	private static void occOfChar(String input) {
		Stream.of(input).map(str -> str.trim().replaceAll("\\s", "").split("")).
		flatMap(Arrays::stream).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
		entrySet().forEach(System.out::println);
	}
}
