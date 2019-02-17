package com.interview.program;

public class StringFindTheFirstNonRepeatableCharacter {

	public static void main(String[] args) {
		
		String s = "nzzzzbbbccccddehhhhiii";
				
		char[] charArray = getChar(s);
		
		char ch = charArray[0];
		int count = 1;
		
		for(int i=1; i<charArray.length ; i++)
		{
			if(ch == charArray[i])
			{
				count++;
			}
			else if(count == 1)
			{
				System.out.println("Non Repeatable character: "+ch);
				ch = charArray[i];
				count = 1;
			}
			else
			{
				ch = charArray[i];
				count = 1;
			}
		}
		
		if(count == 1)
		{
			System.out.println("Last Non Repetable Character: "+ch);
		}
		
		System.out.println(String.class.getClassLoader());
		System.out.println(ClassLoader.getSystemClassLoader());
		System.out.println(StringFindTheFirstNonRepeatableCharacter.class.getClassLoader());
		
	}
	
	public static char[] getChar(String s)
	{
		return s.toCharArray();
	}
}
