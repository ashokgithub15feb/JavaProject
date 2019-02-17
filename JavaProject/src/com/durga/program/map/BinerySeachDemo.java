package com.durga.program.map;

import java.io.Serializable;
import java.util.Arrays;

public class BinerySeachDemo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7228636767798235822L;
	private static final long serialVersionUID1 = 7228636767798235822L;
	static int[] arr = { 10, 20, 50, 89, 60, 40, 87, 70, 90 };
	static int key = 4;
	
	private String name = "Ashok";
	private String num = "7204389496";
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public static int index = linearSearch(arr, key);
	
	public static void main(String[] args) {
		int[] arr = { 10, 20, 50, 30, 60, 40, 80, 70, 90 };
		int key = 4;
		
		Arrays.sort(arr);
		binerySearch(arr, key);
		
		System.out.println("Index found: "+index);
	}

	private static int linearSearch(int[] arr, int key) {
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] == key)
			{
				return i;
			}
		}
		
		return -1;
	}

	private static void binerySearch(int[] arr, int key) {

		int first = 0;
		int last = arr.length-1;
		int middle = (first + last)/2;
		
		while(first <= last)
		{
			if(arr[middle] < key)
			{
				first = middle+1;
			}
			else if(arr[middle] == key)
			{
				System.out.println(key+" found at location: "+(middle+1)+".");
				break;
			}else
			{
				last = middle-1;
			}
			
			middle = (first+last)/2;
		}
		
		if(first > last)
		{
			System.out.println(key+" not present in this list");
		}
	}
}
