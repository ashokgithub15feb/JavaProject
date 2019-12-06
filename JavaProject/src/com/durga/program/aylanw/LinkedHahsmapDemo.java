package com.durga.program.aylanw;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHahsmapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("Aa", 1);
		map.put("Bb", 2);
		map.put("Cc", 3);
		map.put("Dd", 4);
		map.put("Ee", 5);
		map.put("Ff", 6);
		map.put("Gg", 7);
		map.put("Hh", 8);
		map.put("Ii", 9);
		map.put("Jj", 10);
		
		map.entrySet().forEach(System.out::println);
		System.out.println("++++++++++++++++++++=");
		System.out.println(map.get("Cc"));
		System.out.println(map.get("Hh"));
		
		map.entrySet().forEach(System.out::println);
		
		System.out.println("===============================");
		
		Map<String, Integer> map1 = new HashMap<>();
		
		map1.put("Aa", 1);
		map1.put("Bb", 2);
		map1.put("Cc", 3);
		map1.put("Dd", 4);
		map1.put("Ee", 5);
		map1.put("Ff", 6);
		map1.put("Gg", 7);
		map1.put("Hh", 8);
		map1.put("Ii", 9);
		map1.put("Jj", 10);
		
		map1.entrySet().forEach(System.out::println);
	}
}
