package com.durga.program.java8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
		
		BiFunction<String, String, String> b = (s1, s2) -> s1+s2;
		System.out.println(b.apply("Ashok", " Software"));
		
		BinaryOperator<String> bo = (s1, s2) -> s1+s2;
		System.out.println(bo.apply("Ashok", " Software"));
		
		BinaryOperator<Integer> bo1 = (s1, s2) -> s1+s2;
		System.out.println(bo1.apply(10,20));
		
		IntBinaryOperator bo11 = (s1, s2) -> s1+s2;
		System.out.println(bo11.applyAsInt(15,20));
		
	}
}
