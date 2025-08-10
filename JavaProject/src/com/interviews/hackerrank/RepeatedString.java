package com.interviews.hackerrank;

/*
 There is a string, of lowercase English letters that is repeated infinitely many times. 
 Given an integer, find and print the number of letter a's in the first  letters of the infinite string.

Example

s = "abcac"
n = 10

The substring we consider is , the first  characters of the infinite string. 
There are  occurrences of a in the substring.

 */
public class RepeatedString {

	public static void main(String[] args) {
		
		String s = "abcac";
		int n = 10;
		//find the number of 'a' occurrence in new string
		//new str = a b c a c a b c a c
		//strlen = 10
		//len = s.length(); 5
		//strlen/len - 10/5 = 2, r = 0
		System.out.println("Input: s: "+s+", n: "+n);
		long result = repeatedString(s, n);
		
		System.out.println("Result: "+result);
	}

	private static long repeatedString(String s, int n) {
		
		int strLength = s.length();
		long  q = 0;
		long r = 0;
		
		q = n / strLength;
		r = n % strLength;
		
		long partialStrLength = (r == 0) ? 0 : r;
		
		long aCount = q * getLetterCount(s, s.length()) + getLetterCount(s, partialStrLength);
		
		return aCount;
	}

	private static long getLetterCount(String s, long length) {

		long count = 0;
		
		for(int i=0; i < length; i++) {
			if(s.charAt(i) == 'a') {
				count++;
			}
		}
		
		return count;
	}
}
