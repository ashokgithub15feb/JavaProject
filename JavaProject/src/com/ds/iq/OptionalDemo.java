package com.ds.iq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalDemo {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		List<String> l = Arrays.asList("Mark", "Howard", "Anthony D'Cornian", "Ramanaresh Sharma");

		Optional<String> findAny = l.stream().filter(str -> str.length() > 10).findAny();
		Optional<String> findFirst = l.stream().filter(str -> str.length() > 10).findFirst();

		System.out.println(findAny);
		System.out.println(findFirst);

		findAny.ifPresent(System.out::println);

		Optional<Object> empty = Optional.empty();

		// empty = empty.of("aa");
		// Object object = empty.get(); // throw new NoSuchElementException("No value
		// present");

		System.out.println(empty.orElse("Default value"));

		System.out.println("========================================");

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 100; i++)
			myList.add(i);

		// sequential stream
		Stream<Integer> sequentialStream = myList.stream();

		// parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		List<Integer> collect = parallelStream.collect(Collectors.toList());
		System.out.println(collect);

		System.out.println("=====================================");

		Stream<Integer> intStream = Stream.of(1, 2, 3, 4);
		List<Integer> intList = intStream.collect(Collectors.toList());
		System.out.println(intList); // prints [1, 2, 3, 4]

		intStream = Stream.of(1, 2, 3, 4); // stream is closed, so we need to create it again
		Map<Integer, Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i + 10));
		System.out.println(intMap); // prints {1=11, 2=12, 3=13, 4=14}

		System.out.println("=====================================");

		List<Integer> myList1 = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			myList1.add(i);
		}

		Stream<Integer> sequentialStream1 = myList1.stream();

		Stream<Integer> highNums = sequentialStream1.filter(p -> p > 90); // filter numbers greater than 90
		System.out.print("High Nums greater than 90=");
		highNums.forEach(p -> System.out.print(p + " "));
		// prints "High Nums greater than 90=91 92 93 94 95 96 97 98 99 "

		System.out.println("=====================================");

		Stream<List<String>> namesOriginalList = Stream.of(Arrays.asList("Pankaj"), Arrays.asList("David", "Lisa"),
				Arrays.asList("Amit"));
		// flat the stream from List<String> to String stream
		Stream<String> flatStream = namesOriginalList.flatMap(strList -> strList.stream());

		flatStream.forEach(System.out::println);

		System.out.println("=======================================");

		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);

		Optional<Integer> intOptional = numbers.reduce((i, j) -> {
			
			return i * j;
		
		});
		if (intOptional.isPresent())
			System.out.println("Multiplication = " + intOptional.get()); // 120

	}
}
