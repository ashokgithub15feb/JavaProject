package com.durga.program.java8.spliterator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountCharacterInWord {

	public static void main(String[] args) {
		
		String str = "AshokKumaryadav";
		
		String[] split = str.split("");
		
		List<String> asList = Arrays.asList(split);
		
		//Stream<String> flatMap = asList.stream().map(s -> s.split("")).flatMap(Arrays::stream);
		
		Map<String, Long> collect = asList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(collect);
	}
}
//{a=3, A=1, r=1, s=1, d=1, u=1, v=1, h=1, y=1, K=1, k=1, m=1, o=1}
//{a=3, A=1, r=1, s=1, d=1, u=1, v=1, h=1, y=1, K=1, k=1, m=1, o=1}
