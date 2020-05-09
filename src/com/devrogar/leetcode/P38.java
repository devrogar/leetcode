package com.devrogar.leetcode;

/**
 * 
 * {@link https://leetcode.com/problems/count-and-say/}
 * 
 * @author Rohit G
 *
 */
public class P38 {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		long start = System.currentTimeMillis();
		System.out.println(solution.countAndSay(1) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.countAndSay(6) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.countAndSay(30) + " -> " + (System.currentTimeMillis()-start) + "ms");
	}
	
	/*
	 * Sequence is as follows,
	 * 
	 * 1.     1		-> read as one one (which will become next sequence)
	 * 2.     11		-> read as two ones				[21]
     	 * 3.     21		-> read as one two & one one			[1211]
     	 * 4.     1211		-> read as one one & one two & two ones 	[111221]
     	 * 5.     111221	-> read as three ones & two twos & one one 	[312211]
     	 * ..
	 */
	private static class Solution {
		
	    public String countAndSay(int n) {
	    	StringBuilder builder = new StringBuilder("1");
	    	for (int i=2;i<=n;i++) {
	    		int count = 0;
	    		String s = builder.toString();
	    		builder.setLength(0);
	    		int j = 0;
	    		char current = s.charAt(j);
	    		while (j<s.length()) {
	    			if (s.charAt(j) == current) {
	    				count++;
	    			} else {
	    				builder.append(count);
	    				builder.append(current);
	    				current = s.charAt(j);
	    				count = 1;
	    			}
	    			j++;
	    		}
	    		if (j == s.length()) {
	    			builder.append(count);
    				builder.append(current);
	    		}
	    	}
	        return builder.toString();
	    }
	    
	}

}
