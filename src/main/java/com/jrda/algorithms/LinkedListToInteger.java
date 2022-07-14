package com.jrda.algorithms;

import java.util.Stack;

public class LinkedListToInteger {
	
	 public int getDecimalValue(ListNode head) {
		Stack<Integer> s = new Stack<>();
	    ListNode n = head;
	    
	    while (n != null) {
	    	s.push(n.val);
	    	n = n.next;
	    }
	     
	    int c = 0;
	    int sum = 0;
	    
	    while (!s.isEmpty()) {
	    	sum += s.pop() * Math.pow(2, c);
	    	c++;
	    }
		 
		 return sum;
	 }

	public static class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
}
