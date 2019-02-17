package com.durga.program.java8.revies.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapDemo {

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
		
		Stream<Integer> map = stream.map(new FunctionApplied());
		
		List<Integer> collect = map.collect(Collectors.toList());
		
		System.out.println(collect);

	}
}
