package com.java8.lambdaexp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(18);
		list.add(14);
		list.add(13);
		list.add(12);
		list.add(17);
		
		long count = list.stream().count();
		System.out.println(count);
		
		List<Integer> collect = list.stream().filter(f -> f % 2 != 0).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> collect1 = list.stream().filter(f -> f % 2 != 0).map(m -> m + 10).collect(Collectors.toList());
		System.out.println(collect1);
	}
}
