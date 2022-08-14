package com.leetcode.patterns.trie;

import java.util.ArrayList;
import java.util.List;

public class IndexPairsOfAString {

	static class Trie
	{
		boolean is;
		Trie[] ch = new Trie[26];
	}
	
	public static void main(String[] args) {
		
		String text = "ababa";
		String[] words = {"aba", "ba"};
		
		int[][] result = indexPair(text, words);
		
		for(int i=0; i<result.length; i++)
		{
			for(int j=0; j<result[i].length; j++)
			{
				System.out.print(result[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}

	private static int[][] indexPair(String text, String[] words) {
		
		Trie root = new Trie();
		
		for(String word : words)
		{
			insert(root, word);
		}
		
		List<int[]> list = new ArrayList<>();
		
		for(int i=0; i<text.length(); i++)
		{
			Trie node = root;
			
			for(int j=i; j<text.length(); j++)
			{
				int ch = text.charAt(j);
				
				if(node.ch[ch - 'a'] == null)
				{
					break;
				}
				
				node = node.ch[ch - 'a'];
				
				if(node.is)
				{
					list.add(new int[] {i, j});
				}
			}
		}
		return list.stream().toArray(int[][]::new);
	}


	private static void insert(Trie root, String word) {
		
		for(int i=0; i<word.length(); i++)
		{
			int ch = word.charAt(i);
			
			if(root.ch[ch - 'a'] == null)
			{
				root.ch[ch - 'a'] = new Trie();
			}
			
			root = root.ch[ch - 'a'];
		}
		root.is = true;
	}
}
