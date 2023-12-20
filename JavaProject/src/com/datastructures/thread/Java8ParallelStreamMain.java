package com.datastructures.thread;

import java.util.Arrays;

public class Java8ParallelStreamMain {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		Arrays.stream(arr).forEach(f -> System.out.println(f+" - "+Thread.currentThread().getName()));
		System.out.println("==================");
		Arrays.asList(1,2,3,4,5,6,7,8,9,10).parallelStream().forEach(f -> System.out.println(f+" - "+Thread.currentThread().getName()));
	}
}
