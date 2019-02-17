package com.durga.program.concurrent;

import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.function.BiConsumer;

public class ConcurrentSkipListMapDemo {

	public static void main(String[] args) {
		
		ConcurrentSkipListMap<String, String> map = new ConcurrentSkipListMap<>();
		map.put("ND", "New Delhi");
		map.put("MU", "Mumbai");
		map.put("CH", "Channai");
		map.put("HD", "Hyderabad");
		map.putIfAbsent("ND", "NewDelhi");
		map.putIfAbsent("BL", "Bangalore");
		
		Set<Entry<String,String>> entrySet = map.entrySet();
		
		// public void forEach(BiConsumer<? super K, ? super V> action) {
		entrySet.forEach((cityCode) -> System.out.println("Key: "+cityCode.getKey() + " value: "+cityCode.getValue()));
		
	}
}
