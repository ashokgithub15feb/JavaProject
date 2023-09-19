//package com.ds.thread;
//
//public class CustomHashMap<K, V> {
//
//	final int defaylt_capacity = 15;
//	Entry<K, V>[] bucket = new Entry[defaylt_capacity];
//	int size = 0;
//	
//	
//	public V put(K key, V value)
//	{		
//		int hash = hashing(key.hashCode());
//		
//		
//		return null;
//	}
//	
//	private int hashing(int hashCode) {
//		return hashCode % 16;
//	}
//	
//	public V get(K key)
//	{
//		if(key == null)
//		{
//			//some
//		}
//		
//		int index = hashing(key); // 5
//		
//		Entry<K, V> bucket = new Entry[index]; // 5
//		
//		while(bucket != null)
//		{
//			if(bucket.k.equals(key))
//			{
//				return bucket.v;
//			}
//			bucket = bucket.next;
//		}
//	}
//
//	class Entry<K, V>
//	{
//		K k;
//		V v;
//		
//		Entry<K, V> next;
//		
//		Entry(K k, V v, Entry<K, V> next)
//		{
//			this.k = k;
//			this.v = v;
//			this.next = next;
//		}
//		
//		// gettre and setter
//		
//	}
//}
