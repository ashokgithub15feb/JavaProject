package com.durga.program.map;

import java.util.HashMap;

public class CustomeHashMapDemo extends HashMap<String, Integer>{

	public static void main(String[] args) {
		
		CustomeHashMapDemo map = new CustomeHashMapDemo();
		map.put("CLARK", 90);
		map.put("BLAKA", 10);
		map.put("FORD", 110);
		map.put("SMITH", 10);
		map.put("WORD", 99);
		map.put("JONES", 99);
		map.put("KING", 100);

		putKeyValue(map);
	}

	private static void putKeyValue(CustomeHashMapDemo map) {

		
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
