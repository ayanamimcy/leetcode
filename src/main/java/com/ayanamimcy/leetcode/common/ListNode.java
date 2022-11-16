package com.ayanamimcy.leetcode.common;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ListNode<T> {

	private T val;

	private ListNode<T> next;

	public ListNode(T val, ListNode<T> next) {
		super();
		this.val = val;
		this.next = next;
	}

	public ListNode(T val) {
		super();
		this.val = val;
	}

	public ListNode() {
		super();
	}

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}

	public ListNode<T> getNext() {
		return next;
	}

	public void setNext(ListNode<T> next) {
		this.next = next;
	}

}
