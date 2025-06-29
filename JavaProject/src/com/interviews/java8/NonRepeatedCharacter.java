package com.interviews.java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//28) Find first non-repeated character in a string?

public class NonRepeatedCharacter {

	public static void main(String[] args) {

		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

		System.out.println("Original: " + inputString);

		Character character = inputString.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(f -> f.getValue() == 1).map(entry -> entry.getKey()).findFirst().get();

		System.out.println("Find First Non Repeated Character: " + character);
	}
}
