package com.durga.program.javabrahman.java8.stream;

public class Employee {

	private String name;
	private int age;
	private double salry;
	
	public double getSalry() {
		return salry;
	}

	public void setSalry(double salry) {
		this.salry = salry;
	}

	public Employee(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public Employee(String name, int age, double salary)
	{
		this.name = name;
		this.age = age;
		this.salry = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salry);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salry) != Double.doubleToLongBits(other.salry))
			return false;
		return true;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salry=" + salry + "]";
	}
	
	
}
