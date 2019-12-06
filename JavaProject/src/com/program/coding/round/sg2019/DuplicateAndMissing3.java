package com.program.coding.round.sg2019;

import java.util.HashMap;
import java.util.Map;

public class DuplicateAndMissing3 {

	public static void main(String[] args) {
		
		int[] a = {7, 2, 3, 4, 5, 1, 6,5,9 };
		
		int size = a.length;
		
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		for(int arr : a)
		{
			if(map.get(arr) == null)
			{
				map.put(arr, true);
			}
			else
			{
				System.out.println("Duplicate: "+arr);
			}
		}
		
		for(int i=1; i<=size;i++)
		{
			if(map.get(i) == null)
			{
				System.out.println("Missing: "+i);
			}
		}
	}
}
