package com.durga.program.concurrent;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo extends Thread 
{
	private static CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<>();
	
	@Override
	public void run() {

		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{}
		
		System.out.println("Child Thread Updating COWAL");
		cowal.add("D");
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		cowal.add("A");
		cowal.add("B");
		cowal.add("C");
		
		CopyOnWriteArrayListDemo t = new CopyOnWriteArrayListDemo();
		t.start();
		
		Iterator<String> iterator =cowal.iterator();
		
		while(iterator.hasNext())
		{
			String key = iterator.next();
			
			System.out.println("Main Thread Iterating COWAL and Current Object is: "+key);
			
			Thread.sleep(3000);
			
			//CopyOnWriteArrayList object is not supporting remove operation on iterator object
			//iterator.remove(); //Exception in thread "main" java.lang.UnsupportedOperationException
		}
		
		System.out.println(cowal);
	}
}
