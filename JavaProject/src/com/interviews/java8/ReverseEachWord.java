package com.interviews.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//18) Reverse each word of a string using Java 8 streams?

public class ReverseEachWord {

	public static void main(String[] args) {

		String str = "Java Concept Of The Day";

		System.out.println("Original: " + str);

		String collect = Stream.of(str.split(" ")).map(m -> new StringBuilder(m).reverse())
				.collect(Collectors.joining(" "));

		System.out.println(collect);
	}
}
