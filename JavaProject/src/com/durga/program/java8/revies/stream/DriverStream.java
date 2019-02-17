package com.durga.program.java8.revies.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class DriverStream {

	private static List<String> list = populateList();
	private static Map<String, String> map = populateMap();
	
	public static void main(String[] args) {
		
		System.out.println("=============Obtain Stream from List=============");
		list.stream().forEach(x -> System.out.println(x));
		
		System.out.println("============Obtain Stream from map using entrySet()==============");
		map.entrySet().stream().forEach(x -> System.out.println(x));
		System.out.println();
		map.entrySet().stream().forEach(x -> System.out.println(x.getKey()+":"+x.getValue()));
		
		System.out.println("================Obtain Stream from Map using keySet()===================");
		map.keySet().stream().forEach(x -> System.out.println(x));
		
		System.out.println("=============Obtain Stream from map using value====================");
		map.entrySet().forEach(x -> System.out.println(x.getValue()));
		System.out.println();
		map.keySet().forEach(x -> System.out.println(map.get(x)));
		System.out.println();
		map.values().stream().forEach(x -> System.out.println(x));
		
		System.out.println("===============obtain Stream from from a String using character - chars()====================");
		"ashokKumarYadav".chars().forEach(x -> System.out.println(Character.toChars(x)));
		
		System.out.println("================Obtain a stream from a String using split======================");
		Stream.of("A,B,C,D,E ,F".split(",")).forEach(s -> System.out.println(s));
		
		System.out.println("===============Obtain Stream from Array=====================");
		Integer[] arr = {1,2,3,4,5,6,7,8,9};
		Stream.of(arr).forEach(x -> System.out.println(x));
		
		System.out.println("===============Obtain Stream from value===================");
		Stream.of("one", "two", "three").forEach(s -> System.out.println(s));
		
		System.out.println("==============Obtain Stream from function generate ===================");
		Stream.generate(() -> {
			
			return (int) (Math.random()*10);
			
		}).limit(10).forEach(x -> System.out.println(x));
	
		System.out.println("=============obtain a Stream from function iterate==================");
		Stream.iterate(0, i -> i + 1).limit(10).forEach(x -> System.out.println(x));
		
		System.out.println("==============obtain Stream from Builder=================");
		Stream.builder().add("one").add("two").add("three").add("four").build().forEach(x -> System.out.println(x));
		
		System.out.println("==============Obtain a stream from a another Stream=================");
		list.stream().distinct().limit(2).sorted().forEach(x -> System.out.println(x));
	}
	
	public static List<String> populateList()
	{
		List<String> list = new ArrayList<>();
		list.add("List-Value-1");
		list.add("List-Value-3");
		list.add("List-Value-2");
		list.add("List-Value-1");
		list.add("List-Value-4");
		
		return list;
	}
	
	public static Map<String, String> populateMap()
	{
		Map<String, String> map = new HashMap<>();
		map.put("Map-key-1", "Map-Value-1");
		map.put("Map-key-2", "Map-Value-2");
		map.put("Map-key-3", "Map-Value-3");
		map.put("Map-key-4", "Map-Value-4");
		map.put("Map-key-5", "Map-Value-5");
		map.put("Map-key-6", "Map-Value-6");
		
		return map;
	}
}
