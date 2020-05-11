package com.devrogar.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 
 * {@link https://leetcode.com/problems/two-sum/}
 * 
 * @author Rohit G
 *
 */
public class P1 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		long start = System.currentTimeMillis();
		System.out.println(Arrays.toString(solution.twoSum(new int[] {2, 7, 11, 15}, 9)) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(Arrays.toString(solution.twoSum(new int[] {11, 2, 3, 15, 7}, 9)) + " -> " + (System.currentTimeMillis()-start) + "ms");
		start = System.currentTimeMillis();
		System.out.println(Arrays.toString(solution.twoSum(new int[] {3, 2, 4}, 6)) + " -> " + (System.currentTimeMillis()-start) + "ms");
	}

	private static class Solution {

		public int[] twoSum(int[] nums, int target) {
			HashMap<Integer, Integer> map = new HashMap<>();
			for (int i=0;i<nums.length;i++) {
				if (map.containsKey(target - nums[i])) {
					return new int[] {map.get(target - nums[i]), i};
				}
				map.put(nums[i], i);
			}
			return null;
		}

	}

}
