package com.interviews.java8.realtime;

import java.util.Map;
import java.util.stream.Collectors;

//Query 3.1 : How many male and female employees are there in the organization?


public class MaleAndFemaleEmployees {

	public static void main(String[] args) {

		Map<String, Long> map = ListOfEmployee.getListOfEmployee().stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
		System.out.println(map);
	}
}
