package com.durga.program.java8.revies;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class IntToDubleFunctionDemo {

	public static void main(String[] args) {
		
		Function<Integer, Double> f = i -> Math.sqrt(i);
		System.out.println(f.apply(7));
		
		IntToDoubleFunction fd = i -> Math.sqrt(i);
		System.out.println(fd.applyAsDouble(9));
		
	}
}
