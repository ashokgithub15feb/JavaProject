package com.interviews.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumber {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

		System.out.println("Original: " + listOfIntegers);

		List<Integer> collect = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1)
				.collect(Collectors.toList());

		System.out.println(collect);
		
		Integer integer = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(integer);
	}
}
