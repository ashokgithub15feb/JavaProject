package com.leetcode.patterns.trie;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrefixAndSuffixSearch {

	class Trie
	{
		Trie[] t;
		List<Integer> index;
		
		Trie()
		{
			t = new Trie[26];
			index = new ArrayList<>();
		}
		
		void insert(String word, int i)
		{
			Trie root = this;
			
			for(char ch : word.toCharArray())
			{
				if(root.t[ch - 'a'] == null)
				{
					root.t[ch - 'a'] = new Trie();
				}
				root = root.t[ch - 'a'];
				root.index.add(i);
			}
		}
		
		List<Integer> startWith(String word)
		{
			Trie root = this;
			
			for(char ch : word.toCharArray())
			{
				if(root.t[ch - 'a'] == null)
				{
					return new ArrayList<>();
				}
				root = root.t[ch - 'a'];
			}
			return root.index;
		}
	}
	
	Trie prefix = null;
	Trie suffix = null;
	
	public PrefixAndSuffixSearch(String[] words) {
		prefix = new Trie();
		suffix = new Trie();
		
		for(int i=0; i<words.length; i++)
		{
			prefix.insert(words[i], i);
			suffix.startWith(new StringBuffer(words[i]).reverse().toString());
		}
	}

	public int f(String pref, String suff) {

		List<Integer> pList = prefix.startWith(pref);
		List<Integer> sList = suffix.startWith(new StringBuffer(suff).reverse().toString());
		
		int i = pList.size()-1;
		int j = sList.size()-1;
		
		while(i >= 0 && j >= 0)
		{
			if(Objects.equals(pList.get(i), sList.get(j)))
			{
				return pList.get(i);
			}
			else if(pList.get(i) > sList.get(j))
			{
				i--;
			}
			else
			{
				j--;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		String[] wordsPrefAndSuff = {"apple", "applet", "ape"};
	    String prefix = "a";
	    String suffix = "e";		
			
	    PrefixAndSuffixSearch prefixAndSuffixSearch = new PrefixAndSuffixSearch(wordsPrefAndSuff);
			
	    int result = prefixAndSuffixSearch.f(prefix, suffix);
			
	    System.out.println("Result : "+result);
	}
}
