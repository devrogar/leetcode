package com.devrogar.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * {@link https://leetcode.com/problems/implement-trie-prefix-tree/}
 * 
 * @author Rohit G
 *
 */
public class P208 {

	public static void main(String[] args) {
		Trie trie = new Trie();
		long start = System.currentTimeMillis();
		trie.insert("apple");
		System.out.println(trie.search("apple") + " -> " + (System.currentTimeMillis() - start) + "ms");   // returns true
		System.out.println(trie.search("app") + " -> " + (System.currentTimeMillis() - start) + "ms");   // returns false
		System.out.println(trie.startsWith("app") + " -> " + (System.currentTimeMillis() - start) + "ms"); // returns true
		trie.insert("app");   
		System.out.println(trie.search("app") + " -> " + (System.currentTimeMillis() - start) + "ms"); // returns true
	}

	private static class Trie {

		private Set<String> set;
		private Set<String> prefixSet;

		/** Initialize your data structure here. */
		public Trie() {
			this.set = new HashSet<>();
			this.prefixSet = new HashSet<>();
		}

		/** Inserts a word into the trie. */
		public void insert(String word) {
			set.add(word);
			for (int i=1;i<word.length();i++) {
				prefixSet.add(word.substring(0, i));
			}
		}

		/** Returns if the word is in the trie. */
		public boolean search(String word) {
			return set.contains(word);
		}

		/**
		 * Returns if there is any word in the trie that starts with the given prefix.
		 */
		public boolean startsWith(String prefix) {
			if (set.contains(prefix) || prefixSet.contains(prefix)) {
				return true;
			}
			return false;
		}
	}

	// Your Trie object will be instantiated and called as such:
	// Trie obj = new Trie();
	// obj.insert(word);
	// boolean param_2 = obj.search(word);
	// boolean param_3 = obj.startsWith(prefix);

}
