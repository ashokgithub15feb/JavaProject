package com.interviews.java8;

import java.util.Arrays;

//16) Given an integer array, find sum and average of all elements?


public class SumAndAverageOfElement {

	public static void main(String[] args) {
		
		int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
		
		System.out.println("Original: "+Arrays.toString(a));
		int sum = Arrays.stream(a).sum();
		System.out.println(sum);
		
		double asDouble = Arrays.stream(a).average().getAsDouble();
		System.out.println(asDouble);
	}
}
