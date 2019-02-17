package com.ds.program;

public class CountElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,1,2,3,3,3,32};
		
		int len = arr.length;
		
		int x = 3;
		int count = 0;
		
		for(int i=0; i<len ;i++)
		{
			if(x == arr[i])
			{
				count++;
			}
			
		}
		System.out.println(count);
	}
}
