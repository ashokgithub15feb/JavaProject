package com.ds.stack;

import java.util.NoSuchElementException;

public class ArrayStack {

	private int[] arr;
	private int top;
	private int size;
	private int len;
	
	public ArrayStack(int n)
	{
		this.size = n;
		len       = 0;
		arr       = new int[size];
		top       = -1;
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public boolean isFull()
	{
		return top == size-1;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Underflow Exception");
		}
		
		return arr[top];
	}
	
	public int getSize()
	{
		return len;
	}
	
	public void push(int data)
	{
		if(top + 1 >= size)
		{
			throw new IndexOutOfBoundsException("Overflow Exception");
		}
		
		top = top +1;
		
		arr[top] = data;
		len++;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Underflow Exception");
		}
		
		len--;
		
		return arr[top--];
	}
	
	public void reverseOfStack()
	{
		if(len > 0)
		{
			int x = this.peek();
			this.pop();
			reverseOfStack();
			
			insertAtBottom(x);
		}
	}
	
	
	private void insertAtBottom(int x) {
		
		if(this.isEmpty())
		{
			this.push(x);
		}
		else
		{
			int peekx = this.peek();
			this.pop();
			insertAtBottom(peekx);
			
			this.push(peekx);
		}
		
	}

	public void display()
	{
		System.out.print("\nStack = ");
		if(len == 0)
		{
			System.out.print("\nEmpty");
			return;
		}
		
		for(int i=top; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
