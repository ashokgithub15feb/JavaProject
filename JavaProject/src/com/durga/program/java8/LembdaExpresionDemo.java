package com.durga.program.java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class LembdaExpresionDemo {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(4));
		System.out.println(f.apply(5));
		
		Predicate<Integer> p = j -> j%2==0;
		System.out.println(p.test(4));
		System.out.println(p.test(7));
		
		Function<String, String> s = (dd) -> dd;
		
		System.out.println(s.apply("Hello"));
		
		Function<Integer, Integer> sq = n -> n * n;
		
		System.out.println("Square of 7 number: "+sq.apply(7));
		
		Function<String, Integer> len = length -> length.length();
		System.out.println("Length ofg String: "+len.apply("Ashok"));
	}
}
