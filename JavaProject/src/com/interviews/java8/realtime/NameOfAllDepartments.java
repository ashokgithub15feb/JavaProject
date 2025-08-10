package com.interviews.java8.realtime;

import java.util.List;
import java.util.stream.Collectors;

//Query 3.2 : Print the name of all departments in the organization?


public class NameOfAllDepartments {

	public static void main(String[] args) {
		
		List<String> map = ListOfEmployee.getListOfEmployee().stream()
				.map(Employee::getDepartment).distinct().collect(Collectors.toList());
			
		System.out.println(map);
	}
}
