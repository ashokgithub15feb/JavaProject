package com.interviews.java8;

import java.util.Arrays;
import java.util.List;

//31) How do you get last element of an array?


public class GetLastElementOfAnArray {

	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
		
		System.out.println("Original: "+listOfStrings);
		
		String string = listOfStrings.stream().skip(listOfStrings.size()-1).findFirst().get();
		
		System.out.println(string);
	}
}
