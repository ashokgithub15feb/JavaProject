package com.durga.program.netcraker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class InitCapChangeDemo {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("Papaya");
		fruits.add("pinapple");
		fruits.add("Guawa");
		
		System.out.println(fruits);
		System.out.println();
		fruits.forEach((fruite) -> System.out.println(fruite));
		System.out.println();
		Iterator<String> iterator = fruits.iterator();
		
		List<String> lst = new ArrayList<>();
		while(iterator.hasNext())
		{
			String next = iterator.next();
			String st = next.substring(0, 1).toUpperCase();
			String st1 = next.substring(1, next.length());
			st = st+st1;
			lst.add(st);
		}
		System.out.println(lst);
		System.out.println();
		
		Iterator<String> iterator2 = fruits.iterator();
		List<String> lst1 = new ArrayList<>();
		while(iterator2.hasNext())
		{
			String next = iterator2.next();
			String st = next.substring(0, 1).toUpperCase();
			String st1 = next.substring(1);
			st = st+st1;
			lst1.add(st);
		}
		System.out.println(lst1);
		System.out.println();
		
	}
}
