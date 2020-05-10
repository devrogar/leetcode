package com.devrogar.leetcode;

/**
 * 
 * {@link https://leetcode.com/problems/find-the-town-judge/}
 * 
 * @author Rohit G
 *
 */
public class P997 {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		long start = System.currentTimeMillis();
		System.out.println(solution.findJudge(2,new int[][] {{1,2}}) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.findJudge(3,new int[][] {{1,3},{2,3}}) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.findJudge(3,new int[][] {{1,3},{2,3},{3,1}}) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.findJudge(3,new int[][] {{1,2},{2,3}}) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.findJudge(4,new int[][] {{1,3},{1,4},{2,3},{2,4},{4,3}}) + " -> " + (System.currentTimeMillis()-start) + "ms");
	}
	
	private static class Solution {
		
	    public int findJudge(int N, int[][] trust) {
	    	if (trust.length < N-1) return -1;
	    	int[] trust_idx = new int[N+1];
	    	int[] judge_idx = new int[N+1];
	    	for (int[] pair : trust) {
	    		trust_idx[pair[1]] += 1;
	    		judge_idx[pair[0]] = 1;
	    	}
	    	for (int i=1;i<=N;i++) {
	    		if (trust_idx[i] == N-1 && judge_idx[i] == 0) {
	    			return i;
	    		}
	    	}
	        return -1;
	    }
	    
	}

}
