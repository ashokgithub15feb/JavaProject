package com.durga.program.java8.revies.stream;

public class PersonAggregate {

	private String name;
	private String country;
	
	public PersonAggregate(String name, String country) {
		this.name=name;
		this.country = country;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		
		//"PersonAggregate [name=" + name + ", country=" + country + "]"
		return getName();
	}
	
	
}
