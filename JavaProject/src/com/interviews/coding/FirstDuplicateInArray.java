package com.interviews.coding;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstDuplicateInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 6, 3 };

		firstDupplicate(arr);
		
		String str = "ashok Kumar Yadav";
		
		firstDupplicateInString(str);
	}

	private static void firstDupplicateInString(String str) {
		
		str.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(entry -> entry.getValue() > 1)
		.map(key -> key.getKey())
		.limit(1)
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}

	private static void firstDupplicate(int[] arr) {

		Stream.of(1, 6, 2, 3, 4, 5, 6, 7, 3, 1)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(f -> f.getValue() > 1)
				.map(m -> m.getKey()).limit(1)
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}
}
