package com.ds.ms;

public class ReverseOfStringWithWord {

	// Java program to reverse a string 
	public static void main(String[] args) {
		
		String str = "i like this program very much";
		String s[]=str.split(" "); 
		
		StringBuilder ans= new StringBuilder();

		System.out.println(str);
		
		for(int i=s.length - 1; i >= 0; i--) { 
			ans.append(s[i]+" "); 

		} 
		System.out.println("Reversed String:"); 
		//System.out.println(ans.substring(0,ans.length()-1)); 
		System.out.println(ans);
	} 
} 
