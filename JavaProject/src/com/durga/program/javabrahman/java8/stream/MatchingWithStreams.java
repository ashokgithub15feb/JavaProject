package com.durga.program.javabrahman.java8.stream;

import java.util.Arrays;
import java.util.List;

public class MatchingWithStreams {

	static List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45),
		      new Employee("Harry Major", 25),
		      new Employee("Ethan Hardy", 65),
		      new Employee("Nancy Smith", 22),
		      new Employee("Deborah Sprightly", 29));
	
	public static void main(String[] args) {
		
		boolean isEmpAge = employeeList.stream().allMatch(emp -> emp.getAge() > 21);
		
		System.out.println("All Employee are above 21 year old: "+isEmpAge);
		
		boolean isEmpAge1 = employeeList.stream().allMatch(emp -> emp.getAge() > 22);
		
		System.out.println("All Employee are above 22 year old ?: "+isEmpAge1);
		
		boolean allMatch = employeeList.stream().allMatch(new AllMatched());
		System.out.println(allMatch);
		
		boolean anyMatch = employeeList.stream().anyMatch(new AnyMatched());
		System.out.println("Any Emplyee is above 30: "+anyMatch);
		
		boolean noneMatch = employeeList.stream().noneMatch(new NoneMatched());
		System.out.println("No Employee is below 21: "+noneMatch);
		
		
	}
}
