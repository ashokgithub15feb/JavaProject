package com.interviews.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//8) Given a list of integers, find maximum and minimum of those numbers?


public class FindMinAndMax {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		System.out.println("Original: "+listOfIntegers);
		
		Integer min = listOfIntegers.stream().min((c1, c2) -> c1.compareTo(c2)).get();
		Integer max = listOfIntegers.stream().max((c1, c2) -> c1.compareTo(c2)).get();
		
		System.out.println("Min: "+min+", Max: "+max);
		
		Integer min1 = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
		Integer max1 = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
		
		System.out.println("Min: "+min1+", Max: "+max1);
	}
}
