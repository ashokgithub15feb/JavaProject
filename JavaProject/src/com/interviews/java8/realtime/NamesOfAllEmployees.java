package com.interviews.java8.realtime;

import java.util.List;
import java.util.stream.Collectors;

//Query 3.5 : Get the names of all employees who have joined after 2015?

public class NamesOfAllEmployees {

	public static void main(String[] args) {

		List<String> list = ListOfEmployee.getListOfEmployee().stream()
				.filter(f -> f.getYearOfJoining() > 2015).map(e -> e.getName())
				.collect(Collectors.toList());
		
		System.out.println(list);
	}
}
