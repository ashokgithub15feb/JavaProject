package com.interviews.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//7) From the given list of integers, print the numbers which are multiples of 5?


public class NumbersWhichMultiplesOfFive {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		System.out.println("Original: "+listOfIntegers);
		
		List<Integer> collect = listOfIntegers.stream().filter(m -> m % 5 == 0).collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
