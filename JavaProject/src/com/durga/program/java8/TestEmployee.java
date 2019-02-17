package com.durga.program.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employee> l = new ArrayList<>();
		l.add(new Employee("Durda", 909384));
		l.add(new Employee("Sunny", 234455));
		l.add(new Employee("Chinny", 234578));
		l.add(new Employee("Bunny", 876543));
		l.add(new Employee("Vinny", 124678));
		
		System.out.println(l);
		
		Collections.sort(l, (e1, e2) -> (e1.getEno() < e2.getEno())?-1:(e1.getEno() > e2.getEno())?1:0);
		
		System.out.println(l);
		
		Collections.sort(l, (e1, e2) -> e1.getName().compareTo(e2.getName()));
		
		System.out.println(l);
		
		Stream<Employee> stream = l.stream();
		
		stream.forEach(System.out::println);
		
	}
}
