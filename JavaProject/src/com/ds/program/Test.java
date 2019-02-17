package com.ds.program;

public class Test {

	public static void main(String[] args) {
		
		String str = "2335566";
		boolean flag = false;
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)-'0' < 0 || str.charAt(i)-'0' > 9)
			{
				flag = false;
				break;
			}
			else
			{
				flag=true;
			}
		}
		
		System.out.println(flag);
	}
}
