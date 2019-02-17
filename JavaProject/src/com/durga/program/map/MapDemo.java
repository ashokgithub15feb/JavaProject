package com.durga.program.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap m = new HashMap();
		
		m.put("Ashok", 1000000);
		m.put("Durga", 5000000);
		m.put("Ravi",  6000000);
		m.put("venkat",7000000);
		
		System.out.println(m);
		
		System.out.println(m.put("Ashok", 8000000));
		
		System.out.println(m);
		
		System.out.println(m.keySet());
		
		System.out.println(m.values());
		
		System.out.println(m.entrySet());
		
		Set entrySet = m.entrySet();
		
		Iterator iterator = entrySet.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry m1 = (Map.Entry) iterator.next();
			
			System.out.println(m1.getKey() + "---"+m1.getValue());
			
			if(m1.getKey().equals("Ashok"))
			{
				m1.setValue("700000000");
			}
		}
		
		System.out.println(m);
	}
}
