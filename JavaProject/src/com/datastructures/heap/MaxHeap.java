package com.datastructures.heap;

import java.util.Arrays;
import java.util.Iterator;

public class MaxHeap {

	public void insert(int[] h, int n) {
		System.out.println("Input: "+Arrays.toString(h));
		int i = n;
		int temp = 0;
		
		temp = h[n];
		// i/2 = parent node
		while(i > 1 && temp > h[i/2]) {
			h[i] = h[i/2];
			i = i/2;
		}
		
		h[i] = temp;
		
		System.out.println(Arrays.toString(h));
	}
	
	public void delete(int[] h, int n) {
		System.out.println("Input: "+Arrays.toString(h));
		int i = 0;
		int j = 0;
		int x = 0;
		int val = 0;
		
		val = h[1];
		x = h[n];
		
		h[1] = h[n];
		i = 1;
		j = i * 2;
		 
		 while(j < n - 1) {
			 if(h[j+1] > h[j]) {
				 j++;
			 }
			 if(h[i] < h[j]) {
				 int temp = h[i];
				 h[i] = h[j];
				 h[j] = temp;
				 i = j;
				 j = 2 * j;
			 }
			 else {
				 break;
			 }
		 }
		 h[n] = val;
		 
		 System.out.println(Arrays.toString(h));
	}
	
	public static void main(String[] args) {
		
		int[] h = {0, 2, 5, 8, 9, 4, 10, 7};
		
		MaxHeap heap = new MaxHeap();
		
		for (int i = 1; i < h.length; i++) {
			heap.insert(h, i);
		}
		
		
//		heap.insert(h, 1);
//		heap.insert(h, 2);
//		heap.insert(h, 3);
//		heap.insert(h, 4);
//		heap.insert(h, 5);
//		heap.insert(h, 6);
//		heap.insert(h, 7);
		System.out.println("delete");
		heap.delete(h, 7);
		heap.delete(h, 6);
	}
}
