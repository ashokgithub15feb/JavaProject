package com.durga.program.java8.revies.stream;

public class PersonAllMatch {

	private String name;
	private String country;
	private Integer age;
	private Integer weight;
	
	public PersonAllMatch(String name, String country, Integer age,  Integer weight) {
		this.name= name;
		this.country = country;
		this.age = age;
		this.weight = weight;
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

	public Integer getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "PersonAllMatch [name=" + name + ", country=" + country + ", age=" + age + ", weight=" + weight + "]";
	}

	
}
