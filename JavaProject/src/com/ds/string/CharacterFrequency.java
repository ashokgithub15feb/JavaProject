package com.ds.string;

public class CharacterFrequency {

	public static void main(String[] args) {
		
		String s = "abbaac";
		
		char[] c = s.toCharArray();
		
		int sz = c.length;
		
		int i=0; 
		
		int j=0;
		
		int counter = 0;
		
		for(i=0; i<sz ;i++)
		{
			counter = 0;
			
			for(j=0; j <sz;j++)
			{
				
				if(j < i && c[i] == c[j])
				{
					break; 
				}
				
				if(c[i] == c[j])
				{
					counter++;
				}
				
				if(j == sz-1)
				{
					System.out.println("the character "+c[i]+" is present "+counter+" times");
				}
			}
			
		}
	}
}
