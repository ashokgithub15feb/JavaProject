package com.interviews.leetcode.easy;

public class GoalParserInterpretation {

	public static void main(String[] args) {
		
		String str = "G()(al)";
		String result = goalParserInterpretation(str);
		System.out.println("Result: "+result);
	}

	private static String goalParserInterpretation(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		int i = 0;
		
		while(i < str.length()) {
			
			if(str.charAt(i) == 'G') {
				sb.append("G");
				i++;
			} else if(str.charAt(i) == '(' && str.charAt(i + 1) == ')') {
				sb.append("o");
				i = i + 2;
			} else {
				sb.append("al");
				i = i + 4;
			}
		}
		
		return sb.toString();
	}
}
