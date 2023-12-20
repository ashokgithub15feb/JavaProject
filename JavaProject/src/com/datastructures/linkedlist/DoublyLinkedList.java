package com.datastructures.linkedlist;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

class Node {
	int data;
	Node next;
	Node prev;

	public Node() {
		this.data = 0;
		this.next = null;
		this.prev = null;
	}

	public Node(int data, Node next, Node prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
}

public class DoublyLinkedList {

	Node start;
	Node end;
	int size;

	public DoublyLinkedList() {
		start = null;
		end = null;
		size = 0;
	}

	public boolean isEmpty() {
		return start == null;
	}
	
	public void insertAtStart(int data) {
		Node nptr = new Node(data, null, null);
		
		if(start == null) {
			start = nptr;
			end = nptr;
		}
		else {
			start.prev = nptr;
			nptr.next = start;
			start = nptr;
		}
		size++;
	}
	
	public void insertAtEnd(int data) {
		Node nptr = new Node(data, null, null);
		
		if(start == null) {
			start = nptr;
			end = nptr;
		}
		else {
			end.next = nptr;
			nptr.prev = end;
			end = nptr;
		}
		size++;
	}
	
	public void insertAtPos(int data, int pos) {
		Node nptr = new Node(data, null, null);
		
		if(pos == 1) {
			
			insertAtStart(data);
			return;
		}
		
		Node ptr = start;
		
		for(int i = 2; i <= size; i++) {
			if(i == pos) {
				
				Node temp = ptr.next;
				ptr.next = nptr;
				nptr.prev = ptr;
				nptr.next = temp;
				temp.prev = nptr;
			}
			ptr = ptr.next;
		}
		size++;
	}
	
	public void sortedLinkedListInsert(int data) {
		Node nptr = new Node(data, null, null);
		Node temp = null;
		Node ptr = null;
		
		boolean ins = false;
		
		if(start == null) {
			start = nptr;
		}
		else if(data <= start.data) {
			nptr.next = start;
			start.prev = nptr;
			start = nptr;
		}
		else {
			temp = start;
			ptr = start.next;
			
			while(ptr != null) {
				
				if(data >= temp.data && data <= ptr.data) {
					nptr.prev = temp;
					temp.next = nptr;
					nptr.next = ptr;
					ptr.prev = nptr;
					ins = true;
					break;
				}
				else {
					temp = ptr;
					ptr = ptr.next;
				}
			}
			
			if(!ins) {
				temp.next = nptr;
				nptr.prev = temp;
			}
		}
		size++;
	}
	public void display() {
		if(size == 0) {
			System.out.println("Empty");
			return;
		}
		
		Node ptr = start;
		
		while(ptr != null) {
			System.out.print(ptr.data+"->");
			ptr = ptr.next;
		}
		System.out.println();
	}
	
	
	public void deleteAtPos(int pos) {
		
		if(pos == 1) {
			if(size == 1) {
				start = null;
				end = null;
				size = 0;
				return;
			}
			start = start.next;
			start.prev = null;
			size--;
			return;
		}
		
		if(pos == size) {
			end = end.prev;
			end.next = null;
			size--;
			return;
		}
		
		Node ptr = start.next;
		
		for(int i = 2; i< size; i++) {
			if(i == pos) {
				Node p = ptr.prev;
				Node n = ptr.next;
				
				p.next = n;
				n.prev = p;
				
				size--;
				return;
			}
			ptr = ptr.next;
		}
	}
	public static void main(String[] args) {
		
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.insertAtStart(10);
		doublyLinkedList.insertAtStart(20);
		doublyLinkedList.insertAtStart(30);
		doublyLinkedList.insertAtStart(40);
		doublyLinkedList.display();
		doublyLinkedList.insertAtEnd(50);
		doublyLinkedList.insertAtEnd(60);
		doublyLinkedList.display();
		doublyLinkedList.insertAtPos(70, 4);
		doublyLinkedList.display();
		doublyLinkedList.deleteAtPos(1);
		doublyLinkedList.display();
		doublyLinkedList.deleteAtPos(doublyLinkedList.size);
		doublyLinkedList.display();
		doublyLinkedList.deleteAtPos(4);
		doublyLinkedList.display();
		
		/*
		   40->30->20->10->
		   40->30->20->10->50->60->
		   40->30->20->70->10->50->60->
		   30->20->70->10->50->60->
		   30->20->70->10->50->
		   30->20->70->50->
		 */
		
		System.out.println("==========================");
		doublyLinkedList.sortedLinkedListInsert(10);
		doublyLinkedList.sortedLinkedListInsert(20);
		doublyLinkedList.sortedLinkedListInsert(5);
		doublyLinkedList.sortedLinkedListInsert(15);
		doublyLinkedList.sortedLinkedListInsert(40);
		doublyLinkedList.sortedLinkedListInsert(55);
		doublyLinkedList.sortedLinkedListInsert(50);
		doublyLinkedList.sortedLinkedListInsert(30);
		doublyLinkedList.display();
		
		List<Integer> list = Arrays.asList(2, 3, 4, 5,3, 5,7,8);
		Optional<Integer> res=list.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		        .entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).findFirst();
		if(res.isPresent()){
		    System.out.println(res.get()); }
	}
}
