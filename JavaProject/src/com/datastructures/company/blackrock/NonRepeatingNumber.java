package com.datastructures.company.blackrock;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 30, 10, 50, 40, 60, 90, 50);
		System.out.println("input: "+list);
		Integer integer1 = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(f -> f.getValue() == 1).map(m -> m.getKey()).findFirst().get();

		System.out.println("First Non Repeating Number = "+integer1);

		Integer integer2 = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(f -> f.getValue() == 1).map(m -> m.getKey()).skip(1).findFirst().get();

		System.out.println("Second Non Repeating Number = "+integer2);

		Integer integer3 = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(f -> f.getValue() == 1).map(m -> m.getKey()).skip(2).findFirst().get();

		System.out.println("Third Non Repeating Number = "+integer3);
		
		System.out.println("First Repeating Number");
		int k = 2;
		Integer integer4 = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(f -> f.getValue() == k).map(m -> m.getKey()).findFirst().get();

		System.out.println("Third Non Repeating Number = "+integer4);
	}
}
