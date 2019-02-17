package com.durga.program.collection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CurcorInternalImpl {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		Enumeration<Integer> elements = v.elements();
		Iterator<Integer> iterator = v.iterator();
		ListIterator<Integer> listIterator = v.listIterator();
		
		System.out.println(elements.getClass().getName());
		System.out.println(iterator.getClass().getName());
		System.out.println(listIterator.getClass().getName());
		
	}
}
