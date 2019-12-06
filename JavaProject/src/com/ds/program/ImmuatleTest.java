package com.ds.program;

import java.util.HashMap;
import java.util.Map;

public class ImmuatleTest {

	public static void main(String[] args) throws InterruptedException {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("k1", "v1");
		
		ImmuatleStudent stud = new ImmuatleStudent("Nokia", "India", map);
		
		map.put("k2", "v2");
		map.put("k2", "v3");
		
		
		ImmuatleStudent stud1 = new ImmuatleStudent("Nokia", "Koriya", map);
		
		String name = stud.getName();
		String country = stud.getCountry();
		
		System.out.println(name+":"+country+":"+stud.getDate()+":"+stud.getMap());
		
		Thread.currentThread().sleep(5000);
		
		String name1 = stud1.getName();
		String country1 = stud1.getCountry();
		
		System.out.println(name1+":"+country1+":"+stud1.getDate()+":"+stud1.getMap());
		
	}
}
