package com.interviews.java8;

import java.util.stream.IntStream;

//23) Palindrome program using Java 8 streams

public class PalindromeUsingJava8 {

	public static void main(String[] args) {

		String str = "ROTATOR";

		int startInclusive = 0;
		int endExclusive = str.length();

		boolean noneMatch = IntStream.range(startInclusive, endExclusive / 2)
				.noneMatch(i -> str.charAt(i) != str.charAt(endExclusive - i - 1));
		
		if(noneMatch) {
			System.out.println(str+" is a Palindrome");
		} else {
			System.out.println(str+" is not a Palindrome");
		}
		
		int number = 1234321;
		
		int reduce = IntStream.iterate(number, i -> i / 10)
		        .map(n -> n % 10)
		        .limit(String.valueOf(number).length())
		        .reduce(0, (a, b) -> a = a * 10 + b);
		
		System.out.println(number == reduce);
	}
}
