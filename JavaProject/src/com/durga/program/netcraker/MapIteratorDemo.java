package com.durga.program.netcraker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIteratorDemo {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("A", "Ashok");
		map.put("B", "Brijkishor");
		map.put("C", "Chetnya");
		map.put("D", "Deepak");
		map.put("E", "Eshwar");
		map.put("F", "Firoz");
		map.put("G", "Guruprit");
		map.put("H", "Himanshu");
		map.put("I", "Isha");
		map.put("J", "Jagu");
		
		//print map
		System.out.println(map);
		
		//iterate map - 1
		System.out.println("iterate map - 1");
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		//iterate map - 2
		System.out.println("iterate map - 2");
		Set<Entry<String,String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> iterator2 = entrySet.iterator();
		while(iterator2.hasNext())
		{
			Entry<String, String> next = iterator2.next();
			System.out.println(next.getKey()+":"+next.getValue());
		}
		
		//iterate map - 3
		System.out.println("iterate map - 3");
		for(Map.Entry<String, String> m : map.entrySet())
		{
			System.out.println(m.getKey()+":::"+m.getValue());
		}
		
		//iterate map - 4
		System.out.println("iterate map - 4");
		map.forEach((k, v) -> System.out.println(k+"::"+v));
		System.out.println("===============================");
		System.out.println("iterate map - 5");
		map.entrySet().forEach(System.out::println);
		System.out.println("===============================");
		
		//iterate map - 5
		System.out.println("iterate map - 6");
		Iterator<Entry<String, String>> iterator3 = map.entrySet().iterator();
		List<String> key = new ArrayList<>();
		List<String> value = new ArrayList<>();
		while(iterator3.hasNext())
		{
			Entry<String, String> next = iterator3.next();
			key.add(next.getKey());
			value.add(next.getValue());
		}
		System.out.println(key);
		System.out.println(value);
	}
}
