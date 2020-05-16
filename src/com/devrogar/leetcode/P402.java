package com.devrogar.leetcode;

/**
 * 
 * {@link https://leetcode.com/problems/remove-k-digits/}
 * 
 * @author Rohit G
 *
 */
public class P402 {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		long start = System.currentTimeMillis();
		System.out.println(solution.removeKdigits("1432219", 3) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.removeKdigits("10200", 1) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.removeKdigits("10", 2) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.removeKdigits(String.valueOf(Integer.MAX_VALUE), 6) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.removeKdigits("5337", 2) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.removeKdigits("100000", 1) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.removeKdigits("011", 1) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.removeKdigits("0000010", 1) + " -> " + (System.currentTimeMillis()-start) + "ms");
	}
	
	private static class Solution {
	    public String removeKdigits(String num, int k) {
	    	if (k >= num.length()) return "0";
	    	if (k == 0) return num;
	    	StringBuilder result = new StringBuilder();
	    	int n = 0;
	    	for (int i=0;i<num.length();i++) {
	    		n = result.length();
	    		if (n == 0 && num.charAt(i) == '0') continue;
	    		if (k > 0 && n > 0 && result.charAt(n-1) > num.charAt(i)) {
    				result.setLength(n-1);
    				i--;
    				k--;
    			} else {
    				result.append(num.charAt(i));
    			}
	    		n = result.length();
	    	}
	    	if (n-k <= 0) return "0";
	    	return result.substring(0, n-k);
	    }
	}

}
