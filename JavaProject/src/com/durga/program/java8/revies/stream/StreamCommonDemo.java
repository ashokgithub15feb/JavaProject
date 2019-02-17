package com.durga.program.java8.revies.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCommonDemo {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);
		l.add(35);
		
		System.out.println(l);
		
		Stream<Integer> stream = l.stream();
		
		//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		// if you to used same stream object ofr some other stream the you will get runtion exception
		List<Integer> collect2 = stream.filter(i -> i%2 ==0).map(i -> i +5).collect(Collectors.toList());
		
		System.out.println(collect2);
		
		List<Integer> collect = l.stream().filter(new FiltterElement()).map(new FunctionApplied()).collect(Collectors.toList());
		System.out.println(collect);
	}
}
