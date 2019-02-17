package com.durga.program.java8.revies;

public class Employee {

	private String name;
	private int eno;
	
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

	@Override
	public String toString() {
		return "Employee [name=" + name + ", eno=" + eno + "]";
	}
 
	public Employee(String name, int eno) {
		
		this.name = name;
		this.eno = eno;
	}
}
