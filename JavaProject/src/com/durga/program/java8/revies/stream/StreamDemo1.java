package com.durga.program.java8.revies.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(40);
		l.add(20);
		l.add(30);
		
		System.out.println(l);
		
		int sum = l.stream().filter(i -> (i >10)).mapToInt(i -> i).sum();
		
		System.out.println(sum);
		
		
		Stream<String> words = Stream.of("Java", "Magazine", "is", "the", "best");
		Map<String, Long> collect = words.map(w -> w.split("")).flatMap(Arrays::stream).
			collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(collect);
	}
}
