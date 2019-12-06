package com.ds.string;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "I love programming";
		System.out.println(s);
		String collect = Stream.of(s).map(str -> new StringBuilder(str).reverse()).collect(Collectors.joining());
		
		System.out.println(collect);
		System.out.println("---------------");
		String collect1 = Stream.of(s).map(str -> str.split("")).flatMap(Arrays::stream).collect(Collectors.joining());
		
		System.out.println(collect1);
		System.out.println("---------------");
		String reversed = s.chars()
			    .collect(StringBuilder::new, (b,c) -> b.insert(0,(char)c), (b1,b2) -> b1.insert(0, b2))
			    .toString();
		
		System.out.println(reversed);
		System.out.println("---------------");
		String reversed1 = s.chars().mapToObj(c -> (char)c).reduce("", (s1,c) -> c+s1, (s1,s2) -> s2+s1);
		
		System.out.println(reversed1);
		System.out.println("---------------");
		System.out.println();
		char[] charArray = s.toCharArray();
		
		IntStream.range(0, charArray.length).mapToObj(i -> charArray[(charArray.length - 1) - i]).forEach(System.out::print);
		 
		System.out.println();
		char[] charArray2 = s.toCharArray();
		
		IntStream.range(0, charArray2.length).mapToObj(i -> charArray2[(charArray2.length - 1) - i]).forEach(System.out::print);
		
		 
	}
}
