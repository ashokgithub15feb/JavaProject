package com.ds.program;

public class Duplicate {

	public static void main(String[] args) {
		
		int[] a = {2,3,4,4,5,5,6,6,7,7,9,8,8,9,9,9,0,0,0,0,4};
		
		int x;
		
		for(int i=0; i< a.length ;i++)
		{
			boolean flag = true;
			
			x = a[i];
			for(int j=0; j<a.length;j++)
			{
				if(x == a[j] && i != j)
				{
					if(j> i)
					{
						if(flag)
						{
							System.out.print(a[j]+" ");
							flag = false;
						}
						System.out.print(a[j]+" ");
					}
					else
					{
						break;
					}
				}
			}
		}
	}
}
