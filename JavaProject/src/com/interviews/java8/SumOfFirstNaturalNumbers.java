package com.interviews.java8;

import java.util.stream.IntStream;

//19) How do you find sum of first 10 natural numbers?


public class SumOfFirstNaturalNumbers {

	public static void main(String[] args) {
		
		int sum = IntStream.range(1, 11).sum();
		
		System.out.println(sum);
	}
}
