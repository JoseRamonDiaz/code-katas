package com.jrda.algorithms.add_two_numbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AddTwoNumbersTest {
    @Test
    public void testSingleVal() {
        AddTwoNumbers.ListNode listNode = new AddTwoNumbers.ListNode();
        listNode.val = 3;

        AddTwoNumbers.ListNode listNode1 = new AddTwoNumbers.ListNode();
        listNode1.val = 2;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(listNode, listNode1);
        assertNotNull(result);
        assertEquals(5, result.val);

        listNode1.val = 1;
        assertEquals(4, addTwoNumbers.addTwoNumbers(listNode, listNode1).val);
    }

    @Test
    public void testCarry() {
        AddTwoNumbers.ListNode listNode = new AddTwoNumbers.ListNode();
        listNode.val = 5;

        AddTwoNumbers.ListNode listNode1 = new AddTwoNumbers.ListNode();
        listNode1.val = 5;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(listNode, listNode1);
        assertEquals(0, result.val);
        assertEquals(1, result.next.val);
    }

    @Test
    public void testMultiVal() {
        AddTwoNumbers.ListNode listNode = new AddTwoNumbers.ListNode();
        listNode.val = 3;

        AddTwoNumbers.ListNode listNode1 = new AddTwoNumbers.ListNode();
        listNode1.val = 2;

        AddTwoNumbers.ListNode listNode2 = new AddTwoNumbers.ListNode();
        listNode2.val = 4;
        listNode1.next = listNode2;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(listNode, listNode1);
        assertEquals(5, result.val);
        assertNotNull(result.next);
        assertEquals(4, result.next.val);
    }
}