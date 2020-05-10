package com.devrogar.leetcode;

/**
 * 
 * {@link https://leetcode.com/problems/maximum-subarray/}
 * 
 * @author Rohit G
 *
 */
public class P53 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		long start = System.currentTimeMillis();
		System.out.println(solution.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.maxSubArray(new int[] {8,-19,5,-4,20}) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.maxSubArray(new int[] {-2,1}) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.maxSubArray(new int[] {-1}) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.maxSubArray(new int[] {-2,-1}) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.maxSubArray(new int[] {1}) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.maxSubArray(new int[] {0}) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(solution.maxSubArray(new int[] {-1,-2}) + " -> " + (System.currentTimeMillis()-start) + "ms");
	}

	private static class Solution {

		public int maxSubArray(int[] nums) {
			int max = Integer.MIN_VALUE;
			int sum = 0;
			for (int i=0;i<nums.length;i++) {
				sum+=nums[i];
				if (nums[i] > sum) sum = nums[i];
				if (sum > max) max = sum;
			}
			return max;
		}
		
	}

}
