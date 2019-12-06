package com.ds.caching;

import java.util.Map;
import java.util.LinkedHashMap;

public class SimpleLRUCache<K, V> extends LinkedHashMap<K, V> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8611253744485746423L;
	private int maxSize;

	private SimpleLRUCache(final int maxSize) {
		super(maxSize, 0.75f, true);
		this.maxSize = maxSize;
	}

	protected boolean removeEldestEntry(final Map.Entry<K, V> eldest) {
		return size() > maxSize;
	}
	
	public static <K, V> SimpleLRUCache<K, V> newInstance(int size)
	{
		return new SimpleLRUCache<>(size);
	}
	
	public static void main(String[] args) {
		
		String s1 = "A";
		String s2 = "Aa";
		String s3 = "Aaa";
		String s4 = "Aaaa";
		String s5 = "Aaaaa";
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put(s1, 1);
		map.put(s2, 2);
		map.put(s3, 3);
		map.put(s4, 4);
		map.put(s5, 5);
		
		SimpleLRUCache<String,Integer> cacheMemory = SimpleLRUCache.newInstance(3);
		
		cacheMemory.put(s1, 1);
		cacheMemory.put(s2, 2);
		cacheMemory.put(s3, 3);
		cacheMemory.put(s4, 4);
		cacheMemory.put(s5, 5);
		
		
		System.out.println(map);
		System.out.println();
		System.out.println(cacheMemory);
	}
}
