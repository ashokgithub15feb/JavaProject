package com.program.coding.oracle;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Ashok");
		Employee e2 = new Employee("Ashok");
//		Employee e3 = new Employee("Rahit");
//		Employee e4 = new Employee("Ravi");
//		Employee e5 = new Employee("Ranveer");
		
		HashMap<Employee, Integer> map = new HashMap<>();
		map.put(e1, 1);
		map.put(e2, 2);
//		map.put(e3, 3);
//		map.put(e4, 4);
//		map.put(e5, 5);
		
		System.out.println(map.size());
		// Time Complexity - O(n)
		
	}
}
