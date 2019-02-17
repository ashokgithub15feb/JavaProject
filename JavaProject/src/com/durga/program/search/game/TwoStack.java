package com.durga.program.search.game;

public class TwoStack {

	private int size;
	private int top1;
	private int top2;
	private int[] arr;
	
	public TwoStack(int n)
	{
		arr = new int[n];
		size = n;
		top1 = -1;
		top2 = size;
	}
	
	public void push1(int data)
	{
		if(top1 < top2-1)
		{
			top1++;
			arr[top1] = data;
		}
		else
		{
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}
	
	public void push2(int data)
	{
		if(top1 < top2-1)
		{
			top2--;
			arr[top2] = data;
		}
		else
		{
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}
	
	public int pop1()
	{
		if(top1 >= 0)
		{
			int x = arr[top1];
			top1--;
			return x;
		}
		else
		{
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return 0;
	}
	
	public int pop2()
	{
		if(top2 < size)
		{
			int data = arr[top2];
			top2++;
			return data;
		}
		else
		{
			System.out.println("Statc Underflow");
			System.exit(1);
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		TwoStack stack = new TwoStack(5);
		System.out.println("Data push in stack");
		stack.push1(5);
		stack.push2(10);
		stack.push2(15);
		stack.push1(11);
		stack.push2(7);
		
		System.out.println("Popped Element from: "+" stack1 is: "+stack.pop1());
		
		stack.push2(40);
		
		System.out.println("Popped Element from: "+" stack2 is: "+stack.pop2());
		
	}
	
}
