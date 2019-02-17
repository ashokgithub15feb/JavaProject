package com.durga.program.javabrahman.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindInStreams {

	private static List<Employee> employeeList = Arrays.asList(
		    new Employee("Tom Jones", 45),
		    new Employee("Harry Major", 25),
		    new Employee("Ethan Hardy", 65),
		    new Employee("Nancy Smith", 22),
		    new Employee("Deborah Sprightly", 29),
		    new Employee("Billy Kid", 22),
		    new Employee("George King",44),
		    new Employee("Annie Barrey", 19),
		    new Employee("Annie Barrey", 89));
	
	public static void main(String[] args) {
		
		Optional<Employee> findAny = employeeList.stream().filter(emp -> emp.getAge() >80).findAny();
		
		if(findAny.isPresent())
		{
			System.out.println("Any Employee above age 40: "+findAny.get());
		}
		else
		{
			System.out.println("None of Employee above age 80 year");
		}
		
		Optional<Employee> findFirst = employeeList.stream().filter(e -> e.getAge() < 30).findFirst();
		
		if(findFirst.isPresent())
		{
			System.out.println("First employee below 30: "+findFirst.get());
		}
		else {
			System.out.println("None EMployee");
		}
	}
}
