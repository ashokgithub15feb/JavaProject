package com.ds.iq;

public class OcurrenceOfNumber {

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,3,4,5,3, 4,3,3,3,3, 4,4,4,4};
		
		int k = 3;
		int count = 0;
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] == k)
			{
				count++;
			}
		}
		
		System.out.println("Ocurrence Of Number "+k+" is "+count);
		
		String srt = "aa ss ss aa aa  aa aa aa aa aa aas ss sqq ssd w  sdcwdf weferf wf3r";
		
		String kstr = "aa";
		
		String[] arrstr = srt.split(" ");
		int countStr = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arrstr[i].equals(kstr))
			{
				countStr++;
			}
		}
		System.out.println("Ocurrence Of Number "+kstr+" is "+countStr);
	}
}
