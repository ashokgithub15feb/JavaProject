package com.ds.stackusingonequeue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {

	private Queue<Integer> q = new LinkedList<>();
	private Queue<Integer> tmp = new LinkedList<>();
	
	public static void main(String[] args) {
		
		StackUsingTwoQueue stack = new StackUsingTwoQueue();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.display();
		
		stack.pop();
		stack.pop();
		stack.pop();
		
	}
	
	public void push(int data)
	{
		int size = q.size();
		if(size == 0)
		{
			q.add(data);
		}
		else
		{
			int l = q.size();
			
			for(int i=0; i<l ; i++)
			{
				tmp.add(q.remove());
			}
			q.add(data);
			
			for(int i=0; i< l; i++)
			{
				q.add(tmp.remove());
			}
		}
	}
	
	public void display()
	{
		System.out.println(q);
	}
	
	public void pop()
	{
		if(q.size() == 0)
		{
			System.out.println("Underflow");
		}
		else
		{
			System.out.print(q.remove()+" ");
		}
	}

}

