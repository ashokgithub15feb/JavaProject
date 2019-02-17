package com.durga.program.java8;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperationDemo {

	public static void main(String[] args) {
		
		//if input type and output type is same then better will go for UnaryOperation
		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(5));
		System.out.println("===========================");
		
		UnaryOperator<Integer> up = i -> i*i;
		System.out.println(up.apply(8));
		
	}
}
