package com.durga.program.java8.revies;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Employee1> l = new ArrayList<>();
		l.add(new Employee1("Durga", 30000));
		l.add(new Employee1("Ravi", 56000));
		l.add(new Employee1("Shiva", 67000));
		l.add(new Employee1("Mahesh", 25000));
		l.add(new Employee1("Adarsh", 35000));
		l.add(new Employee1("Sagar", 45000));
		l.add(new Employee1("Mahesh", 80000));		
		l.add(new Employee1("Ravi", 85000));
		l.add(new Employee1("Ravi", 18000));
		
		
		System.out.println("============ Check Each Employee having a > 30000 salary =============");
		Predicate<Employee1> p = e -> e.salary > 30000;
		
		for(Employee1 e1 : l)
		{
			if(p.test(e1))
			{
				System.out.println(e1.name+" : "+e1.salary);
			}
		}
		
		System.out.println("============Check Each Employee have a > 30000 salary and Name length should be > 5 =============");
		
		Predicate<Employee1> p1 = e1 -> e1.name.length()>5;
		
		for(Employee1 emp : l)
		{
			//p.and(Predicate<? super T> other)
			if(p.and(p1).test(emp))
			{
				System.out.println(emp.name+" : "+emp.salary);
			}
		}
		
		System.out.println("============Check Each Employee have a > 30000 salary or Name length should be > 5 =============");
		
		for(Employee1 emp : l)
		{
			//p.or(Predicate<? super T> other)
			if(p.or(p1).test(emp))
			{
				System.out.println(emp.name+" : "+emp.salary);
			}
		}
		
		System.out.println("============Check Each Employee have a Name, length should not(negate()) be even =============");
		
		Predicate<Employee1> p2 = e1 -> e1.name.length() %2 == 0;
		
		for(Employee1 emp : l)
		{
			//p2.negate(Predicate<? super T> other)
			if(p2.negate().test(emp))
			{
				System.out.println(emp.name+" : "+emp.salary);
			}
		}
		
		System.out.println("============Check Employee have a same Name(Predicate.isEqual()) =============");
		
		
			Predicate<String> p3 = Predicate.isEqual("Ashok");

			System.out.println(p3.test("Ashok"));
			
	}
}

class Employee1
{
	String name;
	double salary;
	
	public Employee1(String name, double salary) {
		
		this.name = name;
		this.salary = salary;
	}
}

