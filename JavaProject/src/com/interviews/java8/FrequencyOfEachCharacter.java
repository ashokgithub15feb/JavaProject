package com.interviews.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//3) How do you find frequency of each character in a string using Java 8 streams?


public class FrequencyOfEachCharacter {

	public static void main(String[] args) {

		String inputString = " Java Concept Of The Day";

		System.out.println("Original: " + inputString);

		// Map<String, Long> collect = Stream.of(inputString).filter(f ->
		// !f.isBlank()).collect(Collectors.groupingBy(ff -> ff,
		// Collectors.counting()));

		// System.out.println(collect);

		// char[] charArray = inputString.toCharArray();

		// Map<char[], Long> collect2 =
		// Stream.of(charArray).collect(Collectors.groupingBy(Function.identity(),
		// Collectors.counting()));

		// System.out.println(collect2);

		// Map<String[], Long> collect = Stream.of(inputString).filter(f ->
		// !f.isEmpty()).map(m -> m.split(""))
		// .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// System.out.println(collect);

		Map<String, Long> collect = Stream.of(inputString).map(m -> splitTheString(m)).flatMap(Arrays::stream)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		//System.out.println(collect);

		Map<String, Long> collect2 = Stream.of(inputString).filter(f -> !f.isBlank()).map(m -> splitTheString(m))
				.flatMap(Arrays::stream).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		//System.out.println(collect2);

		Map<Character, Long> collect3 = removeWhiteSpace(inputString).chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		//System.out.println(collect3);

		//if input is string in case
		//be-carefull about data structure return data type - if we are using simply split("") method then 
		//frequency of each character return data type is Map<String, Long>
		
		//if you trying to use String.chars() method and mapToObj(c -> (char) c) method for frequency of each 
		//character then return data type is Map<Chaacter, Long>
	}

	private static String[] splitTheString(String m) {
		return removeWhiteSpace(m).split("");
	}
	
	private static String removeWhiteSpace(String s) {
		return s.replaceAll("\\s", "");
	}
}
