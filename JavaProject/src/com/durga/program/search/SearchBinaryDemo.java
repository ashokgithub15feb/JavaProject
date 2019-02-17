package com.durga.program.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SearchBinaryDemo {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("L");
		l.add("a");
		
		System.out.println(l);
		
		Collections.sort(l);
		
		System.out.println(l);
		
		System.out.println(Collections.binarySearch(l, "Z"));
		System.out.println(Collections.binarySearch(l, "J"));
		System.out.println(Collections.binarySearch(l, "b"));
		
		
		System.out.println("================================");
		
		ArrayList l2 = new ArrayList();
		l2.add(15);
		l2.add(0);
		l2.add(20);
		l2.add(10);
		l2.add(5);
		System.out.println(l2);
		
		MyCmp c = new MyCmp();
		Collections.sort(l2, c);
		
		System.out.println(l2);
		
		System.out.println(Collections.binarySearch(l2, 10, c));
		
		System.out.println(Collections.binarySearch(l2, 30, c));
		
		System.out.println(Collections.binarySearch(l2, 50, c));
		
		System.out.println(Collections.binarySearch(l2, 17, c));
		
		System.out.println(Collections.binarySearch(l2, 17));
		
		
	}
}

class MyCmp implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		
		return i2.compareTo(i1);
	}
}