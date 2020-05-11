package com.devrogar.leetcode;

import java.util.Arrays;

/**
 * 
 * {@link https://leetcode.com/problems/flood-fill/}
 * 
 * @author Rohit G
 *
 */
public class P733 {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		long start = System.currentTimeMillis();
		System.out.println(Arrays.deepToString(solution.floodFill(new int[][] {{1,1,1},{1,1,0},{1,0,1}}, 1, 1, 2)) + " -> " + (System.currentTimeMillis()-start) + "ms");
	}
	
	private static class Solution {
		
		int source = -1;
		int[][] visited = null;
		
	    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
	    	if (source == -1) source = image[sr][sc];
	    	if (visited == null) visited = new int[image.length][image[0].length];
	    	if (sr >=0 && sr< image.length && sc >=0 && sc < image[0].length && visited[sr][sc] == 0 && image[sr][sc] == source) {
	    		if (visited[sr][sc] == 0) { visited[sr][sc] = 1; image[sr][sc] = newColor; }
	    		floodFill(image,sr-1,sc,newColor);
	    		floodFill(image,sr+1,sc,newColor);
	    		floodFill(image,sr,sc-1,newColor);
	    		floodFill(image,sr,sc+1,newColor);
	    	}
	        return image;
	    }
	    
	}

}
