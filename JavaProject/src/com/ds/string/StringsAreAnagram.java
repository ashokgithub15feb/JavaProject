package com.ds.string;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringsAreAnagram {

	public static void main(String[] args) {
		
		getAnagrams("ashok");
		
	}
	
	public static String canonicalize(String s)
	{
		return Stream.of(s.split("")).sorted().collect(Collectors.joining());
	}
	
	public static void getAnagrams(String st)
	{
		Map<String, Set<String>> collect = Stream.of(st).map(str -> str.split("")).flatMap(Arrays::stream)
				.collect(Collectors.groupingBy(StringsAreAnagram::canonicalize, Collectors.toSet()));
		
		System.out.println(collect);
		
	}
}
