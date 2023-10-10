package com.datastructures.strings;

import java.util.Arrays;

public class StringsClass {

	static int count = 0;
	
	public static void main(String[] args) {
		
		printASCIIValue();
		
		printChar();
		
		printLowerCase();
		
		printChangingCaseInToggle();
		
		countingVowelsAndConsonents();
		
		validatePasswordWithoutSpecialCharacter();
		
		reverseStrng();
		
		comparingString();
		
		findindDuplicate();
		findindDuplicate1();
		
		checkForAnagaram();
		
		permutation();
	}

	private static void permutation() {
		String str = "ABC";
		System.out.println("Input: Permutation: "+str);
		char[] ch = str.toCharArray();
		int l = 0;
		int h = ch.length-1;
		
		perm(ch, l, h);
		System.out.println("\nNumber of Permutation for given input string is: "+str+" : "+count);
	}

	private static void perm(char[] ch, int l, int h) {
		if(l == h)  {
			System.out.print(ch);
			System.out.print(" ");
			count++;
		}
		else {
			for(int i=l; i<=h; i++) {
				swap(ch, l, i);
				perm(ch, l+1, h);
				swap(ch, l, i);
			}
		}
	}

	private static void swap(char[] ch, int l, int i) {
		char c = ch[l];
		ch[l] = ch[i];
		ch[i] = c;
		System.out.println("\nSwap: "+Arrays.toString(ch)+", l: "+l+", i: "+i);
	}

	private static void checkForAnagaram() {
		
		String s1 = "decimal";
		String s2 = "mrdical";
		System.out.println("Input: s1: "+s1+", s2: "+s2);
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		char[] hashing = new char[26];
		int l = Integer.MAX_VALUE;
		for(int i = 0; i < hashing.length; i++) {
			hashing[i] = '0';
		}
		
		if(ch1.length != ch2.length) {
			System.out.println("Not an Anagram");
			return;
		}
		
		for(int i=0; i < ch1.length; i++) {
			hashing[ch1[i] - 97]++;
		}
		
		for(int i=0; i < ch2.length; i++) {
			hashing[ch2[i] - 97]++;
			
			if((int)hashing[ch2[i] - 97] <= 1) {
				System.out.println("Not an Anagaram");
				break;
			}
		}
		
		if(l == 1) {
			System.out.println("Its not a Anagaram");
		}
		else {
			System.out.println("It's an Anagaram");
		}
	}

	private static void findindDuplicate1() {
		String s = "FindingF";
		System.out.println("Input: "+s);
		char[] ch = s.toCharArray();
		char[] hashingSmallLetter = new char[26];
		char[] hashingCapitalLatter = new char[26];
		for(int i=0; i<ch.length; i++) {
			
			if(ch[i] >= 65 && ch[i] <= 90) {
				hashingCapitalLatter[ch[i] - 65]++;
			}
			else if(ch[i] >= 97 && ch[i] <= 122){
				hashingSmallLetter[ch[i] - 97]++;
			}
		}
		
		for(int i=0; i<hashingSmallLetter.length; i++) {
			if(hashingSmallLetter[i] > 1) {
					System.out.println("Duplicate Character: "+(char)(i+97)+", Counting: "+(int)hashingSmallLetter[i]);
			}
			
			if(hashingCapitalLatter[i] > 1 ) {
				System.out.println("Duplicate Character: "+(char)(i+65)+", Counting: "+(int)hashingCapitalLatter[i]);
			}
		}
	}

	private static void findindDuplicate() {
		String s = "finding";
		System.out.println("Input: "+s);
		char[] ch = s.toCharArray();
		char[] hashing = new char[26];
		for(int i=0; i<ch.length; i++) {
			hashing[ch[i] - 97]++;
		}
		
		for(int i=0; i<hashing.length; i++) {
			if(hashing[i] > 1) {
				System.out.println("Duplicate Character: "+(char)(i+97)+", Counting: "+(int)hashing[i]);
			}
		}
	}

	private static void comparingString() {
		String s1 = "Painter";
		String s2 = "Painting";
		System.out.println("Input: s1: "+s1+", s2: "+s2);
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		for(int i=0, j=0; i<ch2.length ; i++, j++) {
			
			if(ch1[i] == ch2[j]) {
				System.out.println("Equals: "+ch1[i]+", "+ch2[j]);
			}
			else if(ch1[i] < ch2[j]) {
				System.out.println("Smaller: "+ch1[i]+", "+ch2[j]+": s1 is smaller than s2");
				break;
			}
			else {
				System.out.println("Greater: "+ch1[i]+", "+ch2[j]+": s1 is greater than s2");
				break;
			}
			
			
		}
	}

