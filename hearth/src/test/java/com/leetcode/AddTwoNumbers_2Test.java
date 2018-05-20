package com.leetcode;

import org.junit.Before;
import org.junit.Test;

public class AddTwoNumbers_2Test {

    private AddTwoNumbers_2 target;

    @Before
    public void setUp() {
        target = new AddTwoNumbers_2();
    }

    @Test
    public void addTwoNumber_baseTest() {
        AddTwoNumbers_2.ListNode l1 = target.new ListNode(2);
        l1.next = target.new ListNode(4);
        l1.next.next = target.new ListNode(3);

        AddTwoNumbers_2.ListNode l2 = target.new ListNode(5);
        l2.next = target.new ListNode(6);
        l2.next.next = target.new ListNode(4);

        target.addTwoNumbersFirstApproach(l1, l2);
    }

    @Test
    public void addTwoNumbers_longNumber() {
        AddTwoNumbers_2.ListNode l1 = newListNode(new int[]{9});
        AddTwoNumbers_2.ListNode l2 = newListNode(new int[]{1,9,9,9,9,9,9,9,9,9});

        target.addTwoNumbersFirstApproach(l1, l2);
    }

    private AddTwoNumbers_2.ListNode newListNode(int[] numbers) {

        AddTwoNumbers_2.ListNode l = new AddTwoNumbers_2().new ListNode(-1);

        AddTwoNumbers_2.ListNode tail = l;

        for (int i = 0; i < numbers.length; i++) {
            tail.next = target.new ListNode(numbers[i]);
            tail = tail.next;
        }
        return l.next;
    }
}
