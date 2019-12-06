package com.ds.caching;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class TwoStackUsingOneArray {

	private int[] arr;
	private int top1;
	private int top2;
	private int size;
	
	public TwoStackUsingOneArray(int size)
	{
		this.size = size;
		top1 = -1;
		top2 = size;
		arr = new int[size];
	}
	
	public synchronized void push1(int data)
	{
		if(isFull())
		{
			top1++;
			arr[top1] = data;
		}
		else
		{
			System.out.println("Overflow");
		}
	}
	
	public boolean isFull()
	{
		return (top1 < (top2 - 1));
	}
	
	public synchronized void push2(int data)
	{
		if(isFull())
		{
			top2--;
			arr[top2] = data;
		}
		else
		{
			System.out.println("Overflow");
		}
	}
	
	public synchronized void pop1()
	{
		if(isPop1Empty())
		{
			int data = arr[top1];
			arr[top1] = 0;
			top1--;
			
			System.out.println(data);
		}
		else
		{
			System.out.println("underflow");
		}
	}
	
	
	public synchronized void pop2()
	{
		if(isPop2Empty())
		{
			int data = arr[top2];
			arr[top2] = 0;
			top2++;
			
			System.out.println(data);
		}
		else
		{
			System.out.println("Undrflow");
		}
	}
	
	public boolean isPop1Empty() {
		
		return top1 >= 0;
	}
	
	public boolean isPop2Empty() {
		
		return top2 < size;
	}
	
	
	public static void main(String[] args) {
		
		TwoStackUsingOneArray stack = new TwoStackUsingOneArray(5);
		
//		stack.push1(10);
//		stack.push1(20);
//		stack.push2(30);
//		stack.push2(40);
//		stack.push2(50);
//		
//		System.out.println(Arrays.toString(stack.arr));
//		
//		stack.pop1();
//		stack.pop2();
//		
//		System.out.println(Arrays.toString(stack.arr));
//		
//		stack.pop1();
//		stack.pop2();
//		
//		System.out.println(Arrays.toString(stack.arr));
//		
//		stack.pop1();
//		stack.pop2();
//		
//		System.out.println(Arrays.toString(stack.arr));

		int[] arr = {10, 20, 30, 40, 50};
		
		
		final Object lock = new Object();
		
		Runnable push1 = () ->
		{
			for(int i=0; i<=1; i++)
			{
				synchronized (lock) {
					
					stack.push1(arr[i]);
				}
			}
		};
		
		Runnable push2 = () ->
		{
			for(int i=2; i<arr.length; i++)
			{
				synchronized (lock) {
					stack.push2(arr[i]);
				}
			}
		};
		
		Runnable pop1 = () ->
		{
			for(int i=0; i<=1; i++)
			{
				synchronized (lock) {
					stack.pop1();
				}
			}
		};
		
		Runnable pop2 = () ->
		{
			for(int i=2; i<arr.length; i++)
			{
				synchronized (lock) {
					stack.pop2();
				}
			}
		};
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		service.execute(push1);
		service.execute(push2);
		service.execute(pop1);
		service.execute(pop2);
		
		
		
		service.shutdown();
	}
}
