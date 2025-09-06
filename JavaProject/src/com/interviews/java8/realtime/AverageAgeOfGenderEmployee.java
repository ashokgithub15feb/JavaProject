package com.interviews.java8.realtime;

import java.util.Map;
import java.util.stream.Collectors;

//Query 3.3 : What is the average age of male and female employees?

public class AverageAgeOfGenderEmployee {

	public static void main(String[] args) {

		Map<String, Double> map = ListOfEmployee.getListOfEmployee().stream()
				.collect(Collectors.groupingBy(Employee::getGender, 
						Collectors.averagingInt(Employee::getAge)));
		
		System.out.println(map);
	}
}
