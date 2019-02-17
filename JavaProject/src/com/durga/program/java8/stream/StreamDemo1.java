package com.durga.program.java8.stream;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		
		System.out.println(l);
		
		Integer min = l.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(min);
		
		Integer max = l.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(max);
		
		System.out.println("===================================");
		
		Integer min1 = l.stream().min((i1,i2) -> -i1.compareTo(i2)).get();
		System.out.println(min1);
		
		Integer max1 = l.stream().max((i1,i2) -> -i1.compareTo(i2)).get();
		System.out.println(max1);
		
		System.out.println("===================================");
		
		l.stream().forEach(System.out::println);
		
		System.out.println("===================================");
		Consumer<Integer> c = i -> {
			System.out.println("The Square of "+i+" is: "+i*i);
		};

		l.stream().forEach(c);
		
		
		System.out.println("=======================================");
		
		Integer[] i = l.stream().toArray(Integer[]::new); //Integer[]::new --- constructor reference
		for(Integer i1 :i)
		{
			System.out.println(i1);
		}
		System.out.println("=======================================");
		Stream.of(i).forEach(System.out::println);
		
	}
}
