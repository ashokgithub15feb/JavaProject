package com.interviews.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//2) How do you remove duplicate elements from a list using Java 8 streams?


public class RemoveDuplicateElement {

	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		
		System.out.println("Original: "+listOfStrings);
		listOfStrings.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
	}
}
