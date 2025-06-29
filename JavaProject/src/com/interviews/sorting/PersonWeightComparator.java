package com.interviews.sorting;

import java.util.Comparator;

public class PersonWeightComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return ((int) o1.getWeight()) - ((int)o2.getWeight());
	}
}
