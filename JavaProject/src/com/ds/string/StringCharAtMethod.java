package com.ds.string;

public class StringCharAtMethod {

	public static void main(String[] args) {
		
		String s = "intuit technology";
		
		char[] ch = s.toCharArray();
		
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i] == s.charAt(i))
			{
				System.out.print(ch[i]+" ");
			}
		}
		System.out.println();
		System.out.println(s.charAt(7));
		System.out.println(s.charAt(10));
		
		char[] ch1 = new char[ch.length];
		
		System.arraycopy(ch, 0, ch1, 0, ch.length); 
		
		System.out.println(String.valueOf(ch1));
		
		String s1 = "A";
		System.out.println(s1.codePointAt(0));
		
		String s2 = " Intuit Tech     ";
		
		System.out.println(s2.trim());
		
		System.out.println(s.indexOf("technology"));
		
		System.out.println(s.indexOf("c"));
		
		System.out.println(s.indexOf(2));
		
		System.out.println(s.lastIndexOf(10));
	}
}
