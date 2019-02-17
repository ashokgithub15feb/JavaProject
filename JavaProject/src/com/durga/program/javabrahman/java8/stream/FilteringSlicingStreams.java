package com.durga.program.javabrahman.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringSlicingStreams {

	private static List<Employee> employeeList=Arrays.asList(
								   new Employee("Tom Jones", 45), 
								   new Employee("Harry Major", 25),
								   new Employee("Ethan Hardy", 65),
								   new Employee("Nancy Smith", 15),
								   new Employee("Deborah Sprightly", 29),
								   new Employee("Dick Hiddleton Sprightly", 44),
								   new Employee("Alexander Hick", 19),
								   new Employee("Harry Major", 25),
								   new Employee("Nancy Smith", 15));
	
	public static void main(String[] args) {
		
		List<Employee> processStream = employeeList.stream().collect(Collectors.toList());
		processStream.forEach(System.out::println);
		
		System.out.println("\nFiltered Based on the Age for Employee > 24\n===================================");
		//Filter method
		processStream = processStream.stream().filter(new FilteredData()).collect(Collectors.toList());
		processStream.forEach(System.out::println);

		System.out.println("\nFiltered Based on the distinct data\n===================================");
		processStream = processStream.stream().distinct().collect(Collectors.toList());
		processStream.forEach(System.out::println);
		
		System.out.println("\nFiltered Based on the limited 3-data only\n===================================");
		processStream = processStream.stream().limit(3).collect(Collectors.toList());
		processStream.forEach(System.out::println);
		
		System.out.println("\nFiltered Based on the skil 1-data only\n===================================");
		processStream = processStream.stream().skip(1).collect(Collectors.toList());
		processStream.forEach(System.out::println);
		
	}
}
