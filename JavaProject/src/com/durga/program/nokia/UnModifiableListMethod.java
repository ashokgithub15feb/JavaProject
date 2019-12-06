package com.durga.program.nokia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.omg.CORBA.UNKNOWN;

public class UnModifiableListMethod {

	public static void main(String[] args) {
		
		List<Integer> modifiable = new ArrayList<>();
		modifiable.add(2000);
		modifiable.add(4000);
		modifiable.add(1000);
		modifiable.add(5000);
		modifiable.add(6000);
		modifiable.add(2000);
		
		System.out.println("Modifiable List: "+modifiable);
		
		List<Integer> unmodifiableList = Collections.unmodifiableList(modifiable);
		
		System.out.println("UnmodifiableList List: "+unmodifiableList);
		
		modifiable.add(9000);
		modifiable.add(7000);
		
		System.out.println("UnmodifiableList List: "+unmodifiableList);
		
		modifiable.add(null);
		
		System.out.println("UnmodifiableList List: "+unmodifiableList);
		
		//unmodifiableList.add(80800); // java.lang.UnsupportedOperationException
		System.out.println("UnmodifiableList List: "+unmodifiableList);
	
 		
		int[] i1 = {10,20, 30,40, 50};
		List<Integer> list = null;
		for(Integer i : i1)
		{
			list = Collections.singletonList(i);
			
			list.forEach(System.out::println);
		}
		
		
		
		List<int[]> list1 = new ArrayList<int[]>();
		
	}
}
