package com.ds.thread;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//4,8,1,13,2,17,5,1,1,2,2,2,4,5
// 2 = 4
// 1 = 3
// 4 = 2
// 5 = 2
// 8 = 1
// 17 = 1
// 13 = 1

public class Q {

	public static void main(String[] args) {
		
		int[] arr = {4,8,1,13,2,17,5,1,1,2,2,2,4,5};
		
		Map<int[], Long> collect = Stream.of(arr).collect(Collectors.groupingBy(f -> f, Collectors.counting()));
		
		System.out.println(collect);
	}
}
