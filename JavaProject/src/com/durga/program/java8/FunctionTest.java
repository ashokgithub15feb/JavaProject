package com.durga.program.java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTest {

	public static void main(String[] args) {
		
//		Predicate<Integer> p = i -> i%2 == 0;
//		System.out.println(p.test(10));
//		System.out.println(p.test(15));
		
		Function<Integer, Integer> f = i -> i*i;
		System.out.println(f.apply(4));
		System.out.println(f.apply(5));
		
		Function<Integer, Boolean> f1 = i -> i%2==0;
		System.out.println(f1.apply(10));
		
		//Input type - String
		//output type - Integer
		Function<String, Integer> f2 = s -> s.length();
		System.out.println(f2.apply("Durga"));
		System.out.println(f2.apply("Ashok"));
		System.out.println(f2.apply("Durga Sorfware Solution"));
		
		Function<String, String> f3 = s -> s.toUpperCase();
		System.out.println(f3.apply("Ashok"));
	}
}
