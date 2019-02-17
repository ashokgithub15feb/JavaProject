package com.durga.program.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("W");
		l.add("S");
		l.add(new Integer(10));
		System.out.println(l);
		
		Collections.sort(l);
		
		System.out.println(l);
	}
}
