package com.durga.program.java8.revies;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = n -> n * n;
		System.out.println(f.apply(4));
		System.out.println(f.apply(5));
		
		System.out.println();
		
		Function<String, Integer> f1 = s -> s.length();
		System.out.println("Length of Name: "+f1.apply("Durga"));
		
		Function<String, String> f2 = s -> s.toUpperCase();
		System.out.println(f2.apply("ashok"));
		
		Function<String, String> f3 = s -> {
			
			String s1 = s.substring(0, 1).toUpperCase();
			
			s1 = s1 + s.substring(1, s.length());
			
			return s1;
		};
		
		System.out.println(f3.apply("ashok"));
		 
		
		System.out.println("===============Change the init cap for all the fruits===============");
		
		String[] fruits = {"apple","Orange","banana","Pineapple", "Papaya", "watermilan"};
		
		List<String> asList = Arrays.asList(fruits);
		
		for(String fruit: asList)
		{
			System.out.println(f3.apply(fruit));
		}
		
	}
}
