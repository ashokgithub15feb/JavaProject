package com.ds.iq;

public class PermutationImpl {

	private static int count;
	private static int totalCount;
	

	public static void main(String[] args) {
		
		String pattern = "ATSC";
		String CAT =  "CAT";
		int n= pattern.length();
		permutation(pattern, 0, n-1, CAT);
		System.out.println("Matched Count: "+count);
		System.out.println("Matched Total Count: "+totalCount);
		
	}
	
	public static void permutation(String str, int l, int r, String CAT)
	{
		if(l == r)
		{
			totalCount++;
			if(str.contains(CAT))
			{
				System.out.println("Matched String: "+str);
				count++;
			}
		}
		else
		{
			for(int i=l; i<=r;i++)
			{
				str = swap(str, l,i);
				permutation(str, l+1, r, CAT);
				str = swap(str, l, i);
				System.out.println(str);
			}
		}
	}
	
	public static String swap(String str, int i, int j)
	{
		char[] ch = str.toCharArray();
		char tmp = ch[i];
		ch[i] = ch[j];
		ch[j] = tmp;
		
		return String.valueOf(ch);
	}
}
