package com.durga.program.java8.revies.stream;

import java.util.function.Function;

public class FunctionApplied implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer t) {
		
		Function<Integer, Integer> f = i -> i + 5;
		return f.apply(t);
	}


}
