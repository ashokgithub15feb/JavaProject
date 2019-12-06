package com.program.coding.round.sg2019;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		
		String str = "geeksforgeeks"; 
		
		firstNonRepeatingChar(str);
	}

	private static void firstNonRepeatingChar(String str) {
		
		char[] ch = new char[256];
		
		for(int i=0; i<str.length(); i++)
		{
			ch[str.charAt(i)]++;
		}
		
		for(int i=0; i<str.length();i++)
		{
			if(ch[str.charAt(i)] == 1)
			{
				System.out.println(i+":"+str.charAt(i));
				break;
			}
		}
	}
}
