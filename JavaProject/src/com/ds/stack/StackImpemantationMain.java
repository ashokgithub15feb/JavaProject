package com.ds.stack;

import java.util.Scanner;

public class StackImpemantationMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Stack test\n");
		System.out.println("==========");
		
		System.out.println("Enter size of integer stack");
		
		int n = scanner.nextInt();
		
		ArrayStack stack = new ArrayStack(n);
		
		char ch;
		
		do
		{
			System.out.println("\nStack Operation");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. check empty");
			System.out.println("5. check full");
			System.out.println("6. size");
			System.out.println("7. Reverse Stack");
			System.out.println("8. no other oprtion");
			
			int choise = scanner.nextInt();
			
			switch(choise)
			{
			case 1:
				
				System.out.println("Enter Integer number to push");
				try
				{
					stack.push(scanner.nextInt());
					
				}catch(Exception e) {
					System.out.println("Error: "+e.getMessage());
				}
				break;
				
			case 2:
				
				try
				{
					System.out.println("Popped Element: "+stack.pop());
				}catch(Exception e) {
					System.out.println("Error: "+e.getMessage()	);
				}
				break;
				
			case 3:
				
				try
				{
					System.out.println("Peeked Element: "+stack.peek());
				}catch(Exception e) {
					System.out.println("Error: "+e.getMessage());
				}
				break;
				
			case 4:
				
     			System.out.println("Empty Status: " +stack.isEmpty());
     			break;
     			
			case 5:
				
				System.out.println("Full Status: "+stack.isFull());
				break;
				
			case 6:
				System.out.println("Size: "+stack.getSize());
				break;
			case 7:
				System.out.println("Reverse of Stack:");
				stack.reverseOfStack();
				break;
				
				default:
					System.out.println("No Other opetion - Wrong Entry - Thanks You");
					break;
			}
			
			stack.display();
			
			System.out.println("\nDo you want to continue (type y or n) \n");
			
			ch = scanner.next().charAt(0);
			
		}while(ch == 'Y' || ch == 'y');
	}
}
