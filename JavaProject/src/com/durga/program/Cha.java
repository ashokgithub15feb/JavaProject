package com.durga.program;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Cha {

	public static void main(String[] args) {
		
		String s = "ashok";
		
		Map<Integer, Long> collect = s.chars().mapToObj(c -> c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(collect);
	}
}
