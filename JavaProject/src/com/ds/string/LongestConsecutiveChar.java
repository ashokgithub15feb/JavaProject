package com.ds.string;

public class LongestConsecutiveChar {

	public static void longestConsecutiveeCharacter(String s)
	{
		int count = 0;
		int max = 0;
		char a = 0;
		
		for(int i=0; i<s.length();i++)
		{
			count = 0;
			for(int j=0; j<s.length()-1;j++)
			{
				if(s.charAt(i) == s.charAt(j))
				{
					count++;
				}
				else
				{
					if(count > max)
					{
						max = count;
						a = s.charAt(i);
					}
				}
			}
			System.out.println("["+a+", "+max+"]");
		}
		
	}
	
	public static void main(String[] args) {
		
		longestConsecutiveeCharacter("AAABBCCCDDDDDDDE");
	}
}
