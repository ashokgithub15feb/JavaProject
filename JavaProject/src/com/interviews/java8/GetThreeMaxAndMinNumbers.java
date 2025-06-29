package com.interviews.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//11) How do you get three maximum numbers and three minimum numbers from the given list of integers?

public class GetThreeMaxAndMinNumbers {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

		System.out.println("Original: " + listOfIntegers);

		List<Integer> min3 = listOfIntegers.stream().sorted().limit(3).collect(Collectors.toList());

		List<Integer> max3 = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3)
				.collect(Collectors.toList());

		System.out.println("Three Min Number: " + min3 + "\nThree Max Number: " + max3);
	}
}
