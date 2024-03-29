package com.jrda.algorithms.add_two_numbers;

public class AddTwoNumbers {
    private boolean carry = false;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null && !carry)
            return null;
        else
            return new ListNode(sum(l1, l2), addTwoNumbers(l1 != null ? l1.next : null, l2 != null ? l2.next : null));
    }

    private int sum(ListNode l1, ListNode l2) {
        int num1 = l1 != null ? l1.val : 0;
        int num2 = l2 != null ? l2.val : 0;

        int val = num1 + num2 + (carry ? 1 : 0);

        carry = val > 9;

        //use only the right digit
        if (carry)
            val = val - 10;

        return val;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
