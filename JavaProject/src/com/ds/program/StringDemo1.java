package com.ds.program;

public class StringDemo1 {

	public static void main(String[] args)
	{
		String input = "I love Java Programming";
		
		String[] split = input.split(" ");
		
		String result = "";
		
		for(int i=0; i< split.length ; i++)
		{
			if(i == split.length-1) {
				
				result = split[i] + result;
			}
			else
			{
				result = " "+ split[i] + result;
			}
		}
		
		System.out.println(result);
	}
}
