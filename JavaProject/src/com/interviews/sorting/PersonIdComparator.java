package com.interviews.sorting;

import java.util.Comparator;

public class PersonIdComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return ((int) o1.getId()) - ((int)o2.getId());
	}
}
