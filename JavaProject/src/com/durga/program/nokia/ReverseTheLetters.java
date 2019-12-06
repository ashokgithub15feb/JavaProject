package com.durga.program.nokia;

public class ReverseTheLetters {

	public static void main(String[] args) {

		String str = "Welcome To Edureka";
		reverseWords(str);
		
		System.out.println(reverseWords1(str));
		
	}

	private static String reverseWords1(String str) {
		
		int start = 0;
		
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i) == ' ' || i == str.length() - 1)
			{
				int end = 0;
				
				if(i == str.length()-1)
				{
					end = i;
				}
				else
				{
					end = i -1;
				}
				
				while(start < end)
				{
					str = swap(str, start, end);
					
					start++;
					end--;
				}
				start = i + 1;
			}
		}
		return str;
	}

	private static String swap(String str, int start, int end) {
		
		StringBuilder sb = new StringBuilder(str);
		
		sb.setCharAt(start, str.charAt(end));
		sb.setCharAt(end, str.charAt(start));
		
		return sb.toString();
	}

	private static void reverseWords(String str) {
		String[] strArray = str.split(" ");
		StringBuilder ab = new StringBuilder();
		
		for (String temp : strArray) 
		{
			System.out.print(temp+" ");
		}

		System.out.println();
		
		for (int i = 0; i < strArray.length; i++) {
			
			char[] s1 = strArray[i].toCharArray();
			
			for (int j = s1.length - 1; j >= 0; j--) {
				
				ab.append(s1[j]);
			}
			ab.append(" ");
		}
		
		System.out.println(ab);
	}
}
