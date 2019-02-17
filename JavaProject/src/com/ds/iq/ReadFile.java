package com.ds.iq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Ashok\\Desktop\\f.txt");
		
		Reader in = new FileReader(f);
		BufferedReader br = new BufferedReader(in );
		
		String row;
		List<String> k = new ArrayList<>();
		List<String> v = new ArrayList<>();

		HashMap<String, Integer> m = new HashMap<>();
		
		while((row = br.readLine()) != null)
		{
			String[] split = row.split(" ");

			String k1 = row.replaceAll(" ", "#");
			
			String k2 = split[1]+"#"+split[0];

			if(m.containsKey(k1))
			{
				m.put(k1, m.get(k1)+1);
			}else if(m.containsKey(k2))
			{
				m.put(k2, m.get(k2)+1);
			}
			else
			{
				m.put(k1, 1);
			}
				
		}
		m.entrySet().forEach(System.out::println);
	}
}
