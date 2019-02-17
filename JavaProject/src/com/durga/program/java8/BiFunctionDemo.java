package com.durga.program.java8;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		
		ArrayList<Employees> l = new ArrayList<>();
		
		BiFunction<Integer, String, Employees> f = (eno, name) -> new Employees(name, eno);
		
		l.add(f.apply(30001, "Durga"));
		l.add(f.apply(30002, "Shami"));
		l.add(f.apply(30004, "Ravi"));
		l.add(f.apply(30003, "Khali"));
		l.add(f.apply(30005, "tavi"));
		
		
		for(Employees e : l)
		{
			System.out.println("EMployee Name: "+e.getName());
			System.out.println("Employee Id: "+e.getEno());
			System.out.println();
		}
	}
}

class Employees
{
	private String name;
	private int eno;
	
	public Employees(String name, int eno) {
		this.name = name;
		this.eno=eno;
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
