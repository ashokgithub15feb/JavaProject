package com.durga.program.java8.revies.stream;

import java.util.function.BinaryOperator;

public class BinaryFunction implements BinaryOperator<Integer> {

	@Override
	public Integer apply(Integer t, Integer u) {

		BinaryOperator<Integer> b = (i, j) -> (i+j);
		
		return b.apply(t, u);
	}

}
