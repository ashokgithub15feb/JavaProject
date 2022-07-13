package com.log.mask;

import java.util.HashSet;
import java.util.Stack;

public class JsonMaskingPropertiesUtil {

	static HashSet<String> propList;
	static HashSet<Character> chSet = new HashSet<>();
	
	static
	{
		propList = new HashSet<>();
		propList.add("cardNumber");
		propList.add("trackData");
		propList.add("serviceCode");
		
		chSet.add('{');
		chSet.add('}');
		chSet.add('[');
		chSet.add(']');
		
		
	}
	
	public static String doMaskProp(String str) {
		
		for(String maskProperty : propList)
		{
			int idx = str.indexOf(maskProperty);
			
			if(idx >= 0)
			{
				int endOfPropertyIdx = idx + maskProperty.length() + 2;
				String firstPart = str.substring(0, endOfPropertyIdx);
				String secondPart = str.substring(endOfPropertyIdx);
				
				String[] nextStr = removedData(secondPart);
				String maskedStr = "{HIDDEN_DATA}";
				
				char chAt0 = nextStr[0].charAt(0);
				
				if(chAt0 == '{')
				{
					maskedStr = doMaskProp(nextStr[0]);
				}else if(chAt0 == '[')
				{
					maskedStr = processArrayString(nextStr[0]);
				}else {
					maskedStr = PanMasker.mask(nextStr[0]);
				}
				
				StringBuilder sb = new StringBuilder();
				sb.append(firstPart).append(maskedStr).append(nextStr[1]);
				str = sb.toString();
			}
		}
		
		return str;
	}

	private static String processArrayString(String str) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		Stack<Integer> st = new Stack<>();
		
		for(int i=1; i<str.length()-1; i++)
		{
			char ch = str.charAt(i);
			
			if(chSet.contains(ch))
			{
				if(ch == '[' || ch == '{')
				{
					st.push(i);
				}else if(ch == ']')
				{
					if(str.charAt(st.peek()) == '[')
					{
						String subStr = str.substring(st.peek(), i+1);
						st.pop();
						String maskedStr = processArrayString(subStr);
						sb.append(maskedStr).append(",");
					}
					else {
						st.push(i);
					}
				}else if(ch == '}') {
					if(str.charAt(st.peek()) == '{')
					{
						String subStr = str.substring(st.peek(), i+1);
						st.pop();
						String mskedStr = doMaskProp(subStr);
						sb.append(mskedStr).append(",");
					}
					else
					{
						st.push(i);
					}
				}else {
					st.push(i);
				}
			}
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		
		return sb.toString();
	}

	private static String[] removedData(String str) {
		
		str = str.trim();
		int idx = str.length();
		
		if(str.charAt(0) == '{' || str.charAt(0) == '[')
		{
			idx = findNextClosingIdx(str) + 1;
		}else
		{
			idx = findNextChar(str, ',');
		}
		
		String originalValue = str.substring(0, idx);
		String restOfString = str.substring(idx);
		
		return new String[] {originalValue, restOfString};
	}

	private static int findNextChar(String str, char c) {
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == c)
			{
				return i;
			}
		}
		return str.length();
	}

	private static int findNextClosingIdx(String str) {

		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			
			if(chSet.contains(c))
			{
				if(c == ']')
				{
					if(stack.peek() == '[')
					{
						stack.pop();
					}
					else
					{
						stack.push(c);
					}
				}else if(c == '}')
				{
					if(stack.peek() == '{')
					{
						stack.pop();
					}
					else
					{
						stack.push(c);
					}
				}else {
					stack.add(c);
				}
				
				if(stack.isEmpty())
				{
					return i;
				}
			}
		}
		return str.length();
	}

}
