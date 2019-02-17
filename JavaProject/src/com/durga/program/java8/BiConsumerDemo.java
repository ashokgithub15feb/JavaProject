package com.durga.program.java8;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class BiConsumerDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Employees1> l = new ArrayList<>();
		
		populte(l);
		
		BiConsumer<Employees1, Double> c = (e,d) -> e.getSalary();
		
		for(Employees1 e: l)
		{
			c.accept(e, 1000.00);
		}
		
		for(Employees1 e: l)
		{
			System.out.println("Employee Name: "+e.getName());
			System.out.println("Employee Salary: "+e.getSalary());
			System.out.println();
		}
		
	}

	private static void populte(ArrayList<Employees1> l) {

			l.add(new Employees1("Durga", 11, 50000));
			l.add(new Employees1("Ravi", 12, 40000));
			l.add(new Employees1("Tivya", 13, 30000));
			l.add(new Employees1("Shivya", 14, 60000));
			l.add(new Employees1("Wilya", 15, 70000));
			l.add(new Employees1("Vinya", 16, 20000));
			
	}
}

class Employees1
{
	private String name;
	private int eno;
	private double salary;
	
	public Employees1(String name, int eno, double salary) {
		this.name = name;
		this.eno=eno;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}
}
