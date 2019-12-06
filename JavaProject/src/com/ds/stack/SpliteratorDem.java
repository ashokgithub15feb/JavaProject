package com.ds.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDem {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("AB");
		list.add("BC");
		list.add("CD");
		list.add("DE");
		list.add("EF");
		list.add("FG");
		list.add("GH");
		list.add("HI");
		list.add("IJ");
		
		Spliterator<String> spliterator = list.spliterator();
		
		Spliterator<String> trySplit = spliterator.trySplit();
		
		spliterator.forEachRemaining(System.out::println);
		System.out.println("===============");
		trySplit.forEachRemaining(System.out::println);
		
	}
}
