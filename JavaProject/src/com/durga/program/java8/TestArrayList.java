package com.durga.program.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
				
		l.add(10);
		l.add(30);
		l.add(10);
		l.add(40);
		l.add(20);
		l.add(71);
		l.add(0);
		l.add(55);
		l.add(97);
		
		System.out.println(l);
		
		Comparator<Integer> c = (I1, I2) -> {
			
			return (I1<I2)?1:(I1>I2)?-1:0;
			
			/*if(I1<I2)
			{
				return 1;
			}
			else if(I1>I2)
			{
				return -1;
			}
			else
			{
				return 0;
			}*/
		};
		
		Collections.sort(l, c);
		
		System.out.println(l);
		l.stream().forEach(System.out::println);
		
		List<Integer> l2 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l2);
		
	}
}
