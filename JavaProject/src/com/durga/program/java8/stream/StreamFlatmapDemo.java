package com.durga.program.java8.stream;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamFlatmapDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);
		System.out.println();
		Function<Integer, Integer> f = i -> i*i;
		l.stream().flatMap(i -> Stream.of(l)).forEach(System.out::println);;
	}
}
