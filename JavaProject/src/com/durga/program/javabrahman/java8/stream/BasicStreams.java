package com.durga.program.javabrahman.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicStreams {

	private static List<Employee> employeeList=
		      Arrays.asList(new Employee("Tom Jones", 45), 
		                    new Employee("Harry Major", 25),
		                    new Employee("Ethan Hardy", 65),
		                    new Employee("Nancy Smith", 15),
		                    new Employee("Deborah Sprightly", 29));
	
	public static void main(String[] args) {
		
		List<Employee> processTheList = employeeList.stream().collect(Collectors.toList());
		
		processTheList.forEach(System.out::println);
		System.out.println();
		List<Employee> processTheLimitLst = employeeList.stream().limit(2).collect(Collectors.toList());
		
		processTheLimitLst.forEach(System.out::println);
	}
}
