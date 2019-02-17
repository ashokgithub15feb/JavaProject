package com.ds.customstack;

public class StackMain {

	public static void main(String[] args) {
		
		CustomStack<Integer> customStack = new CustomStack<>();
		
		customStack.push(10);
		customStack.push(20);
		customStack.push(30);
		customStack.push(40);
		customStack.push(50);
		customStack.push(60);
		customStack.push(70);
		customStack.push(80);
		customStack.push(90);
		customStack.push(100);
		customStack.push(110);
		
		System.out.println(customStack);
		System.out.println("Stack Size: "+customStack.size());
		
		System.out.println(customStack.pop());
		System.out.println(customStack.pop());
		System.out.println(customStack.pop());
		
		System.out.println(customStack);
		
		System.out.println("============================================");
		
		CustomStack<String> customStack2 = new CustomStack<>();
		
		customStack2.push("A");
		customStack2.push("B");
		customStack2.push("C");
		customStack2.push("D");
		customStack2.push("E");
		customStack2.push("F");
		customStack2.push("G");
		customStack2.push("H");
		customStack2.push("I");
		customStack2.push("J");
		customStack2.push("K");
		
		System.out.println(customStack2);
		
		System.out.println(customStack2.pop());
		System.out.println(customStack2.pop());
		System.out.println(customStack2.pop());
		
		System.out.println(customStack2);
		
		System.out.println(customStack2.peek());
		
		
		try
		{
			System.out.println(customStack2.pop());
			System.out.println(customStack2.pop());
			System.out.println(customStack2.pop());
			System.out.println(customStack2.pop());
			System.out.println(customStack2.pop());
			System.out.println(customStack2.pop());
			System.out.println(customStack2.pop());
			System.out.println(customStack2.pop());
			System.out.println(customStack2.pop());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(customStack2);
		
		System.out.println(customStack2.isEmpty());
		
	}
}
