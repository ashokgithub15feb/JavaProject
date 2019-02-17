package com.durga.program.java8.spliterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class SpliteratorDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("AB");
		list.add("BC");
		list.add("CD");
		list.add("DE");
		list.add("EF");
		list.add("FG");
		list.add("FG");
		list.add("HI");
		list.add("IJ");
			
		
		Spliterator<String> spliterator = list.spliterator();
		
		int excepted = Spliterator.ORDERED | Spliterator.SIZED | Spliterator.SUBSIZED;
		
		System.out.println(spliterator.characteristics() == excepted);
		
		System.out.println(spliterator.estimateSize());
		System.out.println(spliterator.getExactSizeIfKnown());
		
//		System.out.println(spliterator.getComparator());
		
		System.out.println("==========================");
		
		Spliterator<String> spliterator2 = list.spliterator();
		
		Spliterator<String> trySplit = spliterator2.trySplit();
		
	
		spliterator2.forEachRemaining(System.out::println);
		
		System.out.println("===============");
		
		trySplit.forEachRemaining(System.out::println);
		
		System.out.println(trySplit);
		
		System.out.println("===========forEachRemaining() method to perform hshNext() and next() method operation for single operation============");
		
		Spliterator<String> spliterator3 = list.spliterator();
		spliterator3.forEachRemaining(new Consumer<String>() {

			@Override
			public void accept(String t) {
		
				System.out.println(t);
			}
		});
		
		
		long estimateSize = list.stream().spliterator().estimateSize();
		System.out.println(estimateSize);
		
		System.out.println("========================");
		Spliterator<String> spliterator4 = list.spliterator();
		
		spliterator4.tryAdvance(System.out::println); //traversal element one by one from list
		System.out.println("========================");
		while(true)
		{
			spliterator4.tryAdvance(System.out::println);
		}
		
		
	}
}
