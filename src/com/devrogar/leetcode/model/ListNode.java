package com.devrogar.leetcode.model;

/**
 * 
 * @author Rohit G
 *
 */
public class ListNode {
	
	private int val;
	private ListNode next;

	public ListNode(int val) {
		this.setVal(val);
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}
	
	public void add(String val) {
		ListNode node = this;
		while (node.getNext() != null) {
			node = node.getNext();
		}
		node.setNext(new ListNode(Integer.valueOf(val)));
	}

	public void print() {
		ListNode node = this;
		while (node != null) {
			System.out.print(node.getVal());
			node = node.getNext();
			if (node != null)
				System.out.print(" -> ");
		}
		System.out.println();
	}
}