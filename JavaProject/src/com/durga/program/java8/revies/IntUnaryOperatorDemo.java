package com.durga.program.java8.revies;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorDemo {

	public static void main(String[] args) {
		
		IntUnaryOperator u = i -> i*i;
		System.out.println(u.applyAsInt(6));
	}
}
