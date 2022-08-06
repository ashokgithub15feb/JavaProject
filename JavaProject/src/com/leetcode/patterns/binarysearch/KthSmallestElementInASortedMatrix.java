package com.leetcode.patterns.binarysearch;

public class KthSmallestElementInASortedMatrix {

	public static void main(String[] args) {
		
		int[][] matrix= {{1,5,9},
						 {10,11,13},
						 {12,13,15}
						};
		int k = 8;
		
		int kthElement = kthSmallestElement(matrix, k);
		
		System.out.println("Kth Smallest Element in a Sortedt Matrix is: "+kthElement);
	}

	private static int kthSmallestElement(int[][] matrix, int k) {
		
		int n = matrix.length;
		
		int start = matrix[0][0];
		int end = matrix[n-1][n-1];
		int mid = 0;
		
		while(start <= end)
		{
			mid = (start + end)/2;
			int ans = 0;
			
			for(int i=0; i<n; i++)
			{
				int low = 0;
				int high = n-1;
				int m = 0;
				
				while(low <= high)
				{
					m = low + (high - low)/2;
					
					if(matrix[i][m] <= mid)
					{
						low = m + 1;
					}
					else
					{
						high = m - 1;
					}
				}
				
				ans += low;
			}
			
			if(ans < k)
			{
				start = mid + 1;
			}
			else
			{
				end = mid - 1;
			}
		}
		
		return start;
	}
}
