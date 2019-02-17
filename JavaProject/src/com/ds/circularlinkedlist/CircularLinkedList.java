package com.ds.circularlinkedlist;

public class CircularLinkedList {

	public static void main(String[] args) {
		
		CircularLinkedListImpl list = new CircularLinkedListImpl();
		
		int val1 = 10;
		int val2 = 20;
		int val3 = 30;
		int val4 = 40;
		
		list.insertAtStart(val1);
		list.display();
		list.insertAtStart(val2);
		list.display();
		list.insertAtStart(val3);
		list.display();
		list.insertAtStart(val4);
		list.display();
		
		int val5 = 50;
		list.insertAtEnd(val5 );
		list.display();
		
		int val6 = 60;
		int pos = 4;
		list.insertAtPos(val6, pos);
		list.display();
		
		int delFirstPos = 1;
		list.deleteAtPos(delFirstPos);
		list.display();
		int delMaxSizePos = 5;
		list.deleteAtPos(delMaxSizePos);
		list.display();
		int delMiddlePos = 3;
		list.deleteAtPos(delMiddlePos);
		list.display();
	}
	
}

class CircularLinkedListImpl
{
	Node start;
	Node end;
	int size;
	
	public CircularLinkedListImpl()
	{
		start = null;
		end = null;
		size = 0;
	}
	
	public void insertAtStart(int val)
	{
		Node nptr = new Node(val, null);
		nptr.link = start;
		
		if(start == null)
		{
			start = nptr;
			nptr.link = start;
			end = start;
		}
		else
		{
			start.link = nptr;
			start = nptr;
		}
		size++;
	}
	
	public void insertAtEnd(int val)
	{
		Node nptr = new Node(val, null);
		nptr.link = start;
		
		if(start == null)
		{
			start = nptr;
			nptr.link = start;
			end = start;
		}
		else
		{
			end.link = nptr;
			end = nptr;
		}
		size++;
	}
	
	
	public void insertAtPos(int val, int pos)
	{
		Node nptr = new Node(val, null);
		
		Node ptr = start;
		pos = pos - 1;
		for(int i=1; i<size; i++)
		{
			if(i == pos)
			{
				Node tmp = ptr.link;
				ptr.link = nptr;
				nptr.link = tmp;
				break;
			}
			
			ptr = ptr.link;
		}
		size++;
	}
	
	
	public void deleteAtPos(int pos)
	{
		if(size == 1 && pos == 1)
		{
			start = null;
			end = null;
			size = 0;
			return;
		}
		
		if(pos == 1)
		{
			start = start.link;
			end.link = start;
			size--;
			return;
		}
		
		if(pos == size)
		{
			Node s = start;
			Node t = start;
			
			if(s != end)
			{
				t = s;
				s = s.link;
			}
			
			end = t;
			end.link = start;
			size--;
			return;
		}
		
		Node ptr = start;
		pos = pos - 1;
		
		for(int i=1; i<size ;i++)
		{
			if(i == pos)
			{
				Node tmp = ptr.link;
				tmp = tmp.link;
				ptr.link = tmp;
				break;
			}
			
			ptr = ptr.link;
		}
		size--;
	}
	
	public void display()
	{
		if(size == 0)
		{
			System.out.print("\n");
			return;
		}
		
		Node ptr = start;
		
		if(start.link == start)
		{
			System.out.print(start.data+"->"+ptr.data+"\n");
			return;
		}
		
		System.out.print(start.data+"->");
		ptr = start.link;
		
		while(ptr.link != start)
		{
			System.out.print(ptr.data+"->");
			ptr = ptr.link;
		}
		
		System.out.print(ptr.data+"->");
		ptr = ptr.link;
		System.out.print(ptr.data+"\n");
	}
	
	
}

class Node
{
	int data;
	Node link;
	
	Node()
	{
		data = 0;
		link = null;
	}
	
	Node(int d, Node n)
	{
		data = d;
		link = n;
	}
}