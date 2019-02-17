package com.durga.program.java8;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorDemo {

	public static void main(String[] args) {
		
		IntUnaryOperator o = i -> i*i;
		System.out.println(o.applyAsInt(9));
		
		DoubleUnaryOperator duo = i -> i*i;
		System.out.println(duo.applyAsDouble(5.5));
	}
}
