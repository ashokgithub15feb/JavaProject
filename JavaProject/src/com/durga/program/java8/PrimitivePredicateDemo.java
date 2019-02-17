package com.durga.program.java8;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

public class PrimitivePredicateDemo {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i*i;
		
		System.out.println(f.apply(4));
		
		IntFunction<Integer> ifun = i-> i*i;
		System.out.println(ifun.apply(5));
	}
}
