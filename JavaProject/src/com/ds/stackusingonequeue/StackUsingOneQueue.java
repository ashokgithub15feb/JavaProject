package com.ds.stackusingonequeue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {

	private Queue<Integer> q = new LinkedList<>();

	public static void main(String[] args) {
		
		StackUsingOneQueue stack = new StackUsingOneQueue();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.display();
		
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.display();
	}
	
	public void push(int data)
	{
		
		q.add(data);
		
		int size = q.size();
		
		while(size > 1)
		{
			Integer remove = q.remove();
			
			q.add(remove);
			size--;
		}
	}
	
	public void display() {
		System.out.println(q);
	}
	
	public void pop()
	{
		if(q.isEmpty())
		{
			System.out.println("underflow");
		}
		System.out.print(q.remove()+" ");
	}
}
