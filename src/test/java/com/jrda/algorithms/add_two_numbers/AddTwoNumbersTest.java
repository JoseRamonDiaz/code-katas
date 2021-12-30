package com.jrda.algorithms.add_two_numbers;

import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void testExample1() {
        AddTwoNumbers.ListNode listNode = new AddTwoNumbers.ListNode(2, new AddTwoNumbers.ListNode(4, new AddTwoNumbers.ListNode(3)));
        AddTwoNumbers.ListNode listNode1 = new AddTwoNumbers.ListNode(5, new AddTwoNumbers.ListNode(6, new AddTwoNumbers.ListNode(4)));

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(listNode, listNode1);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    public void testExample2() {
        AddTwoNumbers.ListNode listNode = new AddTwoNumbers.ListNode(0);
        AddTwoNumbers.ListNode listNode1 = new AddTwoNumbers.ListNode(0);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        assertEquals(0, addTwoNumbers.addTwoNumbers(listNode, listNode1).val);
    }

    @Test
    public void testExample3() {
        AddTwoNumbers.ListNode listNode = new AddTwoNumbers.ListNode(9, new AddTwoNumbers.ListNode(9, new AddTwoNumbers.ListNode(9, new AddTwoNumbers.ListNode(9, new AddTwoNumbers.ListNode(9, new AddTwoNumbers.ListNode(9, new AddTwoNumbers.ListNode(9)))))));
        AddTwoNumbers.ListNode listNode1 = new AddTwoNumbers.ListNode(9, new AddTwoNumbers.ListNode(9, new AddTwoNumbers.ListNode(9, new AddTwoNumbers.ListNode(9))));

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(listNode, listNode1);
        assertEquals(8, result.val);
        assertEquals(9, result.next.val);
        assertEquals(9, result.next.next.val);
        assertEquals(9, result.next.next.next.val);
        assertEquals(0, result.next.next.next.next.val);
        assertEquals(0, result.next.next.next.next.next.val);
        assertEquals(0, result.next.next.next.next.next.next.val);
        assertEquals(1, result.next.next.next.next.next.next.next.val);
    }
}