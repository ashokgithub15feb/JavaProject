package com.durga.program.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("KING", 100); // Collision happened same hashCode of value
		System.out.println(hash("KING")%16);
		map.put("CLARK", 200);
		System.out.println(hash("CLARK")%16);
		map.put("BLAKE", 300); // Collision happened same hashCode of value
		System.out.println(hash("BLAKE")%16);
		map.put("FORD", 400);
		System.out.println(hash("FORD")%16);
		map.put("SMITH", 500);
		System.out.println(hash("SMITH")%16);
		map.put("WARD", 600); // Collision happened same hashCode of value
		System.out.println(hash("WARD")%16);
		map.put("JONES", 700);
		System.out.println(hash("JONES")%16);
		map.put(null, 800); // for null key will always have a hash of 0 so the index of null key will be always index 0
		
		System.out.println(map);
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		entrySet.forEach(m -> System.out.println("Key: "+m.getKey()+" Value: "+m.getValue()));
	
		int h = "KING".hashCode();
		int h1 = (h = "KING".hashCode()) ^ (h >>> 16);
		System.out.println("KING: "+"KING".hashCode()+", Left Shift "+ "(h >>> 16): "+(h >>> 16)+" h1: "+h1);
		
		System.out.println(map.get("KING"));
	}
	
	static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
