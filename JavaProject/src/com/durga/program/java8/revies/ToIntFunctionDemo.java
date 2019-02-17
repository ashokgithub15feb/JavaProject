package com.durga.program.java8.revies;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class ToIntFunctionDemo {

	public static void main(String[] args) {
		
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Ashok"));
	
		
		ToIntFunction<String> fi = s -> s.length();
		System.out.println(fi.applyAsInt("Ashok Yadav"));
	}
}
