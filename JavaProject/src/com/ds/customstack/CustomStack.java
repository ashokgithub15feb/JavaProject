package com.ds.customstack;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CustomStack<E> {

	private int top;
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] element;
	
	public CustomStack() {
		element = new Object[DEFAULT_CAPACITY];
	}
	
	public void push(E e)
	{
		if(isFull())
		{
			System.out.println("Stack Overflow - > Increase the memory size of Array");
			ensureCapacity();
		}
		
		element[top++] = e;
	}
	
	@SuppressWarnings("unchecked")
	public E pop()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Stack Underflow Excetuion");
		}
		
		E e = (E) element[--top];
		
		element[top] = null;
		
		return e;
	}

	@SuppressWarnings("unchecked")
	public E peek()
	{
		int len  = size();
		if(len == 0)
		{
			System.out.println("Stack Underflow");
		}
		
		E e  = (E)element[len-1];
		return e;
	}
	
	public int size()
	{
		return top;
	}
	
	public boolean isEmpty()
	{
		return top == 0;
	}
	
	private void ensureCapacity() {
		
		int newSize = element.length * 2; //taken Array size and multiply by 2
		
		element = Arrays.copyOf(element, newSize);
	}
	
	public boolean isFull()
	{
		return top == element.length;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		for(int i=0; i<top; i++)
		{
			sb.append(element[i].toString());
			
			if(i < top -1 )
			{
				sb.append(",");
			}
		}
		
		sb.append("]");
		
		return sb.toString();
		
	}
}
