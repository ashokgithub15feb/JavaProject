package com.leetcode.patterns.iq.arrays;

import java.util.Arrays;

public class SortZeroOneTwoArray {

	public static void main(String[] args) {
		
		int[] arr = {0,2,1,1,1,0,0,0,2,2,2,0,0,0,1,2,1,1};
		
		System.out.println(Arrays.toString(arr));
		
		int zero = 0;
		int one = 0;
		int two = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == 0) zero++;
			if(arr[i] == 1) one++;
			if(arr[i] == 2) two++;
		}
		
		System.out.println("Zero: "+zero+", One: "+one+", Two: "+two);
		
		for(int i=0; i<zero; i++) arr[i] = 0;
		for(int i=zero; i<zero+one; i++) arr[i] = 1;
		for(int i=zero+one; i<arr.length; i++) arr[i] = 2;
		
		System.out.println(Arrays.toString(arr));
	}
}
