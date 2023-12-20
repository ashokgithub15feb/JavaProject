package com.datastructures.stack;

import java.util.Arrays;

public class StackImplForParanthesis {

	private int size;
	private int top;
	private char[] stack;
	private int length;
	
	public StackImplForParanthesis(int size) {
		this.size = size;
		this.top = -1;
		this.stack = new char[size];
	}
	
	public boolean isEmpty() {
		return top == -1 ? true : false;
	}
	
	public boolean isFull() {
		return top == size - 1 ? true : false;
	}
	
	public void push(char data) {
		if(isFull()) {
			System.out.println("Stack Overflow");
		}
		else {
			top++;
			stack[top] = data;
			length++;
		}
	}
	
	public char pop() {
		char x = ' ';
		
		if(isEmpty()) {
			System.out.println("Stack underflow");
		}
		else {
			x = stack[top];
			stack[top] = 0;
			top--;
			length--;
		}
		
		return x;
	}
	
	public char stackTop() {
		if(top == -1) {
			return ' ';
		}
		else {
			return stack[top];
		}
	}
	
	public char peek(int pos) {
		
		char x = ' ';
		
		if(top - pos + 1 < 0) {
			System.out.println("Invalid Position");
		}
		else {
			x = stack[top - pos + 1];
		}
		
		return x;
	}
	
	public void display() {
		System.out.println(Arrays.toString(stack));
	}
	
	public static void main(String[] args) {
		
		int size = 5;
		StackImplForParanthesis stackImpl = new StackImplForParanthesis(size);
		
		String str = "[{(a + b)*(c - d)}]/e";
		char[] exp = str.toCharArray();
		
		boolean isBalanced = stackImpl.isBalanced(exp, stackImpl);
		if(isBalanced) {
			System.out.println("Expression is Balanced: "+isBalanced);
		}
		else {
			System.out.println("Expression is not Balanced: "+isBalanced);
		}
	}

	private boolean isBalanced(char[] exp, StackImplForParanthesis stackImpl) {
		
		for(int i=0; i < exp.length; i++) {
			
			if(exp[i] == '(' || exp[i] == '{' || exp[i] == '[') {
				stackImpl.push(exp[i]);
			}
			else if(exp[i] == ')' || exp[i] == '}' || exp[i] == ']') {
				if(isEmpty()) {
					return false;
				}
				stackImpl.pop();
			}
		}
		
		return isEmpty() ? true : false;
	}
}
