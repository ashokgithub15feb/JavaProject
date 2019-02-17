package com.durga.program.java8.revies;

import java.util.function.IntFunction;

public class IntFunctionDemo {

	public static void main(String[] args) {
		
		IntFunction<Integer> f = i -> i*i;
		System.out.println(f.apply(4));
	}
}
