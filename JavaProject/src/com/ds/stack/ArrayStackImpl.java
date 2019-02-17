package com.ds.stack;

public class ArrayStackImpl {

	private int[] a;
	private int top;
	private int size;
	private int len;
	
	public ArrayStackImpl()
	{
		a = new int[10];
		top = -1;
		len = 0;
	}
	
	public void push(int data)
	{
		top = top + 1;
		
		a[top] = data;
	}
	
	public void pop()
	{
		top = top - 1;
	}
	
	public int top()
	{
		return a[top];
	}
	
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public void display()
	{
		for(int eachElem : a)
		{
			System.out.println(a[eachElem]);
		}
	}
	
	public static void main(String[] args) {
		ArrayStackImpl s = new ArrayStackImpl();
		s.push(10);
		s.push(40);
		s.push(20);
		s.pop();
		System.out.println(s.top());
		System.out.println(s.isEmpty());
		s.pop();
		System.out.println(s.top());
	}
}
