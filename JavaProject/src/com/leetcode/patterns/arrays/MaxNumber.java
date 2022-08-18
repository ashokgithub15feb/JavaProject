package com.leetcode.patterns.arrays;

public class MaxNumber {

	public static void main(String[] args) {
		
		String s = "1234";
		int n = 2;
		
		char[] ch = s.toCharArray();
		boolean swape = false;
		int i = 0;
		System.out.println("Original: "+String.valueOf(ch));
		
		while(n > 0 && i < ch.length-1)
		{
			if(ch[i] < ch[i + 1])
			{
				char temp = ch[i];
				ch[i] = ch[i+1];
				ch[i+1] = temp;
				
				n--;
				swape = true;
			}
			
			i++;
			
			if(swape && i == ch.length-1)
			{
				swape = false;
				i = 0;
			}
			
			
			System.out.println(String.valueOf(ch));
		}
		
		System.out.println("Result: "+String.valueOf(ch));
	}
}
