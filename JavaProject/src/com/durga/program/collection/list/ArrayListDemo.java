package com.durga.program.collection.list;

import java.util.ArrayList;

public class ArrayListDemo
{
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add("Ashok");
		l.add(10);
		l.add(null);
		l.add(new String("Durga"));
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2, "Ajinkey");
		System.out.println(l);
		l.add(100);
		System.out.println(l);
	}
}
