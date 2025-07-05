package com.interviews.java8.realtime;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

//Query 3.13 : What is the average salary and total salary of the whole organization?


public class AverageSalaryAndTotalSalary {
	
	public static void main(String[] args) {
		
		DoubleSummaryStatistics collect = ListOfEmployee.getListOfEmployee().stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		
		System.out.println(collect.getAverage());
		System.out.println(collect.getSum());
	}
}
