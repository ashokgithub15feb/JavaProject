package com.durga.program.javabrahman.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BasicCollector {

	private  static List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45),
		      new Employee("Harry Major", 25),
		      new Employee("Ethan Hardy", 65),
		      new Employee("Nancy Smith", 22),
		      new Employee("Deborah Sprightly", 29));
	public static void main(String[] args) {
		
		Map<Boolean, List<Employee>> collect = employeeList.stream().collect(Collectors.partitioningBy(emp -> emp.getAge() > 30));
		
		System.out.println("Employee partitioning bashed on the age"+collect);
		
		collect.forEach((key, listEmp) -> System.out.println(key+":"+listEmp));
		
		System.out.println();
		System.out.println();
		
		Map<Boolean, List<Employee>> partitionMap = employeeList.stream().collect(Collectors.partitioningBy(emp -> emp.getAge() > 30));
		
		System.out.println("Employee partitioning bashed on the age");
		
		partitionMap.forEach(new PartitioningMap());
	}
}

/**
Employee partitioning bashed on the age
false:[Employee [name=Harry Major, age=25, salry=0.0], 
	   Employee [name=Nancy Smith, age=22, salry=0.0], 
	   Employee [name=Deborah Sprightly, age=29, salry=0.0]]
true:[Employee [name=Tom Jones, age=45, salry=0.0], 
      Employee [name=Ethan Hardy, age=65, salry=0.0]]


Employee partitioning bashed on the age
false::[Employee [name=Harry Major, age=25, salry=0.0], 
		Employee [name=Nancy Smith, age=22, salry=0.0], 
		Employee [name=Deborah Sprightly, age=29, salry=0.0]]
true::[Employee [name=Tom Jones, age=45, salry=0.0], 
	   Employee [name=Ethan Hardy, age=65, salry=0.0]]
	   
	   
	   

*/