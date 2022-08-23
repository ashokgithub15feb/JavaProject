package com.leetcode.patterns.trie;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class AutocompleteSystem {

	class TrieNode {
		public boolean isLeaf;
		public List<String> cands;
		HashMap<Character, TrieNode> children;

		public TrieNode() {
			isLeaf = false;
			children = new HashMap<Character, TrieNode>();
			cands = new LinkedList<String>();
		}
	}

	class Trie {
		private TrieNode root;

		public Trie() {
			root = new TrieNode();
		}

		public void insert(String word) {
			TrieNode node = root;
			for (int i = 0; i < word.length(); i++) {
				HashMap<Character, TrieNode> children = node.children;
				char c = word.charAt(i);
				if (!children.containsKey(c)) {
					children.put(c, new TrieNode());
				}
				children.get(c).cands.add(word);
				if (i == word.length() - 1) {
					children.get(c).isLeaf = true;
				}
				node = node.children.get(c);
			}
		}
		
		private TrieNode searchNode(String pre) {
            HashMap<Character, TrieNode> children = root.children;
            TrieNode node = root;
            for (int i = 0; i < pre.length(); i ++) {
                if (!children.containsKey(pre.charAt(i))) {
                    return null;
                }
                node = children.get(pre.charAt(i));
                children = node.children;
            }
            return node;
        }
	}
	
	HashMap<String, Integer> count = new HashMap<String, Integer>();
    Trie trie = new Trie();
    String curr = "";
    
    public AutocompleteSystem(String[] sentences, int[] times) {
        for (int i = 0; i < sentences.length; i ++) {
            count.put(sentences[i], times[i]);
            trie.insert(sentences[i]);
        }
    }
    
    public List<String> input(char c) {
        List<String> res = new LinkedList<String>();
        if (c == '#') {
            if (!count.containsKey(curr)) {
                trie.insert(curr);
                count.put(curr, 1);
            }
            else {
                count.put(curr, count.get(curr) + 1);
            }
            curr = "";
        }
        else {
            curr += c;
            res = getSuggestions();
        }

        return res;
    }
    
    private List<String> getSuggestions() {
        List<String> res = new LinkedList<String>();
        TrieNode node = trie.searchNode(curr);
        if (node == null) {
            return res;
        }
        List<String> cands = node.cands;
        Collections.sort(cands, new Comparator<String>(){
            public int compare(String s1, String s2) {
                if (count.get(s1) != count.get(s2)) {
                    return count.get(s2) - count.get(s1);
                }
                return s1.compareTo(s2);
            } 
        });
        int added = 0; 
        for (String s:cands) {
            res.add(s);
            added ++;
            if (added > 2) {
                break;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
		
    	String[] sentences = {"i love you", "island","ironman", "i love leetcode"};
    	
		int[] times = {5,3,2,2};
		
		AutocompleteSystem obj = new AutocompleteSystem(sentences , times);
		char c = 'i';
		
		List<String> input = obj.input(c);
		
		System.out.println(input);
		
	}
}
