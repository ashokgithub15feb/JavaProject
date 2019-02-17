package com.durga.program.java8.revies;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
		
		BiFunction<String, String, String> f = (s1, s2) -> s1+s2;
		
		System.out.println(f.apply("Ashok", " Kumar"));
		
		BinaryOperator<String> bo = (s1, s2) -> s1+s2;
		System.out.println(bo.apply("Ashok", " Yadav"));
		
		BinaryOperator<Integer> bo1 = (i1, i2) -> i1+i2;
		System.out.println(bo1.apply(10,20));
		
		IntBinaryOperator bo2 = (i1, i2) -> i1+i2;
		System.out.println(bo2.applyAsInt(10,20));
		
		
	}
}
