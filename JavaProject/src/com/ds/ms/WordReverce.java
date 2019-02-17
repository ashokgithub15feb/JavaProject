package com.ds.ms;

public class WordReverce {

	public static void main(String[] args) {
		
		String input = "this is morganstanley interview question";
		
		String output = "";
		output =reverse(input);
		System.out.println(input);
		System.out.println(output);
	}

	private static String reverse(String input) {
		String output="";
		String tmp="";
		for(int i=input.length()-1; i>=0;i--)
		{
			if(input.charAt(i) == ' ')
			{
				output = output + (reverse(tmp)+" ");
				
				tmp = "";
			}
			else
			{
				tmp = tmp + (input.charAt(i)+"");
			}
			
			if(i==0)
			{
				output = output + tmp;
			}
		}
		return output;
	}
}
