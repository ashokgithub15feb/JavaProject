package com.ds.algo;

public class BinarySearchAlgo {

	private static int[] A = {3, 6, 8, 12, 14, 17, 25, 29, 31, 36, 42, 47, 53, 55, 62};
	
	
	public static void main(String[] args) {
		
		int[] A = {3, 6, 8, 12, 14, 17, 25, 29, 31, 36, 42, 47, 53, 55, 62};
		
		int key = 47;
		
		int len = A.length;
		
		int middleIndex = binSearch(A, len, key);
		
		if(key == A[middleIndex])
		{
			System.out.println("Search Key is: "+A[middleIndex]);
		}
		else {
			System.err.println("Search Key Not Found.");
		}
		
		middleIndex = recBinarySearch(key, len);
		
		if(key == A[middleIndex])
		{
			System.out.println("Search Key is: "+A[middleIndex]);
		}
		else {
			System.err.println("Search Key Not Found.");
		}
		
	}

	private static int recBinarySearch(int key, int n) {
		int l = 0;
		int h = n;
		return recurrcivilyBinarySearch(l, h, key);
	}

	private static int recurrcivilyBinarySearch(int l, int h, int key) {
		
		if(l == h)
		{
			if(A[l] == key)
			{
				return l;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			int mid = (l + h) / 2;
			
			if(key == A[mid])
			{
				return mid;
			}
			else if(key < A[mid])
			{
				return recurrcivilyBinarySearch(l, mid-1, key);
			}
			else
			{
				return recurrcivilyBinarySearch(mid+1, h, key);
			}
		}
	}

	private static int binSearch(int[] A, int n, int key) {
		
		int l = 0;
		int h = n;
		
		while( l <= h)
		{
			int mid = (l + h)/2;
			
			if(key == A[mid])
			{
				return mid;
			}
			else if(key < A[mid])
			{
				h = mid - 1;
			}
			else
			{
				l = mid + 1;
			}
		}
		
		return 0;
	}
}
