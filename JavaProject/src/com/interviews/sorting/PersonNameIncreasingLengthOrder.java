package com.interviews.sorting;

import java.util.Comparator;

public class PersonNameIncreasingLengthOrder implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		String personName1 = o1.getName();
		String personName2 = o2.getName();
		
		int personNameLen1 = personName1.length();
		int personNameLen2 = personName2.length();
		
		if(personNameLen1 < personNameLen2) {
			return -1;
		} else if(personNameLen1 > personNameLen2) {
			return 1;
		} else {
			return personName1.compareTo(personName2);
		}
	}

	
}
