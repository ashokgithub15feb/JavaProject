package com.datastructures.company.blackrock;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Have a nice day!";
		reverse(str);
	}

	private static void reverse(String str) {
		
		System.out.println(str);
		char[] ch = str.toCharArray();
		
		for(int i=0, j = ch.length - 1; i <ch.length/2; i++, j--) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		
		System.out.println(ch);
	}
}
