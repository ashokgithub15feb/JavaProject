package com.durga.program.javabrahman.java8.stream;

import java.util.stream.Stream;

public class GenerateStreams {

	public static void main(String[] args) {
		
		Stream.generate(Math::random).limit(5).forEach(System.out::println);
	}
}
