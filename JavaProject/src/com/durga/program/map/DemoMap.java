package com.durga.program.map;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("A", "AA");
		map.put("B", "BB");
		map.put("C", "CC");
		map.put("D", "DD");
		map.put("D", "DDD");
		map.put("E", "EE");
		
		System.out.println(map);
		
		for(Map.Entry<String, String> m : map.entrySet())
		{
			System.out.println("Key: "+m.getKey()+" : Value: "+m.getValue());
		}
		
	}
}
