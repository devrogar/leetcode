package com.devrogar.leetcode.util;

import com.devrogar.leetcode.model.ListNode;

/**
 * 
 * @author Rohit G
 *
 */
public class U {
	
	/**
	 * 
	 * @param input - Comma separated integers
	 * @return {@link ListNode}
	 */
	public static ListNode createListNode(String input) {
		String[] vals = input.split(",");
		ListNode root = null;
		for (String val : vals) {
			if (root == null) {
				root = new ListNode(Integer.valueOf(val));
				continue;
			}
			root.add(val);
		}
		return root;
	}

}
