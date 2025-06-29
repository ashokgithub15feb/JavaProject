package com.interviews.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//13) Find sum of all digits of a number in Java 8?


public class SumOfAllDigitsNumber {

	public static void main(String[] args) {
		
		int i = 15623;
		
		System.out.println("Original: "+i);
		
		Integer collect = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		
		System.out.println(collect);
		
	}
}
