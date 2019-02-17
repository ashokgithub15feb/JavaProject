package com.ds.iq;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class I3InfoTech<N extends Object> {

	public static void main(String[] args) {
		
		Map m = new HashMap();
		m.put("K1", "V1");
		m.put("K2", "V2");
		m.put("K4", "V4");
		m.put("K3", "V3");

		Set s = m.keySet();
		
//		Arrays.sort(s);
		
//		Collections.sort(s);
		
		TreeSet ss = new TreeSet<>(s);
		
		System.out.println(ss);
		
		
		for(Object o : ss)
		{
			System.out.println(o);
		}
		
		
		Object[] aa = {new Integer(10),
					   new Float(10),
					   new String("10"),
					   new Double(20)};
		
//		Arrays.sort(aa);
		
		Collection cc = new LinkedList();
		cc.add("AAAA");
		cc.add("AAFA");
		cc.add("AACCA");
		
//		Collections.reverse(cc);
		
		
	}
}
