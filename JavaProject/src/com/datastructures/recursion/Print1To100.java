package com.datastructures.recursion;

import java.util.stream.IntStream;

public class Print1To100 {

	public static void main(String[] args) {
		
		IntStream.range(1, 100).forEach(System.out::println);
	}
}
