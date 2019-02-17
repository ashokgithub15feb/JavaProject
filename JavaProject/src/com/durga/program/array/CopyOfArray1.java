package com.durga.program.array;

import java.util.Arrays;

public class CopyOfArray1
{
	public static void main(String[] args) {
		
		//copyArray1(); 
		//copyArray2();
		//copyArrya3();
		//copyArray4();
		copyArrya5();
	}
	
	private static void copyArrya5()
	{
		int[] a = {12, 21, 0, 5, 7};
		
		int[] b = new int[a.length];
		
		// public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		System.arraycopy(a, 0, b, 0, a.length);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		a[3] = 30;
		
		System.out.println(b[3]); //value of 3rd element in array 'b' will not change
		System.out.println(a[3]);
		
		
		b[4] = 100;
		System.out.println(a[4]);
		System.out.println(b[4]);
		
	}
	private static void copyArray4()
	{
		int[] a = {12, 21, 0, 5, 7};
		
		int[] b = a.clone();
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		a[3] = 30;
		
		System.out.println(b[3]); //value of 3rd element in array 'b' will not change
		System.out.println(a[3]);
		
		
		b[4] = 100;
		System.out.println(a[4]);
		System.out.println(b[4]);
	}
	
	public static void copyArrya3()
	{
		int[] a = {12, 21, 0, 5, 7};
		
		int[] b = Arrays.copyOf(a, a.length);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		a[3] = 30;
		
		System.out.println(b[3]); //value of 3rd element in array 'b' will not change
		System.out.println(a[3]);
		
		
		b[4] = 100;
		System.out.println(a[4]);
		System.out.println(b[4]);
		
	}
	
	private static void copyArray2()
	{
		int[] a = {12, 21, 0, 5, 7};
		
		int[] b = new int[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0; i<a.length; i++)
		{
			b[i] = a[i];
		}
		
		System.out.println(b[3]);
		
		b[1] = 100;
		
		System.out.println(b[1]);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}
	private static void copyArray1() {
		
		int[] a = {12, 21, 0, 5, 7};
		
		int[]b = a;
		
		for(int i =0; i< a.length; i++)
		{
			System.out.print(b[i]+" ");
		} 
		
		a[2] = 56;
		System.out.println();
		System.out.println(b[2]);
		
		b[4] = 100;
		
		System.out.println(a[4]);
		
		for(int i =0; i< a.length; i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
