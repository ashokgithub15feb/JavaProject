package com.durga.program.collection;

import java.util.Arrays;
import java.util.Comparator;

public class HashMapDemo {

	 public static void main(String[] args) 
	 {
         String[] ar = { "c", "d", "b", "a", "e" };
     
         NestedClass in = new NestedClass();
         
         Arrays.sort(ar, in);
         
         for (String str : ar)
         {
        	 System.out.print(str + " ");
         }
         
         //The array must be sorted into ascending order according to the
         System.out.println("\n"+Arrays.binarySearch(ar, "b"));
  }

  static class NestedClass implements Comparator<String> 
  {
         public int compare(String s1, String s2) 
         {
                return -s2.compareTo(s1);
         }
  }
}