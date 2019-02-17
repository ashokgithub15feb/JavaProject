package com.durga.program.concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo2 {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> arrayList = new CopyOnWriteArrayList<>();
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.addIfAbsent(40);
		arrayList.addIfAbsent(10);

		System.out.println(arrayList);

		CopyOnWriteArrayList<Integer> arrayList2 = new CopyOnWriteArrayList<>();
		arrayList2.add(100);
		arrayList2.add(100);
		arrayList2.add(200);
		arrayList2.add(300);
		arrayList2.addIfAbsent(400);
		arrayList2.addIfAbsent(100);
		
		int addAllAbsent = arrayList2.addAllAbsent(arrayList);
		
		System.out.println(addAllAbsent); //returning how many item added in the list
		
		System.out.println(arrayList2);
		
		Iterator<Integer> iterator = arrayList2.iterator();
		arrayList2.add(500);
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
