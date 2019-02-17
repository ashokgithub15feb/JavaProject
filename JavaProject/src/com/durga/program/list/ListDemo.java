package com.durga.program.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		
		List<Integer> l2 = new ArrayList<>();
		l2.add(60);
		l2.add(70);
		l2.add(90);
		
		
		l.addAll(l2);
		
		System.out.println(l2);
		System.out.println(l);
		
		l.add(3, 1000);
		
		System.out.println(l);
		
		if(l.containsAll(l2))
		{
			System.out.println(true);
		}
		
		//Returns the index of the first occurrence of the specified element
	    //in this list, or -1 if this list does not contain the element.
		System.out.println(l.indexOf(1000));
		System.out.println(l.indexOf(012));
		System.out.println(l.lastIndexOf(60));
		
		Integer set = l.set(3, 2000);
		System.out.println("Old Value: return from list: "+set);
		System.out.println(l);
		System.out.println(l.get(3));
		System.out.println(l.remove(3));
		System.out.println(l);
//		System.out.println(l.remove(20));
		System.out.println("=========");
		l.retainAll(l2);
		//l2.retainAll(l);
		System.out.println(l);
		System.out.println(l2);
		
		Iterator<Integer> iterator = l.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
//			l.add(30);
//			l.remove(30);
			iterator.remove();
		}
	}
}
