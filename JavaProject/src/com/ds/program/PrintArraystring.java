package com.ds.program;

import java.util.Arrays;

public class PrintArraystring {

	public static void main(String[] args) {
		
		String[] str = {"GeeksforGeeeks", "I", "from", "am"};
		
		System.out.println(Arrays.toString(str));
		sort(str, str.length);
		System.out.println(Arrays.toString(str));
	}
	public static void sort(String s[], int n) 
	{ 
	    for (int i=1 ;i<n; i++) 
	    { 
	        String temp = s[i]; 
	  
	        // Insert s[j] at its correct position 
	        int j = i - 1; 
	        while (j >= 0 && temp.length() < s[j].length()) 
	        { 
	            s[j+1] = s[j]; 
	            j--; 
	        } 
	        s[j+1] = temp; 
	    } 
	} 
}
