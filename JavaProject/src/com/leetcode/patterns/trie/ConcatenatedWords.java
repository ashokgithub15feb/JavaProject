package com.leetcode.patterns.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatenatedWords {

	private static Node root; 
	private static List<String> ans = new ArrayList<>();
	
	public static class Node
	{
		Node[] childs = new Node[26];
		String str;
		boolean added;
	}
	
	public static void main(String[] args) {
	
		String[] words = {"cat","dog","catdog"};
		
		//String[] words = {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
				
		//String[] words = {"cat","dogbat","catdog","bat","catdogbat"};
		
		List<String> result = findAllConcatenatedWordsInADistinct(words);
		
		System.out.println("List of words: "+Arrays.toString(words));
		System.out.println("Find All Concatenated Words in a Distinct: "+result);
	}
	
	 public static List<String> findAllConcatenatedWordsInADistinct(String[] words) {
	 
		 root = new Node();
		 for(String word : words)
		 {
			 insert(root, word);
		 }
		 
		 search1(root);
		 List<String> list = new ArrayList<>(ans);
		 return list;
	 }

	private static void insert(Node curr, String word) {
		
		for(int i=0; i<word.length(); i++)
		{
			char ch = word.charAt(i);
			
			if(curr.childs[ch - 'a'] == null)
			{
				curr.childs[ch - 'a'] = new Node();
			}
			
			curr = curr.childs[ch - 'a'];
		}
		
		curr.str = word;
	}

	private static void search1(Node curr) {
		
		if(curr.str != null)
		{
			search(curr, root);
		}
		
		for(Node child : curr.childs)
		{
			if(child != null)
			{
				search1(child);
			}
		}
	}

	private static void search(Node curr, Node newWord) {
		
		if(curr.str != null && newWord.str !=  null)
		{
			if(curr.added == false)
			{
				ans.add(curr.str);
			}
			curr.added = true;
			//curr.str = null;
		}
		
		if(newWord.str != null)
		{
			search(curr, root);
		}
		
		for(int i=0; i<26; i++)
		{
			if(curr.childs[i] != null && newWord.childs[i] != null)
			{
				search(curr.childs[i], newWord.childs[i]);
			}
		}
	}
	 
}
