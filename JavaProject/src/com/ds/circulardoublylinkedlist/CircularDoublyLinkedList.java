package com.ds.circulardoublylinkedlist;

public class CircularDoublyLinkedList {

	public static void main(String[] args) {
		
		CircularDoublyLinkedListImpl list = new CircularDoublyLinkedListImpl();
		
		int val1 = 10;
		int val2 = 20;
		int val3 = 30;
		int val4 = 40;
		
		list.insertAtStart(val1 );
		list.displa();
		list.insertAtStart(val2 );
		list.displa();
		list.insertAtStart(val3 );
		list.displa();
		list.insertAtStart(val4 );
		list.displa();
		
		int val5 = 50;
		list.insertAtEnd(val5);
		list.displa();
		
		int val6 = 60;
		int pos = 4;
		list.insertAtPos(val6, pos);
		list.displa();
		
		int delFirstPos = 1;
		int delMaxSizePos = 5;
		int delMiddlePos = 3;
		
		list.deleteAtPos(delFirstPos);
		list.displa();
		list.deleteAtPos(delMaxSizePos);
		list.displa();
		list.deleteAtPos(delMiddlePos);
		list.displa();
		
	}
}

class CircularDoublyLinkedListImpl
{
	Node start;
	Node end;
	int size;
	
	CircularDoublyLinkedListImpl()
	{
		start = null;
		end = null;
		size = 0;
	}
	
	public void insertAtStart(int val)
	{
		Node nptr = new Node(val, null, null);
		
		if(start == null)
		{
			nptr.next = nptr;
			nptr.prev = nptr;
			start = nptr;
			end = nptr;
		}
		else
		{
			nptr.prev = end;
			end.next = nptr;
			start.prev = nptr;
			nptr.next = start;
			start = nptr;
		}
		size++;
	}
	
	public void insertAtEnd(int val)
	{
		Node nptr = new Node(val, null, null);
		
		if(start == null)
		{
			nptr.next = nptr;
			nptr.prev = nptr;
			start = nptr;
			end = nptr;
		}
		else
		{
			nptr.prev = end;
			end.next = nptr;
			nptr.next = start;
			start.prev = nptr;
			end = nptr;
		}
		size++;
	}
	
	public void insertAtPos(int val, int pos)
	{
		Node nptr = new Node(val, null, null);
		
		Node ptr = start;
		
		pos = pos - 1;
		
		for(int i =1; i<size ; i++)
		{
			if(i == pos)
			{
				Node tmp = ptr.next;
				ptr.next = nptr;
				nptr.prev = ptr;
				nptr.next = tmp;
				tmp.prev = nptr;
			}
			ptr = ptr.next;
		}
		size++;
	}
	
	public void deleteAtPos(int pos)
	{
		if(pos == 1)
		{
			if(size == 1)
			{
				start = null;
				end = null;
				size=0;
				return;
			}
			
			start = start.next;
			start.prev = null;
			end.next = start;
			size--;
			return;
		}
		
		if(pos == size)
		{
			end = end.prev;
			end.next = start;
			start.prev = end;
			size--;
		}
		
		Node ptr = start;
		pos = pos - 1;
		
		for(int i=1; i<size ; i++)
		{
			if(i == pos)
			{
				Node tmpPrev = ptr.prev;
				Node tmpNext = ptr.next;
				
				tmpNext.next = tmpPrev;
				tmpPrev.prev = tmpNext;
				size--;
				return;
				
			}
			ptr = ptr.next;
		}
	}
	
	public void displa()
	{
		if(size == 0)
		{
			System.out.println("Doubly Circular Linked List Empty\n");
			return;
		}
		
		Node ptr = start;
		
		if(start.next == start)
		{
			System.out.print(start.data+"<->"+ptr.data+"\n");
			return;
		}
		
		System.out.print(start.data+"<->");
		ptr = ptr.next;
		
		while(ptr.next != start)
		{
			System.out.print(ptr.data+"<->");
			ptr = ptr.next;
		}
		
		System.out.print(ptr.data+"<->");
		ptr = ptr.next;
		System.out.print(ptr.data+"\n");
	}
}

class Node
{
	int data;
	Node next;
	Node prev;
	
	Node()
	{
		data = 0;
		next = null;
		prev = null;
	}
	
	Node(int d, Node n, Node p)
	{
		data = d;
		next = n;
		prev = p;
	}
}