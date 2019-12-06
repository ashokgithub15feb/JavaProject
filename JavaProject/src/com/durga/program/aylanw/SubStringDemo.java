package com.durga.program.aylanw;

public class SubStringDemo {

	public static void main(String[] args) {
		
		String str = "AshokKumarHelloWorldAshok";
		String key = "Ashok";
		
		String s = "";
		int count = 0;
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			
			s = s + String.valueOf(ch);
			
			if(s.equals(key))
			{
				count++;
				
				str = str.substring(i+1);
				
				s = "";
			}
			else if(s.contains(key))
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
}
