package com.durga.program.javabrahman.java8.stream;

import java.util.List;
import java.util.function.BiConsumer;

public class PartitioningMap implements BiConsumer<Boolean, List<Employee>> {

	@Override
	public void accept(Boolean key, List<Employee> value) {

		System.out.println(key+"::"+value);
	}

}
