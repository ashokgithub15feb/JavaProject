package com.durga.program.concurrent;

import java.util.Iterator;

public class ConcurentModificationExceptionDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread.list.add("A");
		MyThread.list.add("B");
		MyThread.list.add("C");
		
		MyThread t = new MyThread();
		t.start();
		
		Iterator<String> iterator = MyThread.list.iterator();
		
		while(iterator.hasNext())
		{
			String next = iterator.next();
			
			System.out.println("Main Thread Iterating List and Current Object is: "+next);
			Thread.sleep(3000);
		}
		
		System.out.println(MyThread.list);
	}
}
