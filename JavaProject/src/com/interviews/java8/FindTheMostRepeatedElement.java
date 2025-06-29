package com.interviews.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

//22) How do you find the most repeated element in an array?

public class FindTheMostRepeatedElement {

	public static void main(String[] args) {

		List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book",
				"Pencil");
		System.out.println("Original: " + listOfStrings);

		Entry<String, Long> entry = listOfStrings.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).get();

		System.out.println("Most Frequent Element: " + entry.getKey() + "\nCount : " + entry.getValue());
	}
}
