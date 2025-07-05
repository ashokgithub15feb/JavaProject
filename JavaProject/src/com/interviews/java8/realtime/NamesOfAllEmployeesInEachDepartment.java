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

		Stream<List<Employee>> map2 = ListOfEmployee.getListOfEmployee().stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet()
				.stream().map(emp -> emp.getValue());
		
//		List<Employee> collect = map2.flatMap(f -> f.stream()).collect(Collectors.toList());
//		collect.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.joining(",")));
	}
}
