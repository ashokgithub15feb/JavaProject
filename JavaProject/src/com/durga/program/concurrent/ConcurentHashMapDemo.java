package com.durga.program.concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurentHashMapDemo extends Thread 
{
	//replace cuncurrenthashmap
	private static HashMap<String, Integer> map = new HashMap<>();
	
	@Override
	public void run() {

		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{}
		
		System.out.println("Child Thread Updating Map");
		map.put("D", 104);
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		map.put("A", 101);
		map.put("B", 102);
		map.put("C", 103);
		
		ConcurentHashMapDemo t = new ConcurentHashMapDemo();
		t.start();
		
		Iterator<String> iterator =map.keySet().iterator();
		
		while(iterator.hasNext())
		{
			String key = iterator.next();
			
			System.out.println("Main Thread Iterating Map and Current Object Key is: "+key + "- and value is: -"+map.get(key));
			Thread.sleep(3000);
		}
		
		System.out.println(map);
	}
}
