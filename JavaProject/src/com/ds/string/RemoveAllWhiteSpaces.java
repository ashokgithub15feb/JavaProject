package com.ds.string;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		
		String s = "I love programingpp";
		
		Stream.of(s).map(str -> str.replaceAll("\\s", "")).collect(Collectors.toList()).forEach(System.out::println);
		
		
	}
}