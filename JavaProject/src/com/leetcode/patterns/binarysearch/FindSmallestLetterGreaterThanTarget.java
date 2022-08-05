package com.leetcode.patterns.binarysearch;

public class FindSmallestLetterGreaterThanTarget {

	public static void main(String[] args) {
		
		char[] letters = {'c', 'f', 'g'};
		char target = 'a';
		
		char result = nextGreatestLetter(letters, target);
		
		System.out.println("Next Greatest Letter: "+result);
	}
	public static char nextGreatestLetter(char[] letters, char target) {
		
		char res = letters[0];
		int left = 0;
		int right = letters.length-1;
		
		while(left <= right)
		{
			int mid = left + (right - left)/2;
			
			if(letters[mid] < target)
			{
				left = mid + 1;
			}
			else if(letters[mid] == target)
			{
				left = mid + 1;
			}
			else
			{
				res = letters[mid];
				right = mid - 1;
			}
		}
		
		return res;
		
	}
}
