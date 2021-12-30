package com.jrda.algorithms.add_two_numbers;

public class AddTwoNumbers {
    private boolean carry = false;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if ((l1 == null || l1.next == null) && (l2 == null || l2.next == null) && !carry && willNotHaveCarry(l1 == null ? 0 : l1.val, l2 == null ? 0 : l2.val)) {
            return new ListNode(sum(l1, l2));
        } else {
            boolean isL1Null = l1 == null;
            boolean isL2Null = l2 == null;

           ListNode nextL1 = l1 != null ? l1.next : null;
           ListNode nextL2 = l2 != null ? l2.next : null;

            if ((isL1Null || l1.next == null) && (isL2Null || l2.next == null) && (!isL1Null && !isL2Null) && willNotHaveCarry(l1 == null ? 0 : l1.val, l2 == null ? 0 : l2.val))
                return new ListNode(sum(l1, l2));
             else
                return new ListNode(sum(l1, l2), addTwoNumbers(l1 != null ? l1.next : null, l2 != null ? l2.next : null));
        }

    }

    private boolean willNotHaveCarry(int val, int val1) {
       return val + val1 <= 9;
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
