package com.datastructures.stack;

public class ParanthesisMatching {

	Node top ;
	
	public static void main(String[] args) {
		
		StackImplForParanthesisMatching matching = new StackImplForParanthesisMatching();
		String str = "(a + b) * (c - d)";
		char[] exp = str.toCharArray();
		
		for(int i = 0; i < exp.length; i++) {
			if(exp[i] == '(') {
				matching.push(exp[i]);
			}
			else if(exp[i] == ')') {
				if(matching.top == null) {
					System.out.println("Stack is Empty");
				}
				matching.pop();
			}
		}
		
		if(matching.top == null) {
			System.out.println("Stack is Empty: Balance ");
		}
		else {
			System.out.println("Not balanace");
		}
	}
}
