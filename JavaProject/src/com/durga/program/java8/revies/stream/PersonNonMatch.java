package com.durga.program.java8.revies.stream;

public class PersonNonMatch {

	private String name;
	private String country;
	private Integer age;
	
	public PersonNonMatch(String name, String country, Integer age) {

		this.name= name;
		this.country = country;
		this.age = age;
		
	}
	
	@Override
	public String toString() {
		return "PersonNonMatch [name=" + name + ", country=" + country + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public Integer getAge() {
		return age;
	}
	
}
