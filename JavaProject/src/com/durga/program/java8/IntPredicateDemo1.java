package com.durga.program.java8;

import java.util.function.IntPredicate;

public class IntPredicateDemo1 {

	public static void main(String[] args) {
		
		IntPredicate ip = i -> i*2==0;
		System.out.println(ip.test(5));
	}
}
