package com.program.coding.round.sg2019;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 3, 5, 7, 11,13, 17, 17};
		
		for(int ar : arr)
		{
			if(arr.equals(ar))
			{
				System.out.println(ar);
			}
		}
	}
}
