package com.interviews.companies.globlelogic;

//hashmap is entry of object will keep key and value
//default sife of hashmap - 16
//create 16 bucket of aarry
//table with entry 
//entry class key and value
public class CustomHashMap<K, V> {

	private Entry<K, V>[] table;
	private int capacity = 16;
	
	@SuppressWarnings("unchecked")
	public CustomHashMap() {
		this.table = new Entry[capacity];
	}
	
	public int hash(K key) {
		return Math.abs(key.hashCode()) % capacity;
	}
	
	public V put(K newKey, V value) {
		
		if(newKey == null) {
			return null;
		}
		
		int bucketIndex = hash(newKey);
		
		Entry<K, V> newEntry = new Entry<K, V>(newKey, value, null);
		
		if(table[bucketIndex] == null) {
			table[bucketIndex] = newEntry;
		} else {
			Entry<K, V> previous = null;
			Entry<K, V> current = table[bucketIndex];
			
			while(current != null) {
				if(current.key.equals(newKey)) {
					if(previous == null) {
						newEntry.next = current.next;
						table[bucketIndex] = newEntry;
						return table[bucketIndex].value;
					} else {
						newEntry.next = current.next;
						current.next = newEntry;
					}
				}
			}
			
			previous = current;
			current = current.next;
			
		}
		
		return table[bucketIndex].value;
	}
	
	static class Entry<K, V> {
		private K key;
		private V value;
		private Entry<K, V> next;

		public Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	
	public static void main(String[] args) {
		
		CustomHashMap<String, Integer> map = new CustomHashMap<>();
		map.put("Acdss", 1);
		map.put("asdfaB", 2);
		map.put("aSDC", 3);
		map.put("DADA", 4);
		System.out.println(map.put("AWQWcd", 5));
		
	}
}
