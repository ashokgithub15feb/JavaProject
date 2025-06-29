package com.interviews.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

//1) Given a list of integers, separate odd and even numbers?


public class SeparateEvenAndOddNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

		System.out.println("Original: "+list);
		
		Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

		System.out.println(collect);
		
		Map<Boolean, List<Integer>> collect2 = list.stream().collect(Collectors.partitioningBy(input -> getResult(input)));
		
		collect2.entrySet().stream().forEach(output -> printResult(output));
	}

	private static void printResult(Entry<Boolean, List<Integer>> output) {
		System.out.println(output.getKey()+" : "+output.getValue());
	}

	private static boolean getResult(Integer input) {
		return input % 2 == 0;
	}
}
