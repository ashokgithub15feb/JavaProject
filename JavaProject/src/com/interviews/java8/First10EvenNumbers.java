package com.interviews.java8;

import java.util.stream.IntStream;

//21) Print first 10 even numbers

//table

public class First10EvenNumbers {

	public static void main(String[] args) {
		
		IntStream.rangeClosed(1, 10).map(m -> m * 2).forEach(System.out::println);
		System.out.println("=========");
		IntStream.rangeClosed(1, 10).map(m -> m * 3).forEach(System.out::println);
		System.out.println("=========");
		IntStream.rangeClosed(1, 10).map(m -> m * 4).forEach(System.out::println);
		System.out.println("=========");
		IntStream.rangeClosed(1, 10).map(m -> m * 5).forEach(System.out::println);
		
	}
}
