package com.durga.program.java8.revies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SquareNumber {

	public static void main(String[] args) {
		 List<Double> numbers = Arrays.asList(1D, 25D, 100D);
	
		 System.out.println(transformNumbers(numbers, Math::sqrt));
	}

	private static List<String> transformNumbers(List<Double> numbers, Function<Double, Double> fx) {

		List<String> aaplyed = new ArrayList<String>();
		
		for(Double d : numbers)
		{
			aaplyed.add(String.valueOf(fx.apply(d)));
		}
		
		return aaplyed;
	}
	
	
}
