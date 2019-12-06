package com.program.coding.round.sg2019;

import java.util.Arrays;

public class TwoStackInOneArrayImpl {

	private int size;
	private int top1;
	private int top2;
	private int[] arr;
	
	public TwoStackInOneArrayImpl(int n)
	{
		this.arr = new int[n];
		size = n;
		top1 = -1;
		top2 = size;
 	}
	
	public void push1(int x)
	{
		if(top1 < (top2-1))
		{
			top1++;
			arr[top1] = x;
		}
		else
		{
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}
	
	public void push2(int x)
	{
		if(top1 < (top2-1))
		{
			top2--;
			arr[top2] = x;
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
			arr[top1] = 0;
			top1--;
			
			return x;
		}
		else
		{
			System.out.println("Stack underflow");
			System.exit(1);
		}
		
		return 0;
	}
	
	public int pop2()
	{
		if(top2 < size)
		{
			int x = arr[top2];
			arr[top2] = 0;
			top2++;
			return x;
		}
		else
		{
			System.out.println("Stack underflow");
			System.exit(1);
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		TwoStackInOneArrayImpl stk = new TwoStackInOneArrayImpl(5);
		stk.push1(5);
		stk.push2(10);
		stk.push2(15);
		stk.push1(11);
		stk.push2(7);
		
		System.out.println("Print the Stack Array:");
		stk.printArray();
		
		System.out.println();
		
		System.out.println("Pop the item from stack-1: "+stk.pop1());
		stk.printArray();
		
		System.out.println();

		System.out.println("Push the item in stack-2:");
		stk.push2(40);
		stk.printArray();

		System.out.println();
		
		System.out.println("Pop the item from stack-2: "+stk.pop2());
		stk.printArray();
		
		System.out.println();
		System.out.println("Pop the item from stack-1: "+stk.pop1());
		
		System.out.println();
		System.out.println("Pop the item from stack-2: "+stk.pop2());
		stk.printArray();
		
//		System.out.println();
//		System.out.println("Pop the item from stack-1: "+stk.pop1());
//		stk.printArray();
		
		System.out.println();
		System.out.println("Pop the item from stack-2: "+stk.pop2());
		stk.printArray();
		
		System.out.println();
		System.out.println("Pop the item from stack-2: "+stk.pop2());
		stk.printArray();
		
		System.out.println();
		System.out.println("Pop the item from stack-2: "+stk.pop2());
		stk.printArray();
		
		
		
	}

	private void printArray() {
		
		System.out.println("Stack is : "+Arrays.toString(arr));
	}
}
