package com.durga.program.java8.revies;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i*i;
		System.out.println(f.apply(6));
		
		//same input type and output type
		
		UnaryOperator<Integer> uo = i -> i*i;
		System.out.println(uo.apply(3));
	}
}
