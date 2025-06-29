package com.interviews.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomeClassSorting {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<Person>(Arrays.asList(new Person(101, "Alice", 30, 65.6), new Person(301, "Bob", 25, 70.0), new Person(201, "Chalie", 35, 80.0)));
		
		System.out.println("Originl: "+persons);
		
		Collections.sort(persons, new PersonIdComparator());
		
		System.out.println("Sorted by Id: "+persons);
		
		Collections.sort(persons, new PersonNameComparator());
		
		System.out.println("Sorted by Name: "+persons);
		
		Collections.sort(persons, new PersonAgeComparator());
		
		System.out.println("Sorted by Age: "+persons);
		
		Collections.sort(persons, new PersonWeightComparator());
		
		System.out.println("Sorted by Weight: "+persons);
		
		System.out.println("=================================");
		List<Person> personsList = new ArrayList<Person>(Arrays.asList(new Person(101, "A", 30, 65.6),
				new Person(301, "AA", 25, 70.0), new Person(201, "xx", 35, 80.0), new Person(201, "ABC", 35, 80.0),
				new Person(201, "ABCD", 35, 80.0)));
		System.out.println("Original: "+personsList);
		
		Collections.sort(personsList, new PersonNameIncreasingLengthOrder());
		StringBuilder sb = new StringBuilder();
		sb.append("\n").append(personsList.get(0)).append("\n").append(personsList.get(1)).append("\n").append(personsList.get(2))
				.append("\n").append(personsList.get(3)).append("\n").append(personsList.get(4));

		System.out.println("Person Name Increasing Length Order: "+sb);
		
	}
}
