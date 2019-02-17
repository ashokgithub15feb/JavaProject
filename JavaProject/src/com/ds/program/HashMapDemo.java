package com.ds.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {

	public static final Map<Integer, Float> RunOffTackle_34Defense = new HashMap<Integer, Float>() {{
	    put(-99, 1f);  //1 fumble per 100 hand-offs
	    put(-1,  4f);
	    put( 0,  5f);
	    put( 1,  9f);
	    put( 2,  11f);
	    put( 3,  15f);
	    put( 4,  15f);
	    put( 5,  11f);
	    put( 6,  9f);
	    put( 7,  5f);
	    put( 8,  4f);
	    put( 9,  3f);
	    put(10,  3f);
	    put(12,  2f);
	    put(15,  2f);
	    put(20,  1f);
	}};
	
	public static void main(String[] args) {
		
		final HashMap<String, String> map = new HashMap<>();
		map.put("A1", "a1");
		map.put("A2", "a2");
		map.put("A3", "a3");
		map.put("A4", "a4");
		map.put("A4", "a5");
		
		System.out.println(map);
		
		System.out.println();
		
		System.out.println("null");
		
		System.out.println(RunOffTackle_34Defense);
		System.out.println();
		
		List<String> list = new ArrayList<>();
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add("a4");
		list.add("a5");
		list.add("a6");
		
		System.out.println(list);
		
		List<String> unmodifiableList = Collections.unmodifiableList(list);
		list.add("aa7");
		//unmodifiableList.add("aa8");
		System.out.println(unmodifiableList);
		
	}
}
