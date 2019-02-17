package com.durga.program.java8.revies;

import java.util.function.Function;

public class FunctionDemo1 {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f1 = i -> i*2;
		Function<Integer, Integer> f2 = i -> i*i*i;

		Integer andThen = f1.andThen(f2).apply(2);
		
		System.out.println(andThen);
		
		Integer compose = f1.compose(f2).apply(2);
		System.out.println(compose);
		
		Function<Integer, Integer> identity = Function.identity();
		System.out.println(identity.apply(1329));
	}
}
