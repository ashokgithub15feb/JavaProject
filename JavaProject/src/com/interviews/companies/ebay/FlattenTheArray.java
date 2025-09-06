package com.interviews.companies.ebay;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlattenTheArray {

	public static void main(String[] args) {
		
		Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 , new Integer[] {11,22}, 15 }};
		//{1,2,3,4,5,6,7}
		
		Stream<Object> flatten = flatten(array);
		
		List<Object> list = flatten.toList();
		
		System.out.println(list);
		
	}

	private static Stream<Object> flatten(Object[] array) {
		
		Stream<Object> flatMap = Arrays.stream(array).flatMap(fm -> {
			if(fm instanceof Object[]) {
				System.out.println("if: "+fm);
				return flatten((Object[]) fm);
			} 
			else {
				System.out.println("else: "+fm);
				return Stream.of(fm);
			}
		});
		
		return flatMap;
	}
}
