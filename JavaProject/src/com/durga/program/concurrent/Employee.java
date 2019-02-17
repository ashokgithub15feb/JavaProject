package com.durga.program.concurrent;

import java.io.Serializable;

public class Employee implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// we haven’t declared SerialVersionUId
	private Integer id;
	private String name;
	private String addedField;

	public Employee() {
	}
	
	public Employee(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

/*
* Class whose instance will be written at EOF during serialization
* to indicate EOF during deSerialization process.
*/
class EofIndicatorClass implements Serializable{}