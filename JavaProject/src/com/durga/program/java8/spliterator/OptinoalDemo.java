package com.durga.program.java8.spliterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class OptinoalDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(29);
		list.add(25);
		list.add(29);
		list.add(23);
		list.add(21);
		list.add(6);
		list.add(8);
		list.add(8);
		
		
		Optional<Integer> max = list.stream().filter(i -> i%2==0).max((n1, n2) -> Integer.compare(n1, n2));
		
		System.out.println(max); //Optional.empty if there is no even number present in list
		
		Integer orElse = list.stream().filter(i -> i%2==0).max((n1, n2) -> Integer.compare(n1, n2)).orElse(0);
		
		System.out.println(orElse);

		boolean present = list.stream().filter(i -> i%2==0).max((n1, n2) -> Integer.compare(n1, n2)).isPresent();
		System.out.println(present);
		
		Optional<Integer> map = list.stream().filter(i -> i%2==0).max((n1, n2) -> Integer.compare(n1, n2)).map(new Function<Integer, Integer>() {
			
			public Integer apply(Integer t) {
				return t*t;
			};
		});		
		
		System.out.println(map);
	}
}


interface A
{
	default void m2()
	{
		
	}
}

interface B extends A
{
}

interface C extends A
{
}

class D implements B, C
{
	public void m2()
	{
		B.super.m2();
		C.super.m2();
	}
}