package com.durga.program.concurrent;

import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetDemo {

	public static void main(String[] args) {
		
		ConcurrentSkipListSet s = new ConcurrentSkipListSet();
		
		s.add(10);
		s.add(40);
		s.add(20);
		s.add(70);
		s.add(80);
		s.add(10); //duplicate are not allawed
		//s.add("A"); //Exception in thread "main" java.lang.ClassCastException: heterogenerous object are not allowed
		
		System.out.println(s);
		
		
		Iterator iterator = s.iterator();
		
		s.forEach(s1 -> System.out.println(s1));
		
	}
}
