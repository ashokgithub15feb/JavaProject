package com.datastructures.queue;

public class ReverseString {

	public static void main(String[] args) {
		
		palindromString();
	}

	private static void palindromString() {
		String str = "madam";
		System.out.println("Input : "+str);
		
		String res = reverseString(str);
		System.out.println("Output : "+res);
		
		if(str.equals(res)) {
			System.out.println("Palindrom String");
		}
		else {
			System.out.println("Not Palindrom String");
		}
		
	}

	private static String reverseString(String str) {
		char[] ch = str.toCharArray();
		for(int i=0, j = ch.length - 1; i < ch.length / 2; i++, j--) {
			char t = ch[i];
			ch[i] = ch[j];
			ch[j] = t;
		}
		
		return String.valueOf(ch);
	}
}
