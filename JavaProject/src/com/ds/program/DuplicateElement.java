package com.ds.program;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElement {

	public static void main(String[] args) {
		
		String[] a = {"A","S","E","C","D","DD","D"};
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<a.length;i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i])+1);
			}
			else
			{
				map.put(a[i], 1);
			}
		}
		
		map.entrySet().forEach(key -> {
			
			if(key.getValue()>1)
			{
				System.out.println(key);
			}
			
		});
	}
}
