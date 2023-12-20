package com.ds.program;

import java.util.HashMap;
import java.util.Map;

public class ImmuatleTest {

	public static void main(String[] args) throws InterruptedException {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("k1", "v1");
		Address address = new Address(101, "560100", "Bangalore");
		
		ImmuatleStudent stud = new ImmuatleStudent("Nokia", "India", map, address);
		
		map.put("k2", "v2");
		map.put("k2", "v3");
		
		
		ImmuatleStudent stud1 = new ImmuatleStudent("Nokia", "Koriya", map, address);
		
		String name = stud.getName();
		String country = stud.getCountry();
		address.setSipCode("560001");
		System.out.println(name+":"+country+":"+stud.getDate()+":"+stud.getMap()+":"+stud.getAddress().getSipCode());
		
		//Thread.currentThread().sleep(5000);
		
		String name1 = stud1.getName();
		String country1 = stud1.getCountry();
		
		System.out.println(name1+":"+country1+":"+stud1.getDate()+":"+stud1.getMap()+":"+stud.getAddress().getSipCode());
		
	}
}
