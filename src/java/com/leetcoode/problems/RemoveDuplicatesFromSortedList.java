package com.leetcoode.problems;

public class RemoveDuplicatesFromSortedList {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int v) {
            val = v;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode nxt = head.next;
        while (nxt != null) {
            if (nxt.val != pre.val) {
                pre.next = nxt;
                nxt = nxt.next;
                pre = pre.next;
            } else {
                nxt = nxt.next;
                if (nxt == null) {
                    pre.next = nxt;
                    break;
                }
            }
        }
        return head;
    }
}
