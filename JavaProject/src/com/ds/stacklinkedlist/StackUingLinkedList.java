package com.ds.stacklinkedlist;

public class StackUingLinkedList {

	public static void main(String[] args) {
		
		StackUsingLinkedListImpl stack = new StackUsingLinkedListImpl();
		
		int val1 = 10;
		int val2 = 20;
		int val3 = 30;
		int val4 = 40;
		
		stack.push(val1 );
		stack.display();
		stack.push(val2 );
		stack.display();
		stack.push(val3 );
		stack.display();
		stack.push(val4 );
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println();
		stack.display();
		System.out.println("Stack Size: "+stack.size);
	}
}

class StackUsingLinkedListImpl
{
	Node top;
	int size;
	
	StackUsingLinkedListImpl()
	{
		top = null;
		size = 0;
	}
	
	public void push(int val)
	{
		Node nptr = new Node(val, null);
		
		if(top == null)
		{
			top = nptr;
		}
		
		else
		{
			nptr.link = top;
			top = nptr;
		}
		
		size++;
	}
	
	public int pop()
	{
		if(top == null)
		{
			System.out.println("No Sunch Element present in Stack");
		}
		
		Node ptr = top;
		
		top = ptr.link;
		size--;
		return ptr.data;
	}
	
	public void display()
	{
		if(size == 0)
		{
			System.out.print("Stack is Empty\n");
		}
		
		Node ptr = top;
		
	while(ptr != null)
	{
		System.out.println(ptr.data);
		ptr = ptr.link;
	}
	System.out.println();
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