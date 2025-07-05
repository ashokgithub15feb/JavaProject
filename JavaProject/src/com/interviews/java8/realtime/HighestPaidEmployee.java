package com.interviews.java8.realtime;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

//Query 3.4 : Get the details of highest paid employee in the organization?

public class HighestPaidEmployee {

	public static void main(String[] args) {

		Optional<Employee> optional = ListOfEmployee.getListOfEmployee().stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		
		System.out.println(optional.get());
	}
}
