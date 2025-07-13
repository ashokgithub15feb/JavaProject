package com.interviews.leetcode.easy;

import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {

		//String str = "({[()]})";
		String str = "({[()]})";

		boolean result = validParantheses(str);

		System.out.println("Input: " + str + "\nResult: " + result);
	}

	private static boolean validParantheses(String str) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (!stack.isEmpty() && ch == ')' && stack.peek() == '(') {
				stack.pop();
			} else if (!stack.isEmpty() && ch == '}' && stack.peek() == '{') {
				stack.pop();
			} else if (!stack.isEmpty() && ch == ']' && stack.peek() == '[') {
				stack.pop();
			} else {
				return false;
			}
		}

		return stack.isEmpty();
	}
}
