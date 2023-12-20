package com.datastructures.blackrock.lru.hm;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	private Map<Integer, Node> map;
	private int capacity;
	private int size;
	private Node head;
	private Node tail;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.map = new HashMap<Integer, Node>();
		this.size = 0;
		this.head = null;
		this.tail = null;
	}
	
	public void put(int key, int value) {
		System.out.println("Key = "+key+", Value = "+value);
		
		if(!map.containsKey(key)) {
			Node nptr = new Node(key, value);
			map.put(key, nptr);
			
			if(size < capacity) {
				if(head == null) {
					head = nptr;
					tail = nptr;
				}
				else {
					nptr.next = head;
					head.prev = nptr;
					head = nptr;
				}
				size++;
			}
			else {
				map.remove(tail.key);
				if(tail.prev != null) {
					tail.prev.next = null;
					tail = tail.prev;
				}
				else {
					head = nptr;
					tail = nptr;
				}
				
				nptr.next = head;
				head.prev = nptr;
				head = nptr;
			}
		} else {
				Node node = map.get(key);
				node.value = value;
				moveToHead(node);
		}
	}
	
	public int get(int key) {
		System.out.println("Get Key = "+key);
		if(map.containsKey(key)) {
			Node node = map.get(key);
			moveToHead(node);
			return node.value;
		}
		else {
			return -1;
		}
	}

	private void moveToHead(Node node) {
		if(node == null) {
			return;
		}
		
		if(node == tail) {
			tail = node.prev;
			tail.next = null;
		}
		else {
			node.prev.next = node.next;
			node.next.prev = node.prev;
		}
		
		node.next = head;
		head.prev = node;
		head = node;
		node.prev = null;
	}
	
}
