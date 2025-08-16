package com.interviews.companies.siemens;

public class LinkedList {

	private Node start;
	private Node end;
	private int size;
	
	public LinkedList() {
		this.start = null;
		this.end = null;
		this.size = 0;
	}
	
	public void insertAtStart(int value) {
		
		Node nptr = new Node(value, null);
		size++;
		
		if(start == null) {
			start = nptr;
			end = nptr;
		}
		else {
			nptr.next = start;
			start = nptr;
		}
	}
	
	public void insertAtEnd(int value) {
		Node nptr = new Node(value, null);
		size++;
		
		if(start == null) {
			start = nptr;
			end = nptr;
		} else {
			end.next = nptr;
			end = nptr;
		}
	}
	
	public void insertAtPosition(int position, int value) {
		Node nptr = new Node(value, null);
		
		//start=1 -> a1=2 -> b2=3 -> c3=4 -> d4=null -> null end=4
		//position 3 - start=1 -> a1=2 -> b2=5 -> e5=3 -> c3=4 -> d4=null -> null end=4
		
		position = position - 1; // 3-1=2
		Node ptr = start;
		for(int i=1; i < size; i++) {
			
			if(i == position) {
				
				Node temp = ptr.next; //ptr=4
				nptr.next = temp; //nptr=4
				ptr.next = nptr; //ptr=5
				break;
				
			}
			
			ptr = ptr.next;
		}
		size++;
	}
	
	public void deleteAtPosition(int position) {
		
		if(position == 1) {
			start = start.next;
			size--;
		}
		
		if(position == size) {
			
			Node s = start;
			Node t = start;
			
			while(s != null && s.next != null) {
				t = s;
				s = s.next;
			}
			
			end = t;
			end.next = null;
			size--;
			return;
		}
		
		Node ptr = start;
		position = position - 1;
		for(int i=1; i< size ; i++) {
			if(i == position) {
				Node temp = ptr.next;
				temp = temp.next;
				ptr.next = temp;
				size--;
				break;
			}
			
			ptr = ptr.next;
		}
	}
	
	public void display() {
		
		if(size == 0) {
			System.out.println("Empty Linked List");
			return;
		}
		
		Node current = start;
		while(current != null) {
			System.out.print(current.data+"->");
			current = current.next;
		}
		System.out.println(""+null);
		
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtStart(10);
		list.insertAtStart(20);
		list.insertAtStart(30);
		list.insertAtEnd(70);
		list.display();
		
		int position = 3;
		list.insertAtPosition(position, 80);
		list.display();
		list.insertAtPosition(position, 100);
		list.display();
		
		position = 1;
		
		list.deleteAtPosition(position);
		list.display();
		
		position = list.size;
		
		list.deleteAtPosition(position);
		list.display();
		
		position = 3;
		list.deleteAtPosition(position);
		list.display();
		
		System.out.println("LinkedList Size: "+list.size);
	}
}
