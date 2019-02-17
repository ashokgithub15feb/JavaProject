package com.ds.doublylinkedlist;

public class DoublyLinkedList {

	public static void main(String[] args) {
		
		DoublyLinkedListImpl list = new DoublyLinkedListImpl();
		
		int val1 = 10;
		int val2 = 20;
		int val3 = 30;
		int val4 = 40;
		
		//----------------Insert At Start--------------------------
		list.insertAtStart(val1);
		list.display();
		list.insertAtStart(val2);
		list.display();
		list.insertAtStart(val3);
		list.display();
		list.insertAtStart(val4);
		list.display();

		//----------------Insert At End--------------------------
		int val5 = 50;
		int val6 = 60;
		
		list.insertAtEnd(val5);
		list.display();
		list.insertAtEnd(val6);
		list.display();
		
		//----------------Insert At Position--------------------------
		
		int val7 = 70;
		int pos = 4;
		list.insertAtPos(val7, pos);
		list.display();
		
		//----------------Delete At Position--------------------------
		int delFirstPos = 1;
		int delLastPos = 6;
		int delMiddlePos4 = 4;
		int delMiddlePos3 = 3;
		int delMiddlePos2 = 2;
		int delMiddlePos1 = 1;
		list.deleteAtPos(delFirstPos);
		list.display();
		list.deleteAtPos(delLastPos);
		list.display();
		list.deleteAtPos(delMiddlePos4);
		list.display();
		list.deleteAtPos(delMiddlePos3);
		list.display();
		list.deleteAtPos(delMiddlePos2);
		list.display();
		list.deleteAtPos(delMiddlePos1);
		list.display();
		
		System.out.println("Size="+list.getSize());
		
		/*
		    10
			20<->10
			30<->20<->10
			40<->30<->20<->10
			40<->30<->20<->10<->50
			40<->30<->20<->10<->50<->60
			40<->30<->20<->70<->10<->50<->60
			30<->20<->70<->10<->50<->60
			30<->20<->70<->10<->50
			30<->20<->70<->50
			30<->20<->50
			30<->50
			50
			Size=1
		 */
		
	}
}

class DoublyLinkedListImpl
{
	Node start;
	Node end;
	int size;
	
	DoublyLinkedListImpl()
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
			start = nptr;
			end = nptr;
		}
		else
		{
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
			start = nptr;
			end = nptr;
		}
		else
		{
			end.next = nptr;
			nptr.prev = end;
			end = nptr;
		}
		size++;
	}
	
	public void insertAtPos(int val, int pos)
	{
		Node nptr = new Node(val, null, null);
		
		Node ptr = start;
		pos = pos - 1;
		
		if(pos == 1)
		{
			insertAtStart(val);
			return;
		}
		
		for(int i =1; i<size; i++)
		{
			if(i == pos)
			{
				Node tmp = ptr.next;
				ptr.next = nptr;
				nptr.prev = ptr;
				nptr.next = tmp;
				tmp.prev = nptr;
				break;
			}
			ptr = ptr.next;
		}
		size++;
	}
	
	public void deleteAtPos(int pos)
	{
		if(start != null && pos == 1)
		{
			if(size  == 1)
			{
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
		
		if(pos == size)
		{
			Node s = start;
			Node t = start;
			
			while(s != end)
			{
				t = s;
				s = s.next;
			}
			
			end = t;
			t.next = null;
			size--;
			return;
		}
		
		if(pos == size)
		{
			end = end.prev;
			end.next = null;
			size--;
			return;
		}
		
		Node ptr = start;
		pos = pos - 1;
		
		for(int i=1; i<size-1; i++)
		{
			if(i == pos)
			{
				Node tmp = ptr.next.next;
				ptr.next = tmp;
				size--;
				break;
			}
			ptr = ptr.next;
		}
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void display()
	{
		if(size ==0)
		{
			System.out.print("Doubly Linked List Emplty\n");
			return;
		}
		
		if(size ==1)
		{
			System.out.println(start.data);
			return;
		}
		
		Node ptr = start;
		
		while(ptr.next != null)
		{
			System.out.print(ptr.data+"<->");
			ptr = ptr.next;
		}
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

