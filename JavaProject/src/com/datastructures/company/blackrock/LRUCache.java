package com.datastructures.company.blackrock;

import java.util.HashMap;
import java.util.Map;

class NodeLRU {
	int key;
	int value;
	NodeLRU prev;
	NodeLRU next;
	
	public NodeLRU(int key, int value) {
		this.key = key;
		this.value = value;
	}
}
public class LRUCache {

	private Map<Integer, NodeLRU> map;
	private int capacity;
	private int size;
	private NodeLRU head;
	private NodeLRU tail;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.map = new HashMap<Integer, NodeLRU>();
		this.size = 0;
		this.head = null;
		this.tail = null;
	}
	
	public void put(int key, int value) {
		
		if(!map.containsKey(key)) {
			
			NodeLRU nptr = new NodeLRU(key, value);
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
			NodeLRU node = map.get(key);
			node.value = value;
			moveToHead(node);
		}
	}

	private void moveToHead(NodeLRU node) {
		
		if(node == null) {
			return;
		}
		
		if(node == tail) {
			tail = tail.prev;
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
	
	public int get(int key) {
		
		if(map.containsKey(key)) {
			NodeLRU node = map.get(key);
			moveToHead(node);
			return node.value;
		}
		else {
			return -1;
		}
	}
	
	public void dispaly() {
		
		if(head == null) {
			System.out.println("Empty");
			return;
		}
		
		NodeLRU temp = head;
		
		while(temp != null) {
			System.out.println(temp.key+":"+temp.value);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		LRUCache c = new LRUCache(3);
		c.put(1, 1);
		
		c.put(2, 2);
		
		c.put(3, 3);
		c.dispaly();
		System.out.println(c.get(1));
		c.dispaly();
		System.out.println(c.get(2));
		c.dispaly();
		System.out.println();
		c.put(4, 4);
		c.dispaly();
		System.out.println();
		c.put(2, 20);
		c.dispaly();
	}
}
