package com.leetcode.patterns.arrays;

public class FindAllSubStringOfGivenString {

	public static void main(String[] args) {
		
		String s = "ABC";
		
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i+1; j<=s.length(); j++)
			{
				System.out.println(s.subSequence(i, j));
			}
		}
	}
}
