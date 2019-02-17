package com.durga.program.collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo 
{
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}
}
class MyComparator implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		
		Integer I1  = (Integer) o1;
		Integer I2  = (Integer) o2;
		
		
		//return I1.compareTo(I2); //[0, 5, 10, 15, 20] [Ascending Order]

		//return -I1.compareTo(I2); //[20, 15, 10, 5, 0] [Descending Order]

		//return I2.compareTo(I1); //[20, 15, 10, 5, 0] [Descending Order]
		
		//return -I2.compareTo(I1); //[0, 5, 10, 15, 20] [Ascending Order]

		//return +1; //[10, 0, 15, 5, 20, 20] [Insertion Order]

		//return -1; //[20, 20, 5, 15, 0, 10] [Reverse Oder of insertion order]

		return 0; //[10] [only first element will be inserted remaining are duplicate]

		
		
		/*if(I1 < I2)
		{
			return +1;
		}
		else if(I1 > I2)
		{
			return -1;
		}
		else
		{
			return 0;
		}*/
	}
}
