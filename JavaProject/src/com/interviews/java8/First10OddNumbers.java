package com.interviews.java8;

import java.util.stream.Stream;

//30) First 10 odd numbers

public class First10OddNumbers {

	public static void main(String[] args) {

		Stream.iterate(new int[] { 1, 3 }, f -> new int[] { f[1], f[1] + 2 }).limit(10).map(m -> m[0])
				.forEach(f -> System.out.println(f + " "));
	}
}
