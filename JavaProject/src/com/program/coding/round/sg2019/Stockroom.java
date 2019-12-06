package com.program.coding.round.sg2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Stockroom {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the No. of test cases");
		String line = br.readLine();
		
		int N = Integer.parseInt(line);
		
		for(int i=0; i< N ; i++)
		{
			System.out.println("Enter the No. of String for search engine:");
			int size = Integer.parseInt(br.readLine());
			
			List<String> input = new ArrayList<>();
			
			for(int j=0; j<size; j++)
			{
				input.add(br.readLine());
			}
			
			System.out.println("Inputs: "+input);
			
			Map<String, Integer> map = new LinkedHashMap<>();
			
			for(String str : input)
			{
				
				if(str.startsWith("top"))
				{
					int n = Integer.parseInt(str.split(" ")[1]);
					
					List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
					
					Collections.sort(list , new Comparator<Map.Entry<String, Integer>>() {
						
						@Override
						public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
							
							if(o1.getValue() > o2.getValue())
							{
								return 1;
							}else if(o1.getValue() < o2.getValue())
							{
								return -1;
							}else
							{
								return 0;
							}
						}
					});
					
					List<String> uniqueList = new ArrayList<>();
					
					for(Map.Entry<String, Integer> entry : list)
					{
						if( n == 0)
						{
							break;
						}
						uniqueList.add(entry.getKey());
						n--;
					}
					
					System.out.println("Unique List: "+uniqueList);
					
					for(String unqLst : uniqueList)
					{
						System.out.print(unqLst+" ");
					}
					
					System.out.println();
					continue;
				}
				
				if(map.containsKey(str))
				{
					map.put(str, map.get(str)+1);
				}
				else
				{
					map.put(str, 1);
				}
			}
			
		}
		
	}
}
