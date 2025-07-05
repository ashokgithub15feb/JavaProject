package com.interviews.java8.realtime;

import java.util.Comparator;

//Query 3.9 : Who has the most working experience in the organization?

public class MostWorkingExperience {

	public static void main(String[] args) {

		Employee emp = ListOfEmployee.getListOfEmployee().stream()
				.sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst().get();
		
		System.out.println(emp);
		
		Employee emp1 = ListOfEmployee.getListOfEmployee().stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).get();
		
		System.out.println(emp1);
		
		Employee emp2 = ListOfEmployee.getListOfEmployee().stream().max(Comparator.comparingInt(Employee::getYearOfJoining)).get();
		System.out.println(emp2);
	}
}
