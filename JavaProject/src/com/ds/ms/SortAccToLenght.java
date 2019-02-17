package com.ds.ms;

public class SortAccToLenght {

	public static void main(String[] args) {
		
		String s = "I am Ashok Kumar from Ballia";
		
		String[] sp = s.split(" ");
		
		for(int i=1; i< sp.length;i++)
		{
			String sl = sp[i];
			
			int j = i-1;
			
			while(j >= 0 && sl.length() < sp[j].length())
			{
				sp[j+1] = sp[j];
				j--;
			}
			sp[j+1] = sl;
		}
		
		for (int i = 0; i < sp.length; i++) {
			System.out.println(sp[i]+" ");
		}
	}
}
