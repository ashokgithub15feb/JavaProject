package com.durga.program.collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class CompartorDemo {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new MyComparatorDemo());
		t.add("Raja");
		t.add("Shobhalakshmi");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("Ramalumna");
		System.out.println(t);
		
	}
}

class MyComparatorDemo implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {

		String s1 = (String) o1;
		String s2 = (String) o2;
		
		return s2.compareTo(s1);
	}
}