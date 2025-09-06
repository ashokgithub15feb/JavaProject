package com.interviews.java8;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

//26) Print duplicate characters in a string?

public class DuplicateCharacters {

	public static void main(String[] args) {

		String inputString = "Java Concept Of The Day";

		Map<Character, Long> map = inputString.replaceAll("\\s", "").toLowerCase().chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Set<Character> set = new HashSet<Character>();

		List<Entry<Character, Long>> collect = map.entrySet().stream().filter(f -> f.getValue() > 1)
				.collect(Collectors.toList());
		
		List<Character> collect2 = map.entrySet().stream().filter(f -> f.getValue() > 1).map(k -> k.getKey()).collect(Collectors.toList());
		System.out.println(collect2);

		System.out.println(collect);
		//[a=3, c=2, t=2, e=2, o=2]
		//[a=3, c=2, t=2, e=2, o=2]

	}
}
