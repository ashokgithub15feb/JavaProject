package com.interviews.java8.realtime;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Query 3.8 : Get the details of youngest male employee in the product development department?

public class YoungestMaleEmployee {

	public static void main(String[] args) {
		Employee emp = ListOfEmployee.getListOfEmployee().stream()
				.filter(f -> f.getGender().equals("Male") && f.getDepartment().equals("Product Development"))
				.min(Comparator.comparingInt(Employee::getAge)).get();

		System.out.println(emp);
		
		IntStream.of(1, 2, 2, 3, 4, 5, 6,5);
		
		List<Integer> collect = Arrays.asList(1, 2, 2, 3, 4, 5, 6,5).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(f -> f.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
