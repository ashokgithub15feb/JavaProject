package com.durga.program.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//HashMap<Temp, String> map = new HashMap<>();
		
		WeakHashMap<Temp, String> map = new WeakHashMap<>();
		
		Temp t = new Temp();
		
		map.put(t, "Durga");
		
		System.out.println(map);
		
		t = null;
		
		System.gc();
		
		Thread.sleep(5000);
		System.out.println(map);
	}
}

class Temp
{
	public String toString()
	{
		return "temp";
	}
	
	@Override
	protected void finalize() throws Throwable {

		System.out.println("Finalize method called");
	}
}