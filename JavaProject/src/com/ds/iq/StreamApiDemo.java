package com.ds.iq;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(43);
		l.add(23);
		l.add(null);
		
		System.out.println(l);
		
		long count = l.stream().filter(i -> i % 2 == 0 ).mapToInt(i -> i).count();
		System.out.println(count);
		
		long sum = l.stream().filter(i -> i % 2 == 0 ).mapToInt(i -> i).sum();
		System.out.println(sum);
		
		HashSet<Integer> h = new HashSet<>();
		h.add(90);
		h.add(95);
		h.add(93);
		
		h.stream().forEach(System.out::println);
		
		List<Integer> collect = l.stream().filter(i -> i%2 == 1).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> collect2 = l.stream().filter(i -> i > 12).collect(Collectors.toList());
		System.out.println(collect2);
	}
}
