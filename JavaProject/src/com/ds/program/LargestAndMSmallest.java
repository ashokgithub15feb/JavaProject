package com.ds.program;

import java.util.Arrays;

public class LargestAndMSmallest {

	public static void main(String[] args) {
		
		int[] num = {2,1,55,44,77,-9,-5513692,-77,-989,55,8888};
		
		int largest = num[0];
		int smallest = num[0];
		
		for(int i=1; i<num.length;i++)
		{
			if(num[i] > largest)
			{
				largest = num[i];
			}
			else if(num[i] < smallest)
			{
				smallest = num[i];
			}
		}
		System.out.println("Array is: "+Arrays.toString(num));
		System.out.println("Largest: "+largest);
		System.out.println("Smallest: "+smallest);
		
	}
}
