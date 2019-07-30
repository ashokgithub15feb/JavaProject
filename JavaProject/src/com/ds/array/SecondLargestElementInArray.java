package com.ds.array;

import java.util.Scanner;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		
		//Time Compaxity O(n)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Print enter the size of array");
		
		int sz = sc.nextInt();
		
		int[] a = new int[sz];
		int[] b = new int[sz-1];
		
		int i = 0;
		int v = 0;
		
		System.out.println("Enter the elements:");
		
		for(i=0; i<sz ;i++)
		{
			a[i] = sc.nextInt();
		}
		
		v = a[0];
		
		for(i=1; i<sz;i++)
		{
			if(v < a[i])
			{
				b[i-1] = v;
				v = a[i];
			}
			else
			{
				b[i-1] = a[i];
			}
		}
		
		for(i=0; i<sz-1;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		v = b[0];
		
		for(i=1; i<sz-1; i++)
		{
			if(v < b[i])
			{
				v = b[i];
			}
		}
		
		System.out.println("\nSecond Largest Elements: "+v);
	}
}
