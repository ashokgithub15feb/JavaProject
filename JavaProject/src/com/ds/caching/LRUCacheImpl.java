package com.ds.caching;

import java.util.LinkedHashMap;

// The Java Object Cache retrieves content faster and greatly reduces the load on application servers.
// A cache is an area of local memory that holds a copy of frequently accessed data

public class LRUCacheImpl<K, V> extends LinkedHashMap<K, V> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1449779896387348865L;
	private static int capacity;
	static boolean accessOrder = true;
	static float loadFactor = 0.75f;
	
	/**
	 *  int initialCapacity,
     *  float loadFactor,
     *  boolean accessOrder
	 * @param capacity
	 */
	private LRUCacheImpl(int size) {
		super(size, loadFactor, accessOrder);
		capacity = size;
		
	}
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		return size() > capacity;
	}
	
	public static <K, V> LRUCacheImpl<K, V> newInstance(int capacity)
	{
		return new LRUCacheImpl<>(capacity);
	}
}
