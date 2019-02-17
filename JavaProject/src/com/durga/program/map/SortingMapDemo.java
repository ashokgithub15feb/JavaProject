package com.durga.program.map;

import java.util.TreeMap;

public class SortingMapDemo {

	public static void main(String[] args) {
		
		TreeMap t = new TreeMap();
		t.put(101, "Ashok");
		t.put(103, "dURGA");
		t.put(106, "rAVI");
		t.put(102, "pAWAN");
		//t.put(null, "Null");
		t.put("1010", "1010");
		System.out.println(t);
	}
}
