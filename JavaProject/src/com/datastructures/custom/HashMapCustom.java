package com.datastructures.custom;

public class HashMapCustom<K, V> {

	private Entry<K, V>[] table;
	private int capacity = 16;
	
	@SuppressWarnings("unchecked")
	public HashMapCustom() {
		this.table = new Entry[capacity];
	}
	
	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;
		
		public Entry(K  key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	
	public int hash(K key) {
		return Math.abs(key.hashCode()) % capacity;
	}
	
	public void put(K newKey, V data) {
		if(newKey == null) {
			return;
		}
		int bucketIndex = hash(newKey);
		Entry<K, V> newEntry = new Entry<K, V>(newKey, data, null);
		
		if(table[bucketIndex] == null) {
			table[bucketIndex] = newEntry;
		}
		else {
			Entry<K, V> previous = null;
			Entry<K, V> current = table[bucketIndex];
			
			while(current != null) {
				if(current.key.equals(newKey)) {
					if(previous == null) {
						newEntry.next = current.next;
						table[bucketIndex] = newEntry;
						return;
					}
					else {
						newEntry.next = current.next;
						previous.next = newEntry;
						return;
					}
				}
				previous = current;
				current = current.next;
			}
			previous.next = newEntry;
		}
	}
	
	
	public V get(K newKey) {
		if(newKey == null) {
			return null;
		}
		
		int hash = hash(newKey);
		
		if(table[hash] == null) {
			return null;
		}
		else {
			Entry<K, V> entry = table[hash];
			
			while(entry != null) {
				if(entry.key.equals(newKey)) {
					return entry.value;
				}
				entry = entry.next;
			}
			
			return null;
		}
	}
	public static void main(String[] args) {
		
		HashMapCustom<Integer, Integer> map = new HashMapCustom<>();
		map.put(21, 12);
		map.put(25, 121);
		map.put(30, 51);
		map.put(33, 15);
		map.put(35, 89);
		map.put(30, 51);
		
		map.display();
		
		System.out.println("\nValue : "+map.get(21));
		System.out.println("Remove: "+map.remove(21));
		map.display();
	}
	
	public boolean remove(K deleteKey) {
		int hash = hash(deleteKey);
		
		if(table[hash] == null) {
			return false;
		}
		else {
			Entry<K, V> previous = null;
			Entry<K, V> current = table[hash];
			
			while(current != null) {
				if(current.key.equals(deleteKey)) {
					if(current != null) {
						if(previous == null) {
							table[hash] = table[hash].next;
							return true;
						}
						else {
							previous.next = current.next;
							return true;
						}
					}
				}
				previous = current;
				
				current = current.next;
			}
			return false;	
		}
	}

	public void display() {
		for(int i= 0; i < capacity; i++) {
			if(table[i] != null) {
				Entry<K, V> entry = table[i];
				
				while(entry != null) {
					System.out.print("{ "+entry.key+" = "+entry.value+"}");
					entry = entry.next;
				}
			}
		}
	}
	
	public void displayKey() {
		for(int i= 0; i < capacity; i++) {
			if(table[i] != null) {
				Entry<K, V> entry = table[i];
				
				while(entry != null) {
					System.out.print(entry.key+" ");
					entry = entry.next;
				}
			}
		}
	}
	
	public boolean contains(K key) {
		return containsKey(key);
	}
	
	public boolean containsKey(K key) {
		int hash = hash(key);
		
		if(table[hash] == null) {
			return false;
		}
		else {
			Entry<K, V> entry = table[hash];
			
			while(entry != null) {
				if(entry.key.equals(key)) {
					return true;
				}
				entry = entry.next;
			}
		}
		return false;
	}
}
