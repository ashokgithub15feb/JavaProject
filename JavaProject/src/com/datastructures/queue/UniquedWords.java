package com.datastructures.queue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniquedWords {

	public static void main(String[] args) {

		String str = "Java is great. Grails is also great";
		printUniquedWords(str);
		printUniquedWords1(str);
	}

	private static void printUniquedWords1(String str) {

		Arrays.asList(str).stream().filter(f -> f != null).map(f -> f.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(f -> f.getValue() == 1)
				.forEach(f -> System.out.println("Key = " + f.getKey() + ", Value = " + f.getValue()));
		
		
		Stream.of(str).filter(f -> !f.matches("[a-zA-Z]+")).map(f -> f.split(" "))
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
		.filter(f -> f.getValue() == 1)
		.forEach(f -> System.out.println("Key = " + f.getKey() + ", Value = " + f.getValue()));
	}

	private static void printUniquedWords(String str) {

		Pattern p = Pattern.compile("[a-zA-z]+");
		Matcher m = p.matcher(str);

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		while (m.find()) {
			String s = m.group();

			if (!map.containsKey(s)) {
				map.put(s, 1);
			} else {
				map.put(s, map.get(s) + 1);
			}
		}

		map.entrySet().stream().filter(f -> f.getValue() == 1)
				.forEach(f -> System.out.println("Key = " + f.getKey() + ", Value = " + f.getValue()));
	}
}
