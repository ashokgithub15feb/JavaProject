package com.durga.program.javabrahman.java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GroupingWithCollectors {

	private static List<Employee> employeeList = 
			Arrays.asList(new Employee("Tom Jones", 45, 12000.00, Department.MARKETING),
					      new Employee("Harry Major", 26, 20000.00, Department.LEGAL),
					      new Employee("Ethan Hardy", 65, 30000.00, Department.LEGAL),
					      new Employee("Nancy Smith", 22, 15000.00, Department.MARKETING),
					      new Employee("Catherine Jones", 21, 18000.00, Department.HR),
					      new Employee("James Elliot", 58, 24000.00, Department.OPERATIONS),
					      new Employee("Frank Anthony", 55, 32000.00, Department.MARKETING),
					      new Employee("Michael Reeves", 40, 45000.00, Department.OPERATIONS),
					      new Employee("Ashok", 40, 45000.00, Department.OPERATIONS),
					      new Employee("Ashok", 40, 45000.00, Department.OPERATIONS));
	
	public static void main(String[] args) {
		
		Map<Department, List<Employee>> employeeMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		System.out.println("Employee Grouped by department");
		
		employeeMap.forEach((Department key, List<Employee> empList) -> System.out.println(key+"\t:"+empList));
		
		System.out.println("================================================================");
		
		Map<Department, Set<Employee>> empMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toSet()));
		
		System.out.println("Employee Grouped by department");
		
		empMap.forEach((key, setEmpl) -> System.out.println(key+"\t::"+setEmpl)) ;
		
		System.out.println("================================================================");
		
		
		TreeMap<Department,Set<Employee>> treeMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new, Collectors.toSet()));
		System.out.println("Employee Grouped by department");
		
		treeMap.forEach((dept, setEmpl) -> System.out.println(dept+"\t::"+setEmpl));
	}
}
