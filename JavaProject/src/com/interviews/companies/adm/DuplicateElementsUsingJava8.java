package com.interviews.companies.adm;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElementsUsingJava8 {

	public static void main(String[] args) {

		Stream.of(1, 3, 2, 3, 5, 6, 7, 7).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() > 1).map(key -> key.getKey())
				.collect(Collectors.toList()).forEach(System.out::println);
	}
}
