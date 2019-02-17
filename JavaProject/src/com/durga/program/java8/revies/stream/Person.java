package com.durga.program.java8.revies.stream;

public class Person {

	private String id;
	private String contury;
	
	public Person(String id, String country) {
		
		this.id = id;
		this.contury=country;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContury() {
		return contury;
	}

	public void setContury(String contury) {
		this.contury = contury;
	}
	
	
}
