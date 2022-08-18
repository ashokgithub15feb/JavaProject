package com.leetcode.patterns.trie;

public class LongestWordInDictionary {

	private static String ans = "";
	
	static class Node
	{
		private Node[] childs = new Node[26];
		private String endStr = null;
	}

	public static void main(String[] args) {
		
		String[] words = {"w","wo","wor","worl","worla", "world"};
    	//String[] words = {"a","banana","app","appl","ap","apply","apple"};

		String result = longestWord(words);
		
		System.out.println("Longest Word In Dictionary: "+result);
	}

	private static String longestWord(String[] words) {
		
		Node root = new Node();
		
		for(String word : words)
		{
			insert(root, word);
		}
		
		dfs(root);
		return ans;
	}

	private static void dfs(Node root) {
		
		for(Node child : root.childs  )
		{
			if(child != null && child.endStr != null)
			{
				if(child.endStr.length() > ans.length())
				{
					ans = child.endStr;
				}
				dfs(child);
			}
			
		}
	}

	private static void insert(Node node, String word) {
		
		for(int i = 0; i<word.length(); i++)
		{
			char ch = word.charAt(i);
			
			if(node.childs[ch - 'a'] == null)
			{
				node.childs[ch - 'a'] = new Node();
			}
			
			node = node.childs[ch - 'a'];
		}
		node.endStr = word;
	}
}
