package com.datastructures.blackrock.lru.lhmimpl;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheUningLHMImpl<K, V> extends LinkedHashMap<K, V>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8034873418503945213L;
	private int capacity;
	
	private LRUCacheUningLHMImpl(int size) {
		super(size, 0.75f, true);
		this.capacity = size;
	}
	
	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > capacity;
	}
	
	public static <K, V> LRUCacheUningLHMImpl<K, V> newInstance(int capacity) {
		return new LRUCacheUningLHMImpl<K, V>(capacity);
	}
	
}
