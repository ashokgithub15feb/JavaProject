package com.durga.program.enummap;

import java.util.EnumMap;

public class EnumMapDemo {
	
	public enum GFG
	{
		CODE, CONTRIBUTE, MCQ, QUIZ ;
	}
	
	public static void main(String[] args) {
		
		EnumMap<GFG, String> enumMap = new EnumMap<>(GFG.class);
		
		enumMap.put(GFG.CODE, "Start Coding with GFG");
		enumMap.put(GFG.CONTRIBUTE, "Contribute for Other");
		enumMap.put(GFG.MCQ, "Test Speed with Mcq's");
		enumMap.put(GFG.QUIZ, "Particepte in Quizes");
		
        // of enum keys (order on which they are declared) 
		System.out.println(enumMap);
		
		System.out.println("Size id EnumMap: "+enumMap.size());
		
		
		System.out.println("Key:"+GFG.CODE+" Value: "+enumMap.get(GFG.CODE));
		
		
	}
}
