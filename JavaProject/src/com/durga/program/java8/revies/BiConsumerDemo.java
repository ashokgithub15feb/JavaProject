package com.durga.program.java8.revies;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee3> l = new ArrayList<>();
		BiConsumer<Employee3, Double> c = (e, bonus) -> e.salary = e.salary + bonus;
		populateUpdate(l);
		
		
		l.forEach(e -> c.accept(e, 500.00));

		l.forEach(e -> System.out.println(e.name+":"+e.salary));
			
	}

	private static void populateUpdate(ArrayList<Employee3> l) {
		l.add(new Employee3("Durga", 3000));
		l.add(new Employee3("Binny", 4000));
		l.add(new Employee3("Cinny", 5000));
		l.add(new Employee3("Tinny", 6000));
		l.add(new Employee3("Wiiny", 7000));
		
	}
}

class Employee3
{
	String name;
	double salary;
	
	public Employee3(String name, double salary)
	{
		this.name= name;
		this.salary = salary;
	}
}