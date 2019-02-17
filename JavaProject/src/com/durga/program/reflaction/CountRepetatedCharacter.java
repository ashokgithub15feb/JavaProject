package com.durga.program.reflaction;

public class CountRepetatedCharacter {

	public static void main(String[] args)
	{
		String input = "zookeeeper";
		
		char[] ch = input.toCharArray();
		
		input="";
		
		for(int i=0; i<ch.length;i++)
		{
			int count = 1;
			while(i < ch.length-1 && ch[i] == ch[i+1])
			{
				count++;
				i++;
			}
			
			if(count > 1)
			{
				input = input + count;
			}
			
			input = input + ch[i];
		}
		System.out.println(input);
		
		System.out.println("===============================");
		
		String st = "zookeeper kafka hadoop";
		
		byte[] bytes = st.getBytes();
		byte[] bytes1 = new byte[bytes.length];
		
		for(int i=0; i<bytes.length;i++)
		{
			bytes1[i] = bytes[bytes.length-i-1];
		}
		
		System.out.println(new String(bytes1));
		
		reverseOfString(st);
		String reverseOfStringRecursion = reverseOfStringRecursion(st);
		
		System.out.println(reverseOfStringRecursion);
	}

	private static void reverseOfString(String st) {

		char[] charArray = st.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i=charArray.length-1;i>=0;i--)
		{
			sb.append(charArray[i]);
		}
		
		System.out.println(sb.toString());
	}
	
	private static String reverseOfStringRecursion(String st) {

		if(st == null || st.length() == 1)
		{
			return st;
		}
		return reverseOfStringRecursion(st.substring(1))+st.charAt(0);
	}
}
