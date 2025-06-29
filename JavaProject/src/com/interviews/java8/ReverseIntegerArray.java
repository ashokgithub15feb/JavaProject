package com.interviews.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

//20) Reverse an integer array


public class ReverseIntegerArray {

	public static void main(String[] args) {
		
		int[] array = new int[] {5, 1, 7, 3, 9, 6};
		
		System.out.println("Original: "+Arrays.toString(array));
		
		int[] array2 = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();
		
		System.out.println(Arrays.toString(array2));
	}
}