	private static void reverseStrng() {
		String str = "Python";
		System.out.println("Reverse of String");
		char[] ch = str.toCharArray();
		System.out.println(ch);
		for(int i=0, j = ch.length - 1; i<ch.length/2; i++, j--) {
			char t = ch[i];
			ch[i] = ch[j];
			ch[j] = t;
		}
		System.out.println(ch);
	}

	private static void validatePasswordWithoutSpecialCharacter() {
		
		String password = "Ani?1234";
		System.out.println("Input: validate Password Without Special Character: "+password);
		boolean flag = true;
		char[] ch = password.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			if(!(ch[i] >= 65 && ch[i] <= 90) && 
					!(ch[i] >= 97 && ch[i] <= 122) && 
					!(ch[i] >= 48 && ch[i] <= 57)) {
				flag = false;
			}
		}
		if(flag) {
			System.out.println("Output: Valid Password: "+flag);
		}
		else {
			System.out.println("Output: invalid Password: "+flag);
		}
	}

	private static void countingVowelsAndConsonents() {
		String str = "How are you";
		System.out.println("Input string: "+str);
		char[] ch = str.toCharArray();
		int vcount = 0;
		int ccount = 0;
		int wordCount = 0;
		
		for(int i=0; i<ch.length; i++) {
			if((ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' ||ch[i] == 'u') || 
					(ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' ||ch[i] == 'U')) {
				vcount++;
			}
			else if((ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122)) {
				ccount++;
			}
		}
		
		String[] words = str.split(" ");
		for(int i = 0; i < words.length ; i++) {
				wordCount++;
		}
		System.out.println("Vowels Count: "+vcount+", Consonents count: "+ccount+", Word Count: "+wordCount);
	}

	private static void printChangingCaseInToggle() {
		char[] ch = {'W', 'E', 'l', 'C', 'o', 'm', 'e'};
		System.out.println("=================");
		System.out.println(ch);
		for(int i=0; i< ch.length; i++) {
			if(ch[i] >= 65 && ch[i] <= 90) {
				ch[i] = (char) (ch[i] + 32);
			}
			else if(ch[i] >= 'a' && ch[i] <= 122) {
				ch[i] = (char) (ch[i] - 32);
			}
			//else if(ch[i] >= 'a' && ch[i] <= 'z') {
				//ch[i] = (char) (ch[i] - 32);
			//}
			//else if(ch[i] >= 97 && ch[i] <= 122) {
				//ch[i] = (char) (ch[i] - 32);
			//}
		}
		System.out.println(ch);
		System.out.println("Output: "+ch);
	}

	private static void printLowerCase() {
		char[] ch = {'W', 'E', 'L', 'C', 'O', 'M', 'E'};
		for(int i=0; i < ch.length; i++) {
			System.out.println(ch);
		}
		
		for(int i=0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		for(int i=0; i < ch.length; i++) {
			ch[i] = (char) (ch[i] + 32); 
		}
		System.out.println(ch);
		
		char[] cha = {'w', 'e', 'l', 'c', 'o', 'm', 'e'};
		for(int i=0; i < ch.length; i++) {
			cha[i] = (char) (cha[i] - 32); 
		}
		System.out.println(cha);
		
	}

	private static void printChar() {
		char[] ch = new char[10];
		ch[0] = 'J';
		ch[1] = 'o';
		ch[2] = 'h';
		ch[3] = 'n';
		
		char[] ch1 = {'A', 'S', 'H', 'O', 'K', ' ', 'K', 'U', 'M', 'A', 'R', '\0'};
		
		System.out.println(Arrays.toString(ch));
		System.out.println("Length of char: "+ch.length);
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(ch1.length);
		
		// char[] ch2 = "Ashok"; - not possible in java
		
		for(int i=0; ch1[i] != '\0'; i++) {
			System.out.print(ch1[i]);
		}
		System.out.println();
		
		char[] ch3 = {66, 67};
		System.out.println(ch3);
	}

	private static void printASCIIValue() {
		for(char chA = 'A', cha = 'a', ch0 = '0' ; chA <= 'Z' && cha <= 'z' || ch0 <= '9' ; chA++, cha++, ch0++) {
			System.out.println("The ASCII Value of: "+chA +" is: "+(int)chA+", and "+cha+" is: "+(int)cha+", and Number: "+ch0+" is: "+(int)ch0);
		}
	}
}
