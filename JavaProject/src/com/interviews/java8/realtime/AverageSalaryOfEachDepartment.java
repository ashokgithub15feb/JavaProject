package com.interviews.java8.realtime;

import java.util.Map;
import java.util.stream.Collectors;

//Query 3.7 : What is the average salary of each department?

public class AverageSalaryOfEachDepartment {

	public static void main(String[] args) {

		Map<String, Double> map = ListOfEmployee.getListOfEmployee().stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(map);
	}
}
