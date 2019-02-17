package com.durga.program.ps;

public class ProblemSolving1 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]+a[j] == 5)
				{
					System.out.print("{"+a[i]+","+a[j]+"}"+", ");
				}
			}
		}
		System.out.println();
		int sum = 5;
		m1(a, 0, a.length-1, sum);
	}

	private static void m1(int[] a, int l, int r, int sum) {

		if(l == r)
		{
			return;
		}
		else
		{
			for(int i=l+1; i<=r;i++)
			{
				int s = a[l]+a[i];
				
				if(s == sum)
				{
					System.out.print("{"+a[l]+","+a[i]+"}"+", ");
				}
			}
			
			m1(a, l+1, r, sum);
		}
		
	}
}
