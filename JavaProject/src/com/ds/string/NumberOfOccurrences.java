package com.ds.string;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberOfOccurrences {

	public static void main(String[] args) {
		
		String s = "Aadesh Kumar";
		
		Stream<String> of = Stream.of(s);
		
		of.filter(st -> !st.trim().isEmpty()).map(str -> str.replaceAll("\\s", "").split("")).flatMap(Arrays::stream)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().forEach(System.out::println);
		
	}
}
 