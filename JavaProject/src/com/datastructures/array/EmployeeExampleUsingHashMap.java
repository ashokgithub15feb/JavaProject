package com.datastructures.array;

import java.util.HashMap;

public class EmployeeExampleUsingHashMap {

	public static void main(String[] args) {
		
		HashMap<Employee, Employee> map = new HashMap<Employee, Employee>();
		
		Employee e1 = new Employee(111, "Jiya Brein", 	32, "Female", 	"HR", 						2011, 	25000.0);
		Employee e2 = new Employee(122, "Paul Niksui", 	25, "Male", 	"Sales And Marketing", 		2015, 	13500.0);
		Employee e3 = new Employee(133, "Martin Theron", 29, "Male", 	"Infrastructure", 			2012, 	18000.0);
		Employee e4 = new Employee(144, "Murali Gowda", 	28, "Male", 	"Product Development", 		2014, 	32500.0);
		Employee e5 = new Employee(144, "Murali Gowda", 	28, "Male", 	"Product Development", 		2014, 	32500.0);

		map.put(e1, e1);
		map.put(e2, e2);
		map.put(e3, e3);
		map.put(e4, e4);
		map.put(e5, e5);
		
		System.out.println(map.size());
		System.out.println(map.entrySet().size());
	}
}
