package com.durga.program.java8.revies;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorDemo1 {

	public static void main(String[] args) {
		
		IntUnaryOperator f1 = i -> i+1;
		System.out.println(f1.applyAsInt(5));
		
		IntUnaryOperator f2 = i -> i*i;
		System.out.println(f2.applyAsInt(5));
		
		System.out.println(f1.andThen(f2).applyAsInt(5));
		
	}
}
