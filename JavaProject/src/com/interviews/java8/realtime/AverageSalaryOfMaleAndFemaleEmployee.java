package com.interviews.java8.realtime;

import java.util.Map;
import java.util.stream.Collectors;

//Query 3.11 : What is the average salary of male and female employees?

public class AverageSalaryOfMaleAndFemaleEmployee {

	public static void main(String[] args) {

		Map<String, Double> map = ListOfEmployee.getListOfEmployee().stream()
				.collect(Collectors.groupingBy(Employee::getGender, 
						Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(map);
	}
}
