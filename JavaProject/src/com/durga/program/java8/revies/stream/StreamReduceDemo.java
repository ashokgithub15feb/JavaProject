package com.durga.program.java8.revies.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamReduceDemo {

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

		Stream<Integer> filter = stream.filter(i -> i%2 ==0);//.map(i -> i +5).reduce(0 , Integer::sum);
		
		Stream<Integer> map = filter.map((i -> i +5));
		
		Optional<Integer> reduce = map.reduce(new BinaryFunction());

		Integer integer = reduce.get();
		
		System.out.println(integer);
		
		List l2 = new ArrayList();
		l2.add(3);
		
		Stream stream2 = l2.stream();
		
		Stream map2 = stream2.map(i -> i);
		List collect = (List) map2.collect(Collectors.toList());
		System.out.println(collect);
	}
}
