package com.durga.program.javabrahman.java8.stream;

import java.util.function.Predicate;

public class FilteredData implements Predicate<Employee> {

	@Override
	public boolean test(Employee emp) {

		return emp.getAge() > 24;
	}

}
