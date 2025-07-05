package com.interviews.java8.realtime;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Query 3.8 : Get the details of youngest male employee in the product development department?

public class YoungestMaleEmployee {

	public static void main(String[] args) {
		Employee emp = ListOfEmployee.getListOfEmployee().stream()
				.filter(f -> f.getGender().equals("Male") && f.getDepartment().equals("Product Development"))
				.min(Comparator.comparingInt(Employee::getAge)).get();

		System.out.println(emp);
	}
}
