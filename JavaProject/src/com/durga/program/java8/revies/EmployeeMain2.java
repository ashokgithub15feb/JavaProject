package com.durga.program.java8.revies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain2 {

	public static void main(String[] args) {
		
		ArrayList<Employee> l = new ArrayList<>();
		
		l.add(new Employee("Dan", 4));
	    l.add(new Employee("Andi", 2));
	    l.add(new Employee("Bob", 42));
	    l.add(new Employee("Debby", 3));
	    l.add(new Employee("Bob", 72));
	    l.add(new Employee("Barry", 20));
	    l.add(new Employee("Cathy", 40));
	    l.add(new Employee("Bob", 40));
	    l.add(new Employee("Barry", 50));
		
		
		System.out.println(l);
		System.out.println("==================================");
		
		Comparator<Employee> c = Comparator.comparing(emp -> emp.getName());
		c = c.thenComparing(Comparator.comparing(emp -> emp.getEno()));
		
		Stream<Employee> sorted = l.stream().sorted(c);
		
		List<Employee> collect = sorted.collect(Collectors.toList());
		
		System.out.println(collect);
		
		//[Employee [name=Andi, eno=2], 
		// Employee [name=Barry, eno=20], 
		// Employee [name=Barry, eno=50], 
		// Employee [name=Bob, eno=40], 
		// Employee [name=Bob, eno=42], 
		// Employee [name=Bob, eno=72],
		// Employee [name=Cathy, eno=40], 
		// Employee [name=Dan, eno=4], 
		// Employee [name=Debby, eno=3]]
		
	}
}
