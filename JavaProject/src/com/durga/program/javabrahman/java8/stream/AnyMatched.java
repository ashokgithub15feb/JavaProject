package com.durga.program.javabrahman.java8.stream;

import java.util.function.Predicate;

public class AnyMatched implements Predicate<Employee> {

	@Override
	public boolean test(Employee t) {
		return t.getAge()>30;
	}

}
