package com.ds.linkedlist;

public class SinglyLinkedList {

	public static void main(String[] args) {
		
		int val1 = 10;
		int val2 = 20;
		int val3 = 30;
		int val65 = 30;
		int val66 = 322;
		
		
		//--------------Insert at start--------------------
		LinkedListImpl list = new LinkedListImpl();
		list.display();
		list.insertAtStart(val1);
		list.display();
		list.insertAtStart(val2);
		list.display();
		list.insertAtStart(val3);
		list.insertAtStart(val65);
		list.insertAtStart(val66);
		
		list.display();
		
		//--------------Insert at end--------------------
		int val4 = 40;
		int val5 = 50;
		
		list.insertAtEnd(val4);
		list.display();
		list.insertAtEnd(val5);
		list.display();
		
		//--------------Insert at position--------------------
		int val6 = 60;
		int pos = 4;
		
		list.insertAtPos(val6, pos);
		list.display();
		
		//--------------deletion at position--------------------
		
//		int delPosFirst = 1;
//		int delPosLast = 5;
//		int delPosMiddle = 4;
//		int delPosMiddle3 = 3;
//		int delPosMiddle4 = 2;
//		
//		
//		list.deleteAtPos(delPosFirst);
//		list.display();
//		list.deleteAtPos(delPosLast);
//		list.display();
//		list.deleteAtPos(delPosMiddle);
//		list.display();
//		list.deleteAtPos(delPosMiddle3);
//		list.display();
//		list.deleteAtPos(delPosMiddle4);
		list.display();
		
	 /*
		Empty Singly Linked List
		10
		20->10
		30->20->10
		30->20->10->40
		30->20->10->40->50
		30->20->10->60->40->50
		20->10->60->40->50
		20->10->60->40
		20->10->60
		20->10
		20 
	 */
		
		list.reverse();
		
		list.middle();
		
		System.out.println("Searched Element: "+list.search(2000));
	}
}

class Node
{
	int data;
	Node link;
	
	Node()
	{
		link = null;
		data  = 0;
	}
	
	Node(int d, Node n)
	{
		data = d;
		link = n;
	}
}

class LinkedListImpl
{
	Node start;
	Node end;
	int size;
	
	LinkedListImpl()
	{
		start = null;
		end = null;
		size = 0;
	}
	
	public void insertAtStart(int val)
	{
		Node nptr = new Node(val, null);
		size++;
		
		//first node - value = 10 and link = null;
		if(start == null)
		{
			start = nptr;
			end = nptr;
		}
		//second node - value = 20 and link = null;
		else
		{
			nptr.link=start;
			start = nptr;
		}
	}
	
	public int search(int search)
	{
		Node ptr = start;
		
		while(ptr != null)
		{
			if(ptr.data == search)
			{
				return ptr.data;
			}
			ptr = ptr.link;
		}
		
		
		return 0;
	}
	
	public void removeCycleFromLinkedList()
	{
		
	}
	
	public void reverse()
	{
		reverse(start);
	}
	
	public void reverse(Node node)
	{
		if(node == null)
		{
			return;
		}
		
		reverse(node.link);
		
		System.out.print(node.data+" ");
	}
	
	public void reverseMenual()
	{
		reverseMenual(start);
	}
	
	public void reverseMenual(Node start)
	{
		Node current = start;
		Node prev = null;
		Node next = null;
		
		while(current.link != null)
		{
			next = current.link;
			current.link = prev;
			prev = current;
			current = next;
		}
		
		next = prev;
	}
	
	public void middle()
	{
		Node current = start;
		  int length = 0;
		  Node middle = start;

		  while(current.link != null){
			  
		      length++;
		      if(length%2 ==0){
		          middle = middle.link;
		      }
		      current = current.link;
		  }

		  if(length%2 == 1){
		      middle = middle.link;
		  }

		  System.out.println("length of LinkedList: " + length);
		  System.out.println("middle element of LinkedList : " + middle.data);
	}
	
	public void insertAtEnd(int val)
	{
		Node nptr = new Node(val, null);
		size++;
		
		//check existing linked list contain any data or not
		if(start == null)
		{
			start = null;
			end = null;
		}
		//if contain the insert at end of the linked list
		else
		{
			end.link = nptr;
			end = nptr;
		}
	}
	
	public void insertAtPos(int val, int pos)
	{
		Node nptr = new Node(val, null);
		size++;
		
		Node ptr = start;
		pos = pos - 1;

		for(int i=1; i<size ; i++)
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
	}
	
	public void deleteAtPos(int pos)
	{
		if(pos == 1)
		{
			start = start.link;
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
				s = s.link;
			}
			end = t;
			end.link = null;
			size--;
			return;
		}
		Node ptr  = start;
		pos = pos - 1;
		for(int i=1; i<size-1;i++)
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
			System.out.print("Empty Singly Linked List\n");
			return;
		}
		
		if(start.link == null)
		{
			System.out.println(start.data);
			return;
		}
		
		Node ptr = start;
		
		System.out.print(start.data+"->");
		
		ptr = start.link;
		
		while(ptr.link != null)
		{
			System.out.print(ptr.data+"->");
			ptr = ptr.link;
		}
		System.out.print(ptr.data+"\n");
	}
}



















