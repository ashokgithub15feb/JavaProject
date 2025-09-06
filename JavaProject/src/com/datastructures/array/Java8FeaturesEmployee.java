package com.datastructures.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8FeaturesEmployee {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		List<Employee> employees = EmployeeUtils.getEmployees();
		System.out.println("=How many male and female employees are there in the organization?=");
		employees.stream()
				 .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
				 .entrySet()
				 .forEach(f -> forEachMapOfLongData(f));
		
		System.out.println("=Print the name of all departments in the organization?=");
		
		employees.stream()
				 .map(Employee::getDepartment)
				 .distinct()
				 .forEach(System.out::println);
		
		System.out.println("=What is the average age of male and female employees?=");
		
		employees.stream()
				 .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)))
				 .entrySet()
				 .forEach(f -> forEachMapOfDoubleData(f));
		
		System.out.println("=Get the details of highest paid employee in the organization?=");
		Employee e = employees.stream()
							  .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))
				              .get();
		System.out.println("Employee Name = " + e.getName() + "\nSalary = " + e.getSalary());
		
		System.out.println("=Get the names of all employees who have joined after 2015?=");
		
		employees.stream()
		         .filter(f -> f.getYearOfJoining() > 2015)
		         .map(Employee::getName)
				 .forEach(f -> getEmployeesName(f));
		
		System.out.println("=Count the number of employees in each department?=");
		employees.stream()
		         .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
		         .entrySet()
				 .stream()
				 .forEach(f -> forEachMapOfLongData(f));
		
		System.out.println("=What is the average salary of each department?=");
		employees.stream()
				 .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
				 .entrySet()
				 .stream()
				 .forEach(f -> forEachMapOfDoubleData(f));
		
		System.out.println("=What is the average age of each department?=");
		employees.stream()
				 .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getAge)))
				 .entrySet()
				 .stream()
				 .forEach(f -> forEachMapOfDoubleData(f));
		
		System.out.println("Get the details of youngest male employee in the product development department?");
		Employee e1 = employees.stream()
							   .filter(f -> f.getGender().equals("Male") && e.getDepartment().equals("Product Development"))
				               .collect(Collectors.minBy(Comparator.comparing(Employee::getAge)))
				               .get();
		System.out.println("Employee Name = " + e1.getName() + "\nEmploye Age = " + e1.getAge()
				+ "\nEmployee Department: " + e1.getDepartment());
		
		System.out.println();
		
		Employee e2 = employees.stream()
				 			   .filter(f -> f.getGender().equals("Male") && e.getDepartment().equals("Product Development"))
				 			   .min(Comparator.comparingInt(Employee::getAge))
				 			   .get();
		System.out.println("Employee Name = " + e2.getName() + "\nEmploye Age = " + e2.getAge()
				+ "\nEmployee Department: " + e2.getDepartment());
		
		System.out.println("=Who has the most working experience in the organization?=");
		Employee e3 = employees.stream()
							   .min(Comparator.comparing(Employee::getYearOfJoining))
							   .get();
		System.out.println("Employee Name = " + e3.getName() + "\nEmploye Age = " + e3.getAge()
				+ "\nEmployee Department: " + e3.getDepartment() + "\nEmployee Salary = " + e3.getSalary()
				+ "\nEmployee Joining date = " + e3.getYearOfJoining() + "\nEmployee Age = " + e3.getAge());
		
		System.out.println("==Who has the less working experience in the organization?==");
		Employee e4 = employees.stream()
							   .max(Comparator.comparing(Employee::getYearOfJoining))
							   .get();
		System.out.println("Employee Name = " + e4.getName() + "\nEmploye Age = " + e4.getAge()
				+ "\nEmployee Department: " + e4.getDepartment() + "\nEmployee Salary = " + e4.getSalary()
				+ "\nEmployee Joining date = " + e4.getYearOfJoining() + "\nEmployee Age = " + e4.getAge());
		
		System.out.println("=How many male and female employees are there in the sales and marketing team?=");
		employees.stream()
				 .filter(f -> f.getDepartment().equals("Sales And Marketing"))
				 .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
				 .entrySet()
				 .stream()
				 .forEach(f -> forEachMapOfLongData(f));
		
		System.out.println("=What is the average salary of male and female employees?=");
		employees.stream()
				 .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
				 .entrySet()
				 .stream()
				 .forEach(f -> forEachMapOfDoubleData(f));
		
		System.out.println("=List down the names of all employees in each department?=");
		employees.stream()
				 .collect(Collectors.groupingBy(Employee::getDepartment))
				 .entrySet()
				 .stream()
				 .forEach(f -> forEachStringListOfEmployee(f));
		
		System.out.println("= What is the average salary and total salary of the whole organization?=");
		DoubleSummaryStatistics statistics = 
				employees.stream()
						 .collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Employee Average Salary = " + statistics.getAverage());
		System.out.println("Employee Total Salary = " + statistics.getSum());
		
		System.out.println("=Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.=");
		employees.stream()
		         .collect(Collectors.partitioningBy(emp -> emp.getAge() > 25))
		         .entrySet()
		         .stream()
				 .forEach(f -> forEachBooleanListOfEmployee(f));
		
		System.out.println("=Who is the oldest employee in the organization? What is his age and which department he belongs to?=");
		Employee e5 = employees.stream()
							   .max(Comparator.comparingInt(Employee::getAge))
							   .get();
		System.out.println("Employee Name = " + e5.getName() + "\nEmployee Age = " + e5.getAge()
				+ "\nEmployee Department = " + e5.getDepartment());
		
		System.out.println("=2nd Max Salary of Employee?=");
		double salary2 = employees.stream()
							      .sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary)))
							      .skip(1)
							      .findFirst()
							      .get()
							      .getSalary();
		System.out.println("2nd Max Employee Salary = " + salary2);
		
		employees.stream().sorted(Collections.reverseOrder(Comparator.comparingDouble(Employee::getSalary))).forEach(System.out::println);
		
		System.out.println("=2nd Salary of Employee?=");
		double salary22 = employees.stream()
							      .sorted(Comparator.comparing(Employee::getSalary))
							      .skip(3)
							      .findFirst()
							      .get()
							      .getSalary();
		System.out.println("2nd Max Employee Salary salary22 = " + salary22);
		
		System.out.println("=Sort the Employee with multipal fields - Age, Salary and Name?=");
		Collections.sort(employees, Comparator.comparing(Employee::getAge)
											  .thenComparing(Employee::getSalary)
											  .thenComparing(Employee::getName));

		for (Employee emp : employees) {
			System.out.println("Id = " + emp.getId() + ", Name = " + emp.getName() + ", Age = " + emp.getAge()
					+ ", Salary = " + emp.getSalary());
		}
		
		
		System.out.println("=Sort the Employee with multipal fields - Name, Salary and Age?=");
		// prefer this one
		Comparator<Employee> comparingObject = Comparator.comparing(Employee::getName)
														 .thenComparing(Employee::getSalary)
														 .thenComparing(Employee::getAge);
		employees.stream().sorted(comparingObject).forEach(emp -> System.out.println("Id = " + emp.getId() + ", Name = "
				+ emp.getName() + ", Age = " + emp.getAge() + ", Salary = " + emp.getSalary()));
		
		System.out.println("=Sort the Employee with multipal fields - Name, Salary and Age?=");

		Comparator<Employee> comparingObject2 = (emp1, emp2) -> emp1.getName()
															  .compareTo(emp2.getName());
		employees.stream()
				 .sorted(comparingObject2)
				 .forEach(emp -> System.out.println("Id = " + emp.getId()
				+ ", Name = " + emp.getName() + ", Age = " + emp.getAge() + ", Salary = " + emp.getSalary()));
		
		System.out.println("=Find the 4th Heights Employee Name?=");

		String empName = employees.stream()
								  .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
								  .skip(3)
								  .findFirst()
								  .get()
								  .getName();
		System.out.println("Second Heights Name: " + empName);
		
		System.out.println("=Sort he Employee by name get the first employee?=");
		String name = employees.parallelStream()
							   .sorted((o1, o2) -> o1.getName()
				               .compareTo(o2.getName()))
							   .findFirst()
							   .get()
							   .getName();
		System.out.println(name);
		
		System.out.println("=Sort the employee by salary?=");

		System.out.println(employees);

		List<Employee> collect = employees.stream()
									      .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
									      .collect(Collectors.toList());
		System.out.println(collect);

		System.out.println("=sort in employee in desc?=");
		List<Employee> collect1 = employees.stream()
				.sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary)))
				.collect(Collectors.toList());
		System.out.println(collect1);
		
		System.out.println("=top 3 salary?=");
		List<Employee> collect2 = employees.stream()
											.sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary)))
											.limit(3)
											.collect(Collectors.toList());
		System.out.println(collect2);
		
		System.out.println("=having less the 3rd max salary?=");
		List<Employee> collect3 = employees.stream()
										   .sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary)))
										   .skip(3)
										   .collect(Collectors.toList());
		System.out.println(collect3);
		

		System.out.println("=having less the 3rd max salary?=");
		Employee collect33 = employees.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary)))
				.skip(3).findFirst().get();
		System.out.println(collect33);
		
		
		System.out.println("=Max Salay of Employee=");
		double salary = employees.stream()
								 .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
								 .get()
								 .getSalary();
		System.out.println(salary);
		
		System.out.println("=Sum of the given number in array?=");
		int[] arr = { 2, 3, 4, 5, 7 };
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);

		System.out.println("=Get all the employee from each department?=");
		Map<String, List<String>> collect4 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println(collect4);

		System.out.println("=Check the HashMap Colision?=");

		Employee ee1 = new Employee(111, "Jiya Brein");
		Employee ee2 = new Employee(222, "Jiya Brein");

		Map<Employee, Integer> m = new HashMap<>();
		m.put(ee1, 1);
		m.put(ee2, 2);

		System.out.println(m);
		
		ee1.setId(555);

		Integer integer = m.get(ee1); // null
		System.out.println(integer);

		System.out.println("=2nd max salary of employee in each department?=");
		
		Map<String, List<Employee>> emp2 = employees.stream()
									   .collect(Collectors.groupingBy(Employee::getDepartment));
		
		for(Map.Entry<String, List<Employee>> entry : emp2.entrySet()) {
			List<Employee> value = entry.getValue();
			double salary3 = value.stream()
							   	  .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
								  .skip(1)
								  .findFirst()
								  .get()
								  .getSalary();
			System.out.println("Key = "+entry.getKey()+", Value = "+salary3);
		}
		
		
		//employees.stream()
			//	   .collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().stream().map(Map.Entry::getValue).sorted().skip(0).findFirst().get();

