package com.leetcode.patterns.trie;

public class ImplementTrie {

	private class Node
	{
		Node[] childs;
		boolean isEnd;
		
		Node()
		{
			this.childs = new Node[26];
		}
	}
	
	private Node root;
	
	public ImplementTrie() {
		
		root = new Node();
	}
	
	public static void main(String[] args) {
		
		ImplementTrie implementTrie = new ImplementTrie();
		
		String[] words = {"Trie","insert","search","search","startsWith","insert","search", "apple"};
		
		for(String word : words)
		{
			System.out.println("Insert Word:  "+word);
			implementTrie.insert(word);
		}
		System.out.println("==========================================");
        String[] searchWord = {"Trie","insert","search","search","startsWith","insert","search"};
        for(String word : searchWord)
        {
        	boolean searchedResult = implementTrie.search(word);
        	System.out.println("Search '"+searchWord+"' word: "+searchedResult);
        }
		
        System.out.println("==========================================");
        
		String[][] prefix = {{},{"apple"},{"apple"},{"app"},{"app"},{"app"},{"app"}};
		
		for(String[] str : prefix)
		{
			for(String s : str)
			{
				boolean prefixResult = implementTrie.startsWith(s);
				System.out.println("Prefix '"+s+"' word: "+prefixResult);
			}
		}
		
	}

	private void insert(String word) {
		
		Node currentNode = root;
		
		for(int i=0; i<word.length(); i++)
		{
			char ch = word.toLowerCase().charAt(i);
			
			if(currentNode.childs[ch - 'a'] == null)
			{
				currentNode.childs[ch - 'a'] = new Node();
			}
			currentNode = currentNode.childs[ch - 'a'];
			
		}
		
		currentNode.isEnd = true;
	}
	
	private boolean search(String word)
	{
		Node currentNode = root;
		
		for(int i=0; i<word.length(); i++)
		{
			char ch = word.toLowerCase().charAt(i);
			
			if(currentNode.childs[ch - 'a'] == null)
			{
				return false;
			}
			
			currentNode = currentNode.childs[ch - 'a'];
		}
		
		return currentNode.isEnd;
	}
	
	private boolean startsWith(String prefix) {

		Node currentNode = root;
		boolean isFoundPrefix = true;
		
		for(int i=0; i<prefix.length(); i++)
		{
			char ch = prefix.toLowerCase().charAt(i);
			
			if(currentNode.childs[ch - 'a'] == null)
			{
				isFoundPrefix = false;
				
				return isFoundPrefix;
			}
			
			currentNode = currentNode.childs[ch - 'a'];
		}
		return isFoundPrefix;
	}

}
