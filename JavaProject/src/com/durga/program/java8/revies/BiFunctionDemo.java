package com.durga.program.java8.revies;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee2> l = new ArrayList<>();
		
		BiFunction<Integer, String, Employee2> f = (eno, name) -> new Employee2(name, eno);
		l.add(f.apply(201, "Durga"));
		l.add(f.apply(202, "Binny"));
		l.add(f.apply(204, "Chinny"));
		l.add(f.apply(205, "Shimmy"));
		l.add(f.apply(203, "VInny"));
		
		l.forEach(s -> System.out.println(s.eno+":"+s.name+"\n"));
	}
}

class Employee2
{
	String name;
	int eno;
	
	Employee2(String name, int eno)
	{
		this.name = name;
		this.eno = eno;
	}
}
