package com.durga.program.reflaction;

import java.util.Scanner;

public class StrCountChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		st = "";
		for (int i = 0; i < ch.length; i++) 
		{
			int count = 1;
			
			while (i < ch.length - 1 && ch[i] == ch[i + 1])
			{
				count++;
				i++;
			}
			if (count > 1)
			{
				st = st + count;
			}
			st = st + ch[i];
		}
		System.out.println(st);
		
		sc.close();
	}
}
