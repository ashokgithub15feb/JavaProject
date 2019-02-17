package com.durga.program.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorDemo {

	public static void main(String[] args) throws InterruptedException {

		HashMap<String, Integer> map = new HashMap<>();

		map.put("KING", 100); // Collision happened same hashCode of value
		map.put("CLARK", 200);
		map.put("BLAKE", 300); // Collision happened same hashCode of value
		map.put("FORD", 400);
		map.put("SMITH", 500);
		map.put("WARD", 600); // Collision happened same hashCode of value
		map.put("JONES", 700);
		
		List<Entry<String,Integer>> collect = map.entrySet().stream().collect(Collectors.toList());
		collect.forEach(System.out::println);
		System.out.println();
		Map<Entry<String, Integer>, Entry<String, Integer>> collect2 = collect.stream().collect(Collectors.toMap(Function.identity(), Function.identity()));
		
		collect2.entrySet().stream().forEach(System.out::println);
	}
}
