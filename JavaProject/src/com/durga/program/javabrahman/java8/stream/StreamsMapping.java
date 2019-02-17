package com.durga.program.javabrahman.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapping {

	private static List<Employee> employeeList =
		 Arrays.asList(new Employee("Tom Jones", 45), 
		    	       new Employee("Harry Major", 25),
		    	       new Employee("Ethan Hardy", 65),
		    	       new Employee("Nancy Smith", 15),
		    	       new Employee("Deborah Sprightly", 29));
	
	public static void main(String[] args) {

		List<String> collect = employeeList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		collect.forEach(System.out::println);

		System.out.println();
		List<Integer> collect2 = employeeList.stream().map(emp -> emp.getAge()).collect(Collectors.toList());
		collect2.forEach(System.out::println);
		
	}
}
