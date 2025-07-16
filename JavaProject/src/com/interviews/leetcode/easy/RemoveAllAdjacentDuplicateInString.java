package com.interviews.leetcode.easy;

import java.util.Stack;

public class RemoveAllAdjacentDuplicateInString {

	public static void main(String[] args) {

		String str = "abbaca";

		String result = removeAllAdjecentDuplicate(str);
		
		System.out.println("Result: "+result);
	}

	private static String removeAllAdjecentDuplicate(String str) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (stack.isEmpty()) {
				stack.push(ch);
			} else if (stack.peek() == ch) {
				stack.pop();
			} else {
				stack.push(ch);
			}
		}

		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		return sb.reverse().toString();
	}
}
