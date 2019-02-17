package com.durga.program.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	protected LinkedListDemo()
	{
		System.out.println("LinkedListDemo");
	}
	
	public static void main(String[] args) {
		
		LinkedListDemo LinkedListDemoo = new LinkedListDemo();
		LinkedList<Integer> l = new LinkedList();
		
		l.addFirst(10);
		l.addLast(20);
		l.addFirst(30);
		
		
		System.out.println(l);
		
		System.out.println(l.getFirst());
		
		System.out.println(l.removeLast());
		System.out.println(l);
		
		Iterator<Integer> iterator = l.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		l.addFirst(40);
		l.addFirst(50);
		l.addFirst(100);
		l.add(60);
		ListIterator<Integer> listIterator = l.listIterator();
		
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
		}
	}
}
