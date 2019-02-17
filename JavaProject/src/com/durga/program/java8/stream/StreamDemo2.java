package com.durga.program.java8.stream;

import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		Stream<Integer> s = Stream.of(9,99,999,9999,99999,999999);
		
		s.forEach(System.out::println);
		
		Integer[] i = {2,22,222,2222,22222,222222,2222222};
		Stream.of(i).forEach(System.out::println);
		
		
		
	}
}
