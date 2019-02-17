package com.durga.program.java8.revies.stream;

import java.util.function.Predicate;

public class FiltterElement implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		
		Predicate<Integer> p = i -> i % 2 == 0;
		
		return p.test(t);
	}

}
