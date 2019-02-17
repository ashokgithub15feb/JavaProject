package com.durga.program.javabrahman.java8.stream;

import java.util.function.Predicate;

public class AllMatched implements Predicate<Employee> {

	@Override
	public boolean test(Employee emp) {
		return emp.getAge() > 20;
	}

}
