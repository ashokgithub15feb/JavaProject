package com.interviews.java8.realtime;

import java.util.Map;
import java.util.stream.Collectors;

//Query 3.10 : How many male and female employees are there in the sales and marketing team?

public class MaleAndFemaleEmployeesInSales {

	public static void main(String[] args) {

		Map<String, Long> map = ListOfEmployee.getListOfEmployee().stream()
				.filter(f -> f.getDepartment().equals("Sales And Marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
		System.out.println(map);
	}
}
