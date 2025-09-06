package com.interviews.companies.ust;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		 int arr[] = {1, 2, 3, 6, 3, 6, 1};

	        List<Integer> duplicates = IntStream.of(arr).boxed().collect(Collectors.groupingBy(Function.identity(),
	                        Collectors.counting()))
	                .entrySet().stream()
	                .filter(entry -> entry.getValue() > 1).map(key -> key.getKey()).collect(Collectors.toList());

	        System.out.println(duplicates);
	}
}
