package com.ds.program;

public class ReverseOfString {

	public static void main(String[] args) {

		String input = "this is morganstanley interview question";

		String output = "";
		output = reverse(input);

		System.out.println(input);
		System.out.println(output);
		
		String s = s("ashok");
		System.out.println(s);
	}

	private static String reverse(String input) {
		String output = "";
		String tmp = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			
			if (input.charAt(i) == ' ') {
				output = output + (reverse(tmp) + " ");

				tmp = "";
			} else {
				tmp = tmp + (input.charAt(i) + "");
			}

			if (i == 0) {
				output = output + tmp;
			}
		}
		return output;
	}
	
	public static String s(String str)
	{
		if(str.isEmpty())
		{
			return "";
		}
		return s(str.substring(1))+str.charAt(0);
	}
}
