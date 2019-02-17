package com.durga.program.javabrahman.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFlatMapping {

	private static List<Employee> employeeList =
			 Arrays.asList(new Employee("Tom Jones", 45), 
			    	       new Employee("Harry Major", 25),
			    	       new Employee("Ethan Hardy", 65),
			    	       new Employee("Nancy Smith", 15),
			    	       new Employee("Deborah Sprightly", 29));
	
	public static void main(String[] args) {
	
		Stream<String[]> splitMap = employeeList.stream().map(emp -> emp.getName().split(""));
		
		Stream<String> flatMap = splitMap.flatMap(array -> Arrays.stream(array));
		
		Stream<String> streamMap = flatMap.map(str -> str.toUpperCase());
		
		//Stream<String> filter = streamMap.filter(str -> !str.equals(" "));//.collect(Collectors.toList());
		
		List<String> collect = streamMap.collect(Collectors.toList());
		
		collect.forEach(str -> System.out.print(str));
		
		System.out.println();
		
		List<String> nameCharList = employeeList.stream()
		           .map(emp-> emp.getName().split(""))
		           .flatMap(array->Arrays.stream(array))
		           .map(str -> str.toUpperCase()) 
		           .filter(str -> !(str.equals(" ")))
		           .collect(Collectors.toList());
		
		
		   nameCharList.forEach(str -> System.out.print(str));
		   
	}
}
