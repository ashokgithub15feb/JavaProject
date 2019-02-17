package com.ds.array.sorting;

public class QuickSort {

	int i;
	int j;
	int[] a;
	
	public QuickSort(int[] a) {

		this.a = a;
	}
	
	public int partitioning(int l, int h)
	{
		int pivot = a[l];
		
		i = l;
		j = h;
		
		while(i <= j)
		{
			do
			{
				i++;
			}while(a[i]<= pivot);
			
			do
			{
				j--;
			}while(a[j] > pivot);
			
			if(i < j)
			{
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
				
				i++;
				j--;
			}
		}

		return j;
	}

	
	public void quickSort(int l, int h)
	{
		if(l < h)
		{
			j = partitioning(l, h);
			quickSort(l, j);
			quickSort(j+1, h);
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {10,16,8,12,15,16,3,9,5};
		
		QuickSort quickSort = new QuickSort(a);
		
		quickSort.quickSort(0, a.length);
		
		for(int i=0; i<a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}


final class AA
{
	public int a;
	
}