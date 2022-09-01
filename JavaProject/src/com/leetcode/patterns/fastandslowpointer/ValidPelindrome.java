package com.leetcode.patterns.fastandslowpointer;

public class ValidPelindrome {

	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		
		//String s = "abc";
		
		boolean result = validPelindrome(s);
		
		if(result)
		{
			System.out.println("Given String: "+s+" is Valid Pelindrome: "+result);
		}
		else
		{
			System.out.println("Given String: "+s+" is not Valid Pelindrome: "+result);
		}
	}

	private static boolean validPelindrome(String s) {
		
		s = s.toLowerCase();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)))
			{
				sb.append(s.charAt(i));
			}
		}
		
		int n = sb.length()-1;
		
		for(int i=0; i<sb.length()/2; i++)
		{
			if(sb.charAt(i) != sb.charAt(n - i))
			{
				return false;
			}
		}
		
		return true;
	}
}
