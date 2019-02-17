package com.durga.program.javabrahman.java8.stream;

import java.util.stream.Stream;

public class InfiniteStreams {

	public static void main(String[] args) {
		
		Stream.iterate(2, n -> n*n).limit(5).forEach(System.out::println);
	}
}
