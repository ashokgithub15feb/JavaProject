package com.interviews.java8.realtime;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RevisionJava8Problems {

	public static void main(String[] args) {

		List<Employee> employees = ListOfEmployee.getListOfEmployee();

		employees.stream().filter(e -> e.getDepartment().equals("HR")).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("======");

		double asDouble = employees.stream().filter(e -> e.getDepartment().equals("HR")).peek(System.out::println)
				.mapToDouble(Employee::getSalary).average().orElse(0.0);
		System.out.println(asDouble);

		System.out.println("======");

		double doubleValue = employees.stream().filter(e -> e.getDepartment().equals("HR")).peek(System.out::println)
				.collect(Collectors.averagingDouble(Employee::getSalary)).doubleValue();
		System.out.println(doubleValue);

		System.out.println("===1===");

		employees.stream().filter(e -> e.getDepartment().equals("Product Development") && e.getSalary() > 6000)
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).peek(System.out::println).limit(3)
				.collect(Collectors.toList());
		System.out.println("===2===");
		employees.stream().filter(e -> e.getDepartment().equals("Product Development") && e.getSalary() > 6000)
				.sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary())).peek(System.out::println).limit(3)
				.collect(Collectors.toList());
		System.out.println("===3===");
		employees.stream().sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary())).limit(3)
				.filter(e -> e.getDepartment().equals("Product Development") && e.getSalary() > 6000)
				.peek(System.out::println).collect(Collectors.toList());
		System.out.println("===4===");

		employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.mapping(Employee::getName, Collectors.toList())))
				.entrySet().forEach(System.out::println);

		System.out.println("===5===");
		double totalEmployeeSalary = employees.stream().filter(e -> e.getDepartment().equals("Product Development"))
				.mapToDouble(Employee::getSalary).sum();
		System.out.println(totalEmployeeSalary);

		System.out.println("===6===");
		double salary = employees.stream().filter(e -> e.getDepartment().equals("Product Development"))
				.max(Comparator.comparingDouble(Employee::getSalary)).get().getSalary();
		System.out.println(salary);
		System.out.println("===7===");
		int[] arr = { 1, 2, 3, 2, 1, 4, 5, 6, 6, 7, 8, 9, 9 }; // find all duplicate element

		List<Integer> collect = Stream.of(1, 2, 3, 2, 1, 4, 5, 6, 6, 7, 8, 9, 9)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).map(d -> d.getKey()).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> collect6 = IntStream.of(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(entry -> entry.getValue() > 1).map(key -> key.getKey()).collect(Collectors.toList());
		
		System.out.println(collect6);
		
		
		
		
		System.out.println("======8=====");
		List<Integer> collect2 = Arrays.stream(arr).mapToObj(m -> m)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).map(d -> d.getKey()).collect(Collectors.toList());
		System.out.println(collect2);

		System.out.println("======9=====");

		Map<String, Stream<Employee>> collect3 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, 
				Collectors.collectingAndThen(
				Collectors.toList(), 
				list -> list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)))));
		
		collect3.entrySet().stream().forEach(f -> {
			System.out.println(f.getKey()+"="+f.getValue());
		});
		
		System.out.println("======10=====");

		Map<String, Employee> collect4 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, 
				Collectors.collectingAndThen(
				Collectors.toList(), 
				list -> list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(1).findFirst().get())));
		
		collect4.entrySet().stream().forEach(f -> {
			System.out.println(f.getKey()+"="+f.getValue().getName()+"="+f.getValue().getSalary());
		});
		
		System.out.println("======11=====");

		Map<String, Employee> collect5 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, 
				Collectors.collectingAndThen(
				Collectors.toList(), 
				list -> list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(0).findFirst().get())));
		
		collect5.entrySet().stream().forEach(f -> {
			System.out.println(f.getKey()+"="+f.getValue().getName()+"="+f.getValue().getSalary());
		});
	}
}
