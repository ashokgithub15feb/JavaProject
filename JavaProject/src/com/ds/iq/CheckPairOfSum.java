package com.ds.iq;

import java.util.Arrays;

public class CheckPairOfSum {

	public static void main(String[] args) {
		
		int[] arr = {1, 4, 45, 6, 10, -8};
		int r = arr.length-1;
		int sum = 16;
		int l = 0;
		System.out.println("Before sort: "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sort: "+Arrays.toString(arr));
		while(l < r)
		{
			if(arr[l] + arr[r] == sum)
			{
				System.out.println(sum);
				System.out.println(arr[l]+":"+arr[r]);
				
				break;
			}
			else if(arr[l] + arr[r] < sum)
			{
				l++;
			}
			else
			{
				r--;
			}
		}
	}
}
