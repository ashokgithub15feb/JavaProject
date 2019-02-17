package com.ds.linkedlist;

public class PermutationImpl {

	
	private static int count;

	public static void main(String[] args) {
		
		String str = "ATSC";
		int n = str.length();
		
		permutation(str, 0, n-1,"CAT");
		
		System.out.println("Match Pattern Count is: "+count);
	}

	private static void permutation(String str, int l, int r, String CAT) {
		
		if(l == r)
		{
			System.out.println(str);
			
			if(str.contains(CAT))
			{
				count++;
				System.out.println("Matched pattern: "+CAT);
			}
			
		}
		else
		{
			for(int i=l;i<=r;i++)
			{
				str = swap(str, l,i);
				permutation(str, l+1, r, CAT);
				str = swap(str, l,i);
				
			}
		}
	}

	private static String swap(String str, int i, int j) {
		
		char[] ch = str.toCharArray();
		
		char tmp = ch[i];
		ch[i] = ch[j];
		ch[j] = tmp;
		return String.valueOf(ch);
	}
}
