package com.devrogar.leetcode;

/**
 * 
 * {@link https://leetcode.com/problems/search-insert-position/}
 * 
 * @author Rohit G
 *
 */
public class P35 {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		long start = System.currentTimeMillis();
		System.out.println(solution.searchInsert(new int[] {1,3,5,6},5) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.searchInsert(new int[] {1,3,5,6},2) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.searchInsert(new int[] {1,3,5,6},7) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.searchInsert(new int[] {1,3,5,6},0) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.searchInsert(new int[] {1},1) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.searchInsert(new int[] {1,3},3) + " -> " + (System.currentTimeMillis()-start) + "ms");
	}
	
	private static class Solution {
	    public int searchInsert(int[] nums, int target) {
	    	if (nums == null || nums.length==0) return 0;
	    	if (target <= nums[0]) return 0;
	    	if (target == nums[nums.length-1]) return nums.length-1;
	    	if (target > nums[nums.length-1]) return nums.length;
	    	int l = 0;
	    	int r = nums.length-1;
	    	while(l<r) {
	    		if (r-l == 1) return r;
	    		int mid = (l+r)/2;
	    		if (target > nums[mid]) {
	    			l = mid;
	    		}
	    		if (target < nums[mid]) {
	    			r = mid;
	    		}
	    		if (target == nums[mid]) {
	    			return mid;
	    		}
	    	}
	        return r-l;
	    }
	}

}