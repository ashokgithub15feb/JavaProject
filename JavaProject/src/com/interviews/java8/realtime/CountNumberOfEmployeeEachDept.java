package com.interviews.java8.realtime;

import java.util.Map;
import java.util.stream.Collectors;

//Query 3.6 : Count the number of employees in each department?

public class CountNumberOfEmployeeEachDept {

	public static void main(String[] args) {

		Map<String, Long> map = ListOfEmployee.getListOfEmployee().stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		
		System.out.println(map);
	}
}
