package com.leetcode.patterns.arrays;

public class BracketsBalanced {

	public static void main(String[] args) {

		String str = "())()(";

		boolean isBracketsBalanced = isBracketsBalanced(str);
		System.out.println(isBracketsBalanced);

		str = "()(()){[]}";
		boolean isBracketsBalanced1 = isBracketsBalanced1(str);
		System.out.println(isBracketsBalanced1);
		
	}

	private static boolean isBracketsBalanced(String str) {

		char[] stack = new char[str.length()];
		int i = -1;
		for (char ch : str.toCharArray()) {
			if (ch == '(') {
				stack[++i] = ch;
			} else {
				if (i >= 0 && (stack[i] == '(' && ch == ')')) {
					i--;
				} else {
					return false;
				}
			}
		}

		return i == -1;
	}

	private static boolean isBracketsBalanced1(String str) {

		char[] stack = new char[str.length()];
		int i = -1;
		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack[++i] = ch;
			} else {
				if (i >= 0 && ((stack[i] == '(' && ch == ')') 
						|| (stack[i] == '{' && ch == '}')
						|| (stack[i] == '[' && ch == ']'))) {
					i--;
				} else {
					return false;
				}
			}
		}

		return i == -1;
	}
}
