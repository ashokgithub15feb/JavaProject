package com.ds.iq;

import java.util.Scanner;

public class CheckMissingLetter {

	public static void main(String[] args)
	{
	    Scanner in = new Scanner(System.in);

	    System.out.println("Enter the string : ");
	    String input = in.nextLine();

	    String out = checkMissingLetterPangram(input);

	    if (out.length() == 0)
	        System.out.println("Pangram");
	    else
	        System.out.println("The letters missing : " + out);
	    
	    in.close();
	}

	private static String checkMissingLetterPangram(String input)
	{
	    input = input.toLowerCase();
	    String alph = "abcdefghijklmnopqrstuvwxyz";
	    int max = 26;

	    for (int i = 0; i < max; i++)
	    {
	        int index = input.indexOf(alph.charAt(i));
	        if (index != -1)
	        {
	        	String substring2 = alph.substring(0, i);
	        	String substring = alph.substring(i + 1);
	        	
	        	System.out.println("alph.substring(0, i): "+substring2);
	        	System.out.println("alph.substring(i + 1): "+substring);
	            alph = substring2 + substring;
	            System.out.println("alph: "+alph);
	            System.out.println("index: "+index);
	            System.out.println("=============================");
	            i--;
	            max--;
	        }
	    }

	    return alph;
	}
}
/*
Enter the string : 
abdefghijklmnopqrstuvwxyz
alph.substring(0, i): 
alph.substring(i + 1): bcdefghijklmnopqrstuvwxyz
alph: bcdefghijklmnopqrstuvwxyz
index: 0
=============================
alph.substring(0, i): 
alph.substring(i + 1): cdefghijklmnopqrstuvwxyz
alph: cdefghijklmnopqrstuvwxyz
index: 1
=============================
alph.substring(0, i): c
alph.substring(i + 1): efghijklmnopqrstuvwxyz
alph: cefghijklmnopqrstuvwxyz
index: 2
=============================
alph.substring(0, i): c
alph.substring(i + 1): fghijklmnopqrstuvwxyz
alph: cfghijklmnopqrstuvwxyz
index: 3
=============================
alph.substring(0, i): c
alph.substring(i + 1): ghijklmnopqrstuvwxyz
alph: cghijklmnopqrstuvwxyz
index: 4
=============================
alph.substring(0, i): c
alph.substring(i + 1): hijklmnopqrstuvwxyz
alph: chijklmnopqrstuvwxyz
index: 5
=============================
alph.substring(0, i): c
alph.substring(i + 1): ijklmnopqrstuvwxyz
alph: cijklmnopqrstuvwxyz
index: 6
=============================
alph.substring(0, i): c
alph.substring(i + 1): jklmnopqrstuvwxyz
alph: cjklmnopqrstuvwxyz
index: 7
=============================
alph.substring(0, i): c
alph.substring(i + 1): klmnopqrstuvwxyz
alph: cklmnopqrstuvwxyz
index: 8
=============================
alph.substring(0, i): c
alph.substring(i + 1): lmnopqrstuvwxyz
alph: clmnopqrstuvwxyz
index: 9
=============================
alph.substring(0, i): c
alph.substring(i + 1): mnopqrstuvwxyz
alph: cmnopqrstuvwxyz
index: 10
=============================
alph.substring(0, i): c
alph.substring(i + 1): nopqrstuvwxyz
alph: cnopqrstuvwxyz
index: 11
=============================
alph.substring(0, i): c
alph.substring(i + 1): opqrstuvwxyz
alph: copqrstuvwxyz
index: 12
=============================
alph.substring(0, i): c
alph.substring(i + 1): pqrstuvwxyz
alph: cpqrstuvwxyz
index: 13
=============================
alph.substring(0, i): c
alph.substring(i + 1): qrstuvwxyz
alph: cqrstuvwxyz
index: 14
=============================
alph.substring(0, i): c
alph.substring(i + 1): rstuvwxyz
alph: crstuvwxyz
index: 15
=============================
alph.substring(0, i): c
alph.substring(i + 1): stuvwxyz
alph: cstuvwxyz
index: 16
=============================
alph.substring(0, i): c
alph.substring(i + 1): tuvwxyz
alph: ctuvwxyz
index: 17
=============================
alph.substring(0, i): c
alph.substring(i + 1): uvwxyz
alph: cuvwxyz
index: 18
=============================
alph.substring(0, i): c
alph.substring(i + 1): vwxyz
alph: cvwxyz
index: 19
=============================
alph.substring(0, i): c
alph.substring(i + 1): wxyz
alph: cwxyz
index: 20
=============================
alph.substring(0, i): c
alph.substring(i + 1): xyz
alph: cxyz
index: 21
=============================
alph.substring(0, i): c
alph.substring(i + 1): yz
alph: cyz
index: 22
=============================
alph.substring(0, i): c
alph.substring(i + 1): z
alph: cz
index: 23
=============================
alph.substring(0, i): c
alph.substring(i + 1): 
alph: c
index: 24
=============================
The letters missing : c

*/