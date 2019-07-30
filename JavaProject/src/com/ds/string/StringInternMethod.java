package com.ds.string;

public class StringInternMethod {

	public static void main(String[] args) {
		
		String str1 = new String("ABC");
		String str2 = "BCD";
		String str3 = "BCD";
		String str4 = "ABC";
		
		if(str1 == str4) {
			System.out.println(true);
		}else
		{
			System.out.println(false);
		}
		
		if(str1.equals(str4))
		{
			System.out.println(true);
		}else
		{
			System.out.println(false);
		}
		
		if(str1 == str4.intern())
		{
			System.out.println("Intern: "+str1);
		}
		else
		{
			System.out.println("Not Intern: "+str1);
		}
		
		if(str1.equals(str4.intern()))
		{
			System.out.println("Intern: "+str1);
		}
		else
		{
			System.out.println("Not Intern: "+str1);
		}
		
		System.out.println(str2==str3);
	}
}
