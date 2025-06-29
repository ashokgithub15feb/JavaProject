package com.interviews.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

//10) How do you merge two unsorted arrays into single sorted array without duplicates?


public class MergeTwoUnsortedArraysIntoSingleSortedWithoutDuplicate {

	public static void main(String[] args) {
		
		int[] a = new int[] {4, 2, 5, 1};
        
        int[] b = new int[] {8, 1, 9, 5};
        
        System.out.println("Original: "+Arrays.toString(a));
        System.out.println("Original: "+Arrays.toString(b));
        
        int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        
        System.out.println(Arrays.toString(array));
	}
}
