package com.devrogar.leetcode;

/**
 * 
 * {@link https://leetcode.com/problems/implement-strstr/}
 * 
 * @author Rohit G
 *
 */
public class P28 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		long start = System.currentTimeMillis();
		System.out.println(solution.strStr("hello", "ll") + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.strStr("aaaaa", "bba") + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.strStr("mississippi", "issipi") + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.strStr("mississippi", "issip") + " -> " + (System.currentTimeMillis()-start) + "ms");
	}


}

class Solution {

	public int strStr(String haystack, String needle) {
		if (needle.length() == 0) return 0;
		int idx = -1;
		for (int i = 0;i<=haystack.length()-needle.length();i++) {
			int j = 0;
			for (;j<needle.length();j++) {
				if (haystack.charAt(i+j) != needle.charAt(j)) {
					break;
				}
			}
			if (j == needle.length()) {
				idx = i;
				break;
			}
		}
		return idx;
	}
	
}
