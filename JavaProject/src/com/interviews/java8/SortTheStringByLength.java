package com.interviews.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//15) Given a list of strings, sort them according to increasing order of their length?

public class SortTheStringByLength {

	public static void main(String[] args) {

		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

		System.out.println("Original: "+listOfStrings);
		
		//wrong
		//List<String> collect = listOfStrings.stream().sorted().collect(Collectors.toList());
		
		//System.out.println(collect);
		
		listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}
}
