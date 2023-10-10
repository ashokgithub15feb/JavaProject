package com.leetcode.patterns.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EmployeeManagementSystemUsingJava8 {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		maleAndFemaleEmployeesInOrganization(employeeList);
		getNameOfAllDepartmentsInOrganization(employeeList);
		averageAgeOfMaleAndFemaleEmployees(employeeList);
		averageAgeOfMaleAndFemaleEmployeesInEachDept(employeeList);
		getDetailsOfHighestPaidEmployeeInOrganization(employeeList);
		getDetailsOfLowestPaidEmployeeInOrganization(employeeList);
		getNamesOfAllEmployeesWhoHaveJoinedAfter2015(employeeList);
		countTheNumberOfEmployeesInEachDepartment(employeeList);
		averageSalaryOfEachDepartment(employeeList);
		getTheDetailsOfYoungestMaleEmployeeInProductDevelopmentDepartment(employeeList);
		getTheDetailsOfYoungestFemaleEmployeeInProductDevelopmentDepartment(employeeList);
		getTheDetailsOfYoungestFemaleEmployeeInEachDepartment(employeeList);
		getTheDetailsOfYoungestMaleEmployeeInEachDepartment(employeeList);
		getTheDetailsOfYoungestMaleAndFemaleEmployeeInEachDepartment(employeeList);
		whohasMostWorkingExperienceInOrganization(employeeList);
		whohasLessWorkingExperienceInOrganization(employeeList);
		whohasLessWorkingExperienceInEachDepartment(employeeList);
		howManyMaleAndFemaleEmployeesInSalesAndMarketingTeam(employeeList);
		averageSalaryOfMaleAndFemaleEmployees(employeeList);
		listDownTheNamesOfAllEmployeesInEachDepartment(employeeList);
		listDownTheNumberOfAllEmployeesInEachDepartment(employeeList);
		averageSalaryAndTotalSalaryOfTheWholeOrganization(employeeList);
		separateTheEmployeesWhoAreYoungerOrEqualTo25YearsFromThoseEmployeesWhoAreOlderThan25Years(employeeList);
		whoIsTheOldestEmployeeInOrganization(employeeList);
		averageSalaryOfMaleAndFemaleEmployeesInEachDepartment(employeeList);
		countOfMaleAndFemaleEmployeesInEachDepartment(employeeList);
		
		System.out.println("====================================");
		
		removedDuplicateElementFromList();
		seprateOddAndEven();
		frequencyOfEachCharacterInString();
		joinListOfStringWithPrefixAndSuffixAndDelimiter();
		sortTheListInReverseOrder();
		printMuliplesOf5FromTheList();
		minAndMaxFromList();
		mergerTwoUnsortedArrayInSingleSorted();
		anagramProgram();
		mergerTwoUnsortedArrayInSingleSortedWithoutDuplicate();
		sumOfAllDigitOfANumber();
		thirdMaxAndMinNumberFromList();
		sortTheListOfStringInLengthWise();
		commonElementInTwoArray();
		reverseOfEachWord();
		sumOfNaturalNumber();
		reverseAnIntegerArray();
		palindromProgram();
		findTheDuplidateElementInArray();
		fibonacciSeries();
	}

	private static void fibonacciSeries() {
		System.out.println("Fibonacci Series");
		Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]}).limit(10).map(f -> f[0]).forEach(i -> System.out.print(i+" "));;
	}

	private static void findTheDuplidateElementInArray() {
		List<Integer> l1 = Arrays.asList(2, 23, 13, 56, 57, 50, 2);
		System.out.println("Input: "+l1);
		Set<Integer> set = new HashSet<>();
		Set<Integer> collect = l1.stream().filter(i -> !set.add(i)).collect(Collectors.toSet());
		System.out.println("Output: "+ collect);
	}

	private static void palindromProgram() {
		String str = "baab";
		System.out.println("Input: "+str);
		boolean noneMatch = IntStream.range(0, str.length()/2).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
		System.out.println("Output: "+noneMatch);
	}

	private static void reverseAnIntegerArray() {
		int[] listOfInteger1 = {2, 23, 13, 56, 57, 50};
		System.out.println("Input: "+Arrays.toString(listOfInteger1));
		int[] array = IntStream.rangeClosed(1, listOfInteger1.length).map(i -> listOfInteger1[listOfInteger1.length - i]).toArray();
		System.out.println("Output: "+Arrays.toString(array));
	}

	private static void sumOfNaturalNumber() {
		int sum = IntStream.range(1, 10).sum();
		System.out.println("Output: sumOfNaturalNumber: "+sum);
	}

	private static void reverseOfEachWord() {
		String str = "Suffix And Delimiter";
		List<String> list = Arrays.asList(str.split(" "));
		System.out.println("\nInput: "+list);
		String collect = list.stream().map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
		System.out.println(collect);
		
	}

	private static void commonElementInTwoArray() {
		List<Integer> l1 = Arrays.asList(2, 23, 13, 56, 57, 50, 2);
		List<Integer> l2 = Arrays.asList(1, 3, 4, 6, 5, 7, 9, 12, 3, 2, 57);
		System.out.println("Input: listOfInteger1: "+l1+", listOfInteger2"+l2);
		
		l1.stream().filter(l2::contains).forEach(f -> System.out.print(f+" "));
	}

	private static void sortTheListOfStringInLengthWise() {
		List<String> listOfString = Arrays.asList("a", "aa", "aaa", "aaa", "aaaa", "aaa", "aa", "a");
		System.out.println("Input: sortTheListOfStringInLengthWise: "+listOfString);
		listOfString.stream().sorted(Comparator.comparing(String::length)).forEach(f -> System.out.print(f+" "));
	}

	private static void thirdMaxAndMinNumberFromList() {
		List<Integer> listOfInteger = Arrays.asList(1, 3, 4, 6, 5, 7, 9, 12, 23, 2, 23, 13, 56, 57, 57, 50);
		System.out.println("Inpit: thirdMaxAndMinNumberFromList: "+listOfInteger);
		Optional<Integer> findFirst = listOfInteger.stream().distinct().sorted().skip(2).limit(3).findFirst();
		Optional<Integer> findFirst2 = listOfInteger.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).limit(3).findFirst();
		Integer integer = listOfInteger.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).findFirst().get();
		System.out.println("Output: 3rd: Min:"+findFirst.get()+", 3rd: Max: "+findFirst2.get()+", SecondLargest: "+integer);
	}

	private static void sumOfAllDigitOfANumber() {
		String strNumber = "123456789";
		System.out.println("Input: "+strNumber);
		IntSummaryStatistics collectInt = Stream.of(String.valueOf(strNumber).split("")).collect(Collectors.summarizingInt(Integer::parseInt));
		DoubleSummaryStatistics collectDouble = Stream.of(String.valueOf(strNumber).split("")).collect(Collectors.summarizingDouble(Double::parseDouble));
		System.out.println("Output: "+collectInt);
		System.out.println("Output: "+collectDouble);
		
	}

	private static void mergerTwoUnsortedArrayInSingleSortedWithoutDuplicate() {
		int[] listOfInteger1 = {2, 23, 13, 56, 57, 50, 2};
		int[] listOfInteger2 = {1, 3, 4, 6, 5, 7, 9, 12, 3};
		System.out.println("Input: listOfInteger1: "+Arrays.toString(listOfInteger1)+", listOfInteger2"+Arrays.toString(listOfInteger2));
		int[] array = IntStream.concat(Arrays.stream(listOfInteger1), Arrays.stream(listOfInteger2)).distinct().sorted().toArray();
		System.out.println("Output: "+Arrays.toString(array));
	}

	private static void anagramProgram() {
		String s1 = "Medical";
		String s2 = "Decimal";
		System.out.println("Input: check String are Anagram: s1: "+s1+", s2: "+s2);
		s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		System.out.println("Output: String are Anagram: "+s1.equals(s2));
	}

	private static void mergerTwoUnsortedArrayInSingleSorted() {
		System.out.println();
		int[] listOfInteger1 = {2, 23, 13, 56, 57, 50, 2};
		int[] listOfInteger2 = {1, 3, 4, 6, 5, 7, 9, 12, 3};
		System.out.println("Input: listOfInteger1: "+Arrays.toString(listOfInteger1)+", listOfInteger2"+Arrays.toString(listOfInteger2));
		int[] array = IntStream.concat(Arrays.stream(listOfInteger1), Arrays.stream(listOfInteger2)).sorted().toArray();
		System.out.println("Output: "+Arrays.toString(array));
	}

	private static void minAndMaxFromList() {
		List<Integer> listOfInteger = Arrays.asList(1, 3, 2, 4, 6, 5, 7, 9, 12, 23, 2, 23, 13, 56, 57, 57, 50);
		System.out.println("\nInput: minAndMaxFromList: "+listOfInteger);
		Integer min = listOfInteger.stream().min(Comparator.naturalOrder()).get();
		Integer max = listOfInteger.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Output: Min: "+min+", Max: "+max);
	}

	private static void printMuliplesOf5FromTheList() {
		List<Integer> listOfInteger = Arrays.asList(1, 3, 2, 4, 6, 5, 7, 9, 12, 23, 2, 23, 13, 56, 57, 57, 50);
		System.out.println("\nInput: printMuliplesOf5FromTheList: "+listOfInteger);
		listOfInteger.stream().filter(f ->  f % 5 == 0).forEach(f -> System.out.print(f+" "));
	}

	private static void sortTheListInReverseOrder() {
		List<Integer> listOfInteger = Arrays.asList(1, 3, 2, 4, 6, 5, 7, 9, 12, 23, 2, 23, 13, 56, 57, 57);
		System.out.println("Input: sortTheListInReverseOrder: "+listOfInteger);
		listOfInteger.stream().sorted(Comparator.reverseOrder()).forEach(f -> System.out.print(f+" "));;
		
	}

	private static void joinListOfStringWithPrefixAndSuffixAndDelimiter() {
		List<String> listOfString = Arrays.asList("John");
		System.out.println("Input: joinListOfStringWithPrefixAndSuffixAndDelimiter: "+listOfString);
		String collect = listOfString.stream().collect(Collectors.joining("Delimiter", "Msr ", " Kata"));
		System.out.println("Output: "+collect);
	}

	private static void removedDuplicateElementFromList() {
		List<Integer> listOfInteger = Arrays.asList(1, 3, 2, 4, 6, 5, 7, 9, 12, 23, 2, 23, 13, 56, 57, 57);
		System.out.println("Input: Removed the duplicate: "+listOfInteger);
		List<Integer> collect = listOfInteger.stream().distinct().collect(Collectors.toList());
		System.out.println("Output: "+collect);
	}

	private static void seprateOddAndEven() {
		List<Integer> listOfInteger = Arrays.asList(1, 3, 2, 4, 6, 5, 7, 9, 12, 23, 13, 56, 57);
		System.out.println("Input: seprateOddAndEven: "+listOfInteger);
		Map<Boolean, List<Integer>> collect = listOfInteger.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
		System.out.println("Output: "+collect);
	}

	private static void frequencyOfEachCharacterInString() {
		String str = "frequencyOfEachCharacterInString";
		System.out.println("Input: "+str);
		Map<Character, Long> collect = str.chars().filter(f -> f != ' ').mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
	}

	private static void countOfMaleAndFemaleEmployeesInEachDepartment(List<Employee> employeeList) {
		Map<String, Map<String, Long>> collect = employeeList.stream().collect(Collectors.groupingBy(
				Employee::getDepartment, Collectors.groupingBy(Employee::getGender, Collectors.counting())));
		System.out.println("count Of Male And Female Employees In Each Department");
		System.out.println(collect);
		System.out.println(
				"=======================================================================================================");
	}

	private static void averageSalaryOfMaleAndFemaleEmployeesInEachDepartment(List<Employee> employeeList) {
		Map<String, Map<String, Double>> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary))));
		System.out.println("Average Salary Of Male And Female Employees In Each Department");
		System.out.println(collect);
		System.out.println(
				"=======================================================================================================");
	}

	private static void whoIsTheOldestEmployeeInOrganization(List<Employee> employeeList) {
		Optional<Employee> max = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
		System.out.println(
				"Who is the oldest employee in the organization? What is his age and which department he belongs to?");
		System.out.println(max);
		System.out.println(
				"=======================================================================================================");
	}

	private static void separateTheEmployeesWhoAreYoungerOrEqualTo25YearsFromThoseEmployeesWhoAreOlderThan25Years(
			List<Employee> employeeList) {
		Map<Boolean, List<Employee>> collect = employeeList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));

		System.out.println(
				"Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");
		System.out.println(collect);
		System.out.println(
				"=======================================================================================================");
	}

	private static void averageSalaryAndTotalSalaryOfTheWholeOrganization(List<Employee> employeeList) {
		DoubleSummaryStatistics collect = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("What is the average salary and total salary of the whole organization?");
		System.out.println(collect);
		System.out.println(
				"=======================================================================================================");
	}

	private static void listDownTheNumberOfAllEmployeesInEachDepartment(List<Employee> employeeList) {
		Map<String, Long> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		System.out.println("List down the Number of all employees in each department?");
		System.out.println(collect);
		System.out.println(
				"=======================================================================================================");
	}

	private static void listDownTheNamesOfAllEmployeesInEachDepartment(List<Employee> employeeList) {
		Map<String, List<Employee>> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
//		employeeList.stream()
//		.collect(Collectors.groupingBy(Employee::getDepartment))
//		.entrySet().stream().forEach(e -> e.getValue().stream().forEach(e1 -> e1.getName()));

		Map<String, List<Employee>> employeeListByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		Stream<String> map = employeeListByDepartment.entrySet().stream().map(Map.Entry::getKey);
		List<String> collect2 = map.collect(Collectors.toList());
		System.out.println("collect2: "+collect2);
		
		Optional<List<Employee>> map2 = employeeListByDepartment.entrySet().stream().filter(f -> f.getValue().size() > 1).map(Map.Entry::getValue).findFirst();
		
		System.out.println("map2: "+map2);

//		for (Entry<String, List<Employee>> entry : entrySet) {
//			System.out.println("--------------------------------------");
//
//			System.out.println("Employees In " + entry.getKey() + " : ");
//
//			//System.out.println("--------------------------------------");
//
//			List<Employee> list = entry.getValue();
//
//			for (Employee e : list) {
//				//System.out.println(e.getName());
//			}break;
//		}

		System.out.println("List down the names of all employees in each department?");
		System.out.println(
				"=======================================================================================================");
	}

	private static void averageSalaryOfMaleAndFemaleEmployees(List<Employee> employeeList) {
		Map<String, Double> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("What is the average salary of male and female employees?");
		System.out.println(collect);
		System.out.println(
				"=======================================================================================================");
	}

	private static void howManyMaleAndFemaleEmployeesInSalesAndMarketingTeam(List<Employee> employeeList) {
		Map<String, Long> collect = employeeList.stream().filter(e -> e.getDepartment().equals("Sales And Marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("How many male and female employees are there in the sales and marketing team?");
		System.out.println(collect);
		System.out.println(
				"=======================================================================================================");

	}

	private static void whohasLessWorkingExperienceInEachDepartment(List<Employee> employeeList) {
		Map<String, Optional<Employee>> collect = employeeList.stream()
				// .sorted(Comparator.comparingInt(Employee::getYearOfJoining))
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.maxBy(Comparator.comparingInt(Employee::getYearOfJoining))));
		System.out.println("Who has the less working experience in Each Department?");
		System.out.println(collect);
		System.out.println(
				"=======================================================================================================");
	}

	private static void whohasLessWorkingExperienceInOrganization(List<Employee> employeeList) {
		Optional<Employee> max = employeeList.stream().max(Comparator.comparingInt(Employee::getYearOfJoining));
		// .max(Comparator.comparingInt(Employee::getYearOfJoining));

		System.out.println("Who has the less working experience in the organization?");
		System.out.println(max);
		System.out.println(
				"=======================================================================================================");
	}

	private static void whohasMostWorkingExperienceInOrganization(List<Employee> employeeList) {
		Optional<Employee> findFirst = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining))
				.findFirst();
		System.out.println("Who has the most working experience in the organization?");
		System.out.println(findFirst);
		System.out.println(
				"=======================================================================================================");
	}

	private static void getTheDetailsOfYoungestMaleAndFemaleEmployeeInEachDepartment(List<Employee> employeeList) {
		Map<String, Map<String, Optional<Employee>>> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getGender,
						Collectors.minBy(Comparator.comparingInt(Employee::getAge)))));
		System.out.println("Get The Details Of Youngest Male and female Employee In Each Department");
		System.out.println(collect);
		System.out.println(
				"=======================================================================================================");
	}

	private static void getTheDetailsOfYoungestMaleEmployeeInEachDepartment(List<Employee> employeeList) {
		Map<String, Map<String, Optional<Employee>>> collect = employeeList.stream()
				.filter(e -> e.getGender().equals("Male"))
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getGender,
						Collectors.minBy(Comparator.comparingDouble(Employee::getAge)))));
		System.out.println("Get The Details Of Youngest Male Employee In Each Department");
		System.out.println(collect);
		System.out.println(
				"=======================================================================================================");
	}

	private static void getTheDetailsOfYoungestFemaleEmployeeInEachDepartment(List<Employee> employeeList) {
		Map<String, Optional<Employee>> collect1 = employeeList.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.minBy(Comparator.comparingInt(Employee::getAge))));

		Map<String, Optional<Employee>> collect = employeeList.stream().filter(e -> e.getGender().equals("Female"))
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.minBy(Comparator.comparingDouble(Employee::getAge))));

		System.out.println("Get The Details Of Youngest Female Employee In Each Department");
		System.out.println(collect);
		System.out.println(collect1);
		System.out.println(
				"=======================================================================================================");
	}

	private static void getTheDetailsOfYoungestFemaleEmployeeInProductDevelopmentDepartment(
			List<Employee> employeeList) {
		Optional<Employee> min = employeeList.stream()
				.filter(e -> e.getGender().equals("Female") && e.getDepartment().equals("Product Development"))
				.min(Comparator.comparingInt(Employee::getAge));
		System.out.println("Get the details of youngest Female employee in the product development department?");
		System.out.println(min);
		System.out.println(
				"=======================================================================================================");
	}

	private static void getTheDetailsOfYoungestMaleEmployeeInProductDevelopmentDepartment(List<Employee> employeeList) {
		Optional<Employee> min = employeeList.stream()
				.filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Product Development"))
				.min(Comparator.comparingInt(Employee::getAge));
		System.out.println("Get the details of youngest male employee in the product development department?");
		System.out.println(min);
		System.out.println(
				"=======================================================================================================");

	}

	private static void averageSalaryOfEachDepartment(List<Employee> employeeList) {
		Map<String, Double> collect = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("What is the average salary of each department?");
		System.out.println(collect);
		System.out.println(
				"=======================================================================================================");
	}

	private static void countTheNumberOfEmployeesInEachDepartment(List<Employee> employeeList) {
		Map<String, Long> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("Count the number of employees in each department?");
		System.out.println(collect);
		System.out.println(
				"=======================================================================================================");
	}

	private static void getNamesOfAllEmployeesWhoHaveJoinedAfter2015(List<Employee> employeeList) {
		System.out.println("Get the names of all employees who have joined after 2015");
		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName)
				.forEach(System.out::println);
		System.out.println(
				"=======================================================================================================");
	}

	private static void getDetailsOfLowestPaidEmployeeInOrganization(List<Employee> employeeList) {
		Optional<Employee> collect = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println("Get the details of lowest paid employee in the organization?");
		System.out.println(collect);
		System.out.println(
				"=======================================================================================================");
	}

	private static void getDetailsOfHighestPaidEmployeeInOrganization(List<Employee> employeeList) {
		Optional<Employee> collect = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println("Get the details of highest paid employee in the organization?");
		System.out.println(collect);
		System.out.println(
				"=======================================================================================================");
	}

	private static void averageAgeOfMaleAndFemaleEmployees(List<Employee> employeeList) {
		Map<String, Double> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
		System.out.println(" What is the average age of male and female employees?");
		System.out.println(collect);
		System.out.println(
				"=======================================================================================================");
	}

	private static void averageAgeOfMaleAndFemaleEmployeesInEachDept(List<Employee> employeeList) {
		Map<String, Map<String, Double>> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge))));
		System.out.println(" What is the average age of male and female employees in each Department?");
		System.out.println(collect);
		System.out.println(
				"=======================================================================================================");
	}

	private static void getNameOfAllDepartmentsInOrganization(List<Employee> employeeList) {
		System.out.println("Print the name of all departments in the organization?");
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

		System.out.println(
				"=======================================================================================================");
	}

	private static void maleAndFemaleEmployeesInOrganization(List<Employee> employeeList) {
		Map<String, Long> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println("How many male and female employees are there in the organization?");
		System.out.println(collect);

		System.out.println(
				"=======================================================================================================");
	}
}