//		for(Map.Entry<String, List<Employee>> entry : emp2.entrySet()) {
//			List<Employee> value = entry.getValue();
//			double salary3 = value.stream()
//		   	  .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
//			  .skip(1)
//			  .findFirst()
//			  .get()
//			  .getSalary();
//			System.out.println("Key = "+entry.getKey()+", Value = "+salary3);
//		}
		
		System.out.println("lllllllllllllllllllllll");
		
		Map<String, Employee> collect5 = employees.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));
		System.out.println(collect5);
		System.out.println(collect5.size());
		collect5.entrySet().stream().forEach(f -> System.out.println(f.getKey()+": "+f.getValue()));
	}

	private static void forEachBooleanListOfEmployee(Entry<Boolean, List<Employee>> f) {

		if (f.getKey()) {
			System.out.println("Employees younger than or equal to 25 years: " + f.getKey());
		} else {
			System.out.println("Employees older than 25 years: " + f.getKey());
		}
		f.getValue().stream().forEach(f1 -> forEachEmployee(f1));
	}

	private static void forEachStringListOfEmployee(Entry<String, List<Employee>> f) {

		System.out.println("Employee In = " + f.getKey());

		f.getValue().stream().forEach(f1 -> forEachEmployee(f1));
	}

	private static void forEachEmployee(Employee f1) {
		System.out.println(f1.getName());
	}

	private static void getEmployeesName(String f) {
		System.out.println(f);
	}

	public static void forEachMapOfLongData(Entry<String, Long> f) {
		System.out.println(f.getKey() + " = " + f.getValue());
	}

	public static void forEachMapOfDoubleData(Entry<String, Double> f) {
		System.out.println(f.getKey() + " = " + f.getValue());
	}
}
