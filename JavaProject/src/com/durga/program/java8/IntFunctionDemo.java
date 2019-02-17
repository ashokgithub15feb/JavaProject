package com.durga.program.java8;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class IntFunctionDemo {

	public static void main(String[] args) {
		
		IntFunction<Integer> ifun = i -> i * i;
		System.out.println(ifun.apply(50));
		
		System.out.println("=======================================");
		
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Ashok"));

		System.out.println("=======================================");
		
		ToIntFunction<String> tif = s -> s.length();
		System.out.println(tif.applyAsInt("Ashok"));
		
		System.out.println("=======================================");
		Function<Integer, Double> fd = i -> Math.sqrt(i);
		System.out.println(fd.apply(5));
		
		IntToDoubleFunction itdf = i -> Math.sqrt(i);
		System.out.println(itdf.applyAsDouble(6));
	}
}
