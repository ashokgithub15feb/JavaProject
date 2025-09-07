package com.leetcode.patterns.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearchII {

	class Trie
	{
		Trie[] childreen;
		boolean endOfWord;
		
		Trie()
		{
			childreen = new Trie[26];
			endOfWord = false;
		}
		
		void insert(String word)
		{
			Trie curr = this;
			
			for(char ch : word.toCharArray())
			{
				if(curr.childreen[ch - 'a'] == null)
				{
					curr.childreen[ch - 'a'] = new Trie();
				}
				curr = curr.childreen[ch - 'a'];
				
				System.out.println(toString());
			}
			curr.endOfWord = true;
		}

		@Override
		public String toString() {
			return "Trie [childreen=" + Arrays.toString(childreen) + ", endOfWord=" + endOfWord + "]";
		}
		
		
	}
	
	public void dfs(char[][] board, int i, int j, Set<String> result, Trie trie, String s)
	{
		char c = board[i][j];
		
		if(c == '$')
			return;
		
		board[i][j] = '$';
		
		Trie t = trie.childreen[c - 'a'];
		if(t != null)
		{
			String ss = s + c;
			
			if(t.endOfWord) result.add(ss);
			
			if(i < board.length-1) dfs(board, i + 1, j, result, t, ss);
			
			if(j < board[0].length-1) dfs(board, i, j + 1, result, t, ss);
			
			if(i > 0) dfs(board, i - 1, j, result, t, ss);
			
			if(j > 0) dfs(board, i, j - 1, result, t, ss);
		}
		
		board[i][j] = c;
	}
	
	public static void main(String[] args) {
		
		char[][] board = {{'o','a','a','n'}, 
						  {'e','t','a','e'}, 
						  {'i','h','k','r'}, 
						  {'i','f','l','v'}};
		
		String[] words = {"oath","pea","eat","rain"};
		
		WordSearchII wordSearchII = new WordSearchII();
		
		List<String> findWordsResult = wordSearchII.findWords(board, words);
		
		System.out.println("Search Words in Board: "+findWordsResult);
	}
	
	public List<String> findWords(char[][] board, String[] words) {
        
		List<String> finalResult = new ArrayList<>();
		
		if(words == null || words.length == 0) 
			return finalResult;
		
		Trie trie = new Trie();
		
		for(String word : words)
		{
			trie.insert(word);
		}
		
		Set<String> result = new HashSet<>();
		String emptyString = "";
		
		for(int i=0; i<board.length; i++)
		{
			for(int j=0; j<board[0].length; j++)
			{
				dfs(board, i, j, result, trie, emptyString);
			}
		}
		
		finalResult.addAll(result);
		
		return finalResult;
    }
}
