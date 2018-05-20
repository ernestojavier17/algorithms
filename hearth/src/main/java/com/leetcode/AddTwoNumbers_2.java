package com.leetcode;

import java.math.BigInteger;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 * order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers_2 {


    public ListNode addTwoNumbersFirst(ListNode l1, ListNode l2) {

        return null;

    }

    public ListNode addTwoNumbersFirstApproach(ListNode l1, ListNode l2) {

        String l1String = reverse(getStringVal(l1));
        String l2String = reverse(getStringVal(l2));

        BigInteger val1 = new BigInteger(l1String);
        BigInteger val2 = new BigInteger(l2String);
        BigInteger res = val1.add(val2);

        String resString = reverse(String.valueOf(res));

        int[] values = toIntArray(resString);

        ListNode first = new ListNode(-1);
        ListNode tail = first;
        for (int i = 0; i < values.length; i++) {
            tail.next = new ListNode(values[i]);
            tail = tail.next;
        }

        return first.next;
    }

    private String getStringVal(ListNode l) {
        String list = "";

        do {
            list += l.val;
            l = l.next;
        } while (l != null);

        return list;
    }

    private int[] toIntArray(String s) {
        int[] a = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            a[i] = Character.getNumericValue(s.charAt(i));
        }

        return a;
    }

    private String reverse(String s) {
        char[] r = s.toCharArray();
        char aux;
        for (int i = 0; i < r.length / 2; i++) {
            aux = r[i];
            int last = r.length -1 -i;
            r[i] = r[last];
            r[last] = aux;
        }
        return new String(r);
    }


    public class ListNode {
      int val;

      ListNode next;

      ListNode(int x) {
          val = x;
      }
    }
}
