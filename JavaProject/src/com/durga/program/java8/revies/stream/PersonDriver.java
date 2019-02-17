package com.durga.program.java8.revies.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonDriver {

	public static void main(String[] args) {
		
		
		List<Person> list = populateList();
		
		list.stream().filter(person -> person.getContury().equals("US"))
					 .map(person -> "Person Id: "+person.getId()+" and Country: "+person.getContury())
					 .forEach(x -> System.out.println(x));
	
		System.out.println();
		
		list.stream().filter(person -> !person.getContury().equals("US"))
		 .map(person -> "Person Id: "+person.getId()+" and Country: "+person.getContury())
		 .forEach(x -> System.out.println(x));

		System.out.println();
		
		Person[] person = list.stream().toArray(Person[]::new);
		Arrays.asList(person).stream().forEach(x -> System.out.println("Person Id: "+x.getId()));
		
		System.out.println();
		
		Object[] obj = list.stream().toArray();
		
		Arrays.asList(obj).stream().forEach(p -> System.out.println("Person Id: "+((Person)p).getId()));
	}
	
	
	private static List<Person> populateList()
	{
		List<Person> list = new ArrayList<>();
		list.add(new Person("Person-Id-1", "US"));
		list.add(new Person("Person-Id-3", "Mexico"));
		list.add(new Person("Person-Id-2", "Canada"));
		list.add(new Person("Person-Id-5", "US"));
		list.add(new Person("Person-Id-4", "Lanadon"));
		
		return list;
	}
}
