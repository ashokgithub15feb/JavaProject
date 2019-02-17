package com.durga.program.java8;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f1 = i -> 2*i;
		Function<Integer, Integer> f2 = i -> i*i*i;
		
		//first apply f1 result to f2
		//f1 = 2*2=4
		//result = 4
		//then apply f2 = 4*4*4;
		//return result
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));
		
		
		
	}
}
