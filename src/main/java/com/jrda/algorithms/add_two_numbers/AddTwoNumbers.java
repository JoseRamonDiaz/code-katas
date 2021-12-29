package com.jrda.algorithms.add_two_numbers;

public class AddTwoNumbers {
    private boolean carry = false;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = l1.val + l2.val;

        if (val > 9) {
            carry = true;
        }

        //use only the right digit
        if (carry)
            val = val - 10;

        ListNode result = new ListNode(val);
        ListNode lastResult = result;

         while (l1 != null || l2 != null) {
             l1 = l1 != null ? l1.next : null;
             l2 = l2 != null ? l2.next : null;

            lastResult.next = new ListNode(sum(l1, l2));
            lastResult = lastResult.next;
         }

        return result;
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
