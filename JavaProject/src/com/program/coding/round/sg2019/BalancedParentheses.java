package com.program.coding.round.sg2019;

public class BalancedParentheses {

	public static void main(String[] args) {
		
		String exp = "{()}[]";
		
		boolean areParenthesisBalanced = areParenthesisBalanced(exp);
		
		if(areParenthesisBalanced)
		{
			System.out.println("Balanced: "+exp);
		}else
		{
			System.out.println("Not Balanced: "+exp);
		}
	}

	private static boolean areParenthesisBalanced(String exp) {
		
		Stack stack = new Stack();
		
		for(int i=0; i<exp.length(); i++)
		{
			if(exp.charAt(i) == '{' || exp.charAt(i) == '(' || exp.charAt(i) == '[')
			{
				stack.push(exp.charAt(i));
			}
			
			if(exp.charAt(i) == '}' || exp.charAt(i) == ')' || exp.charAt(i) == ']')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				else if(!isMatchedPair(stack.pop(), exp.charAt(i)))
				{
					return false;
				}
				
			}
		}
		
		if(stack.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private static boolean isMatchedPair(char pop, char charAt) {
		
		if(pop == '(' && charAt == ')')
		{
			return true;
		}
		else if(pop == '{' && charAt == '}')
		{
			return true;
		}else if(pop == '[' && charAt == ']')
		{
			return true;
		}

		return false;
	}
}

class Stack
{
	int top = -1;
	char[] arr = new char[100];
	
	public void push(char ch)
	{
		if(isfull())
		{
			System.out.println("Stack is full");
		}
		else
		{
			top++;
			arr[top] = ch;
		}
	}
	
	public char pop()
	{
		if(isEmpty())
		{
			System.out.println("Unserflow");
			return 0;
		}
		else
		{
			char c = arr[top];
			top--;
			return c;
		}
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public boolean isfull()
	{
		return top == 99;
	}
}
