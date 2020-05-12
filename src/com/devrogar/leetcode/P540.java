package com.devrogar.leetcode;

/**
 * 
 * {@link https://leetcode.com/problems/single-element-in-a-sorted-array/}
 * 
 * @author Rohit G
 *
 */
public class P540 {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		long start = System.currentTimeMillis();
		System.out.println(solution.singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8}) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.singleNonDuplicate(new int[] {3,3,7,7,10,11,11}) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.singleNonDuplicate(new int[] {3,3,7}) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.singleNonDuplicate(new int[] {10,11,11}) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.singleNonDuplicate(new int[] {3}) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.singleNonDuplicate(new int[] {3,3}) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.singleNonDuplicate(new int[] {3,3,2,4,4}) + " -> " + (System.currentTimeMillis()-start) + "ms");
	}
	
	private static class Solution {
	    public int singleNonDuplicate(int[] nums) {
	    	if (nums.length == 1) return nums[0];
	    	int i = 0;
	    	int j = nums.length-1;
	    	while(i<=j) {
	    		if (nums[i] == nums[i+1] && nums[j] == nums[j-1]) {
	    			i+=2;
	    			j-=2;
	    		} else {
	    			return (nums[i] != nums[i+1])?nums[i]:nums[j];
	    		}
	    	}
	    	return -1;
	    }
	}

}
