package com.interviews.java8.realtime;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Query 3.12 : List down the names of all employees in each department?

public class NamesOfAllEmployeesInEachDepartment {

	public static void main(String[] args) {

		Map<String, List<Employee>> map = ListOfEmployee.getListOfEmployee().stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		System.out.println(map);
		
		
		Map<String, List<String>> map3 = ListOfEmployee.getListOfEmployee().stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));

		System.out.println(map3);
	}
}
