package com.ds.string;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		
		String s = "I love programingpppp";
		System.out.println(s);
		Stream.of(s).map(str -> str.toLowerCase().replaceAll("\\s", "").split("")).flatMap(Arrays::stream)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().forEach(val -> {
			
			if(val.getValue() != 1)
			{
				System.out.println(val.getKey()+" : "+val.getValue());
			}
		});
		
	}
}
