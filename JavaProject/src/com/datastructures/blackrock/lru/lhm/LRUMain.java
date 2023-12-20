package com.datastructures.blackrock.lru.lhm;

public class LRUMain {

	public static void main(String[] args) {
		LRUCache lru = new LRUCache(3);
		
		lru.put(1, 1);
		lru.put(2, 2);
		lru.put(3, 3);
		lru.put(4, 4);
		lru.put(3, 30);
		
		int value = lru.get(4);
		System.out.println("Key : 4, Value : "+value);
	}
}
