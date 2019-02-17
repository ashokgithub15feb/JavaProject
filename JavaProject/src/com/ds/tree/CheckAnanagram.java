package com.ds.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckAnanagram {

	public static void main(String[] args) {
		
		
		Map<String, String> map = new HashMap<>();
		map.put("Ahsok", "oksAh");
		map.put("AshokKumar", "oksAhKumpa");
		
		String s1 = "Ahsok ";
		String s2 = "oksAh";
		
		
		for(Map.Entry<String, String> en : map.entrySet())
		{
			checkAnagram(en.getKey(), en.getValue());
		}
		
//		
//		checkAnagram(s1, s2);
//		
//		String s3 = "AshokKumar";
//		String s4 = "oksAhKumpa";
//		
//		checkAnagram(s3,s4);
	}

	private static void checkAnagram(String s1, String s2) 
	{
		
		String s11 = s1.replaceAll("\\s", "");
		String s22 = s2.replaceAll("\\s", "");
		
		if(s11.length() != s22.length())
		{
			return;
		}
		
		char[] c1 = s11.toCharArray();
		char[] c2 = s22.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		
		boolean status = equals(c1, c2);
		
		if(status)
		{
			System.out.println("Anagram: "+s1+":"+s2);
		}
		else
		{
			System.out.println("Not a Anagram: "+s1+":"+s2);
		}
	}
	
	public static boolean equals(char[] a, char[] a2) {
//        if (a==a2)
//            return true;
//        if (a==null || a2==null)
//            return false;
//
        int length = a.length;
//        if (a2.length != length)
//            return false;

        for (int i=0; i<length; i++)
            if (a[i] != a2[i])
                return false;

        return true;
    }
	
}
