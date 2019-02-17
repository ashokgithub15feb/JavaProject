package com.durga.program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class STringtest {

	public static void main(String[] args) throws IOException {
		
		String s1 = "ABC";
		String s2 = "ABC";
		
		System.out.println(s1+":"+s2);
		
		s1 = "DEF";
		s2 = "DEF";
		
		System.out.println(s1+":"+s2);
	
		s1 = s1+"GHI";
		s2 = s2+s1;
		System.out.println(s1+":"+s2);
		
		File file = new File("C:\\Users\\Ashok\\Desktop\\ID.txt");
		Reader in = new FileReader(file );
		BufferedReader br = new BufferedReader(in);
		
		String row ;
		
		Pattern pattern = Pattern.compile("[0-9]+");
		
		while((row = br.readLine()) != null)
		{
			
			Matcher matcher = pattern.matcher(row);
			
			if(matcher.matches())
			{
				System.out.println(row);
			}
			else {
				System.out.println("not match");
			}
		}
		
		br.close();
	}
}

